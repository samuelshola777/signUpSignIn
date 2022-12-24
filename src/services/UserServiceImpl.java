package services;

import data.model.Users;
import data.repository.UserRepository;
import dtos.requests.ChangePasswordRequest;
import dtos.requests.LoginRequest;
import dtos.requests.RegisterRequest;
import dtos.requests.UpdateRequest;
import dtos.responses.LoginReponse;
import dtos.responses.RegisterResponce;
import dtos.responses.UpdatePasswordResponce;
import dtos.responses.UpdateResponce;
import exception.signUpSigninExection.signUpSignin;

import java.util.HashMap;

public class UserServiceImpl implements  UserServices{
    private final UserRepository userRepository = new UserRepository();
    Users  users = new Users();
    private final HashMap<String , Users> userList = new HashMap<>();

    @Override
    public RegisterResponce registerUser(RegisterRequest registerRequest) {
        Users users = new Users(registerRequest.getFirstName(), registerRequest.getLastName(), registerRequest.getEmail(), registerRequest.getPassword());

            if (userRepository.findByKey(registerRequest.getEmail()) != null )throw new IllegalArgumentException("email already exist, can't duplicate an already existing email ");
          RegisterResponce responce  = new RegisterResponce();
            Users savedUser = userRepository.saveUser(users);
          responce.setEmail(savedUser.getEmail());
          responce.setFirstName(savedUser.getfName());
          responce.setLastName(savedUser.getlName());
          responce.setMessage("success");
          return responce;

    }
    public UpdateResponce updatedetails(UpdateRequest updateRequest){
        Users users1 = userRepository.findByKey(updateRequest.getEmail());
        if (updateRequest.getLastName() != null){
            users1.setLName(updateRequest.getLastName());
            Users users2 = new Users();

        }
//        Users users1 = userRepository.findByKey(updateRequest.getEmail());
        if (updateRequest.getFirstName() != null){
            users1.setfName(updateRequest.getFirstName());
        }
        return  new UpdateResponce("update succefully");
    }
    public String twoStepLoginPassword(LoginRequest loginRequest){
        if (!userRepository.findByKey(loginRequest.getEmail()).getPassword().equals(loginRequest.getPassWord()) &&
                userRepository.findByKey(loginRequest.getEmail()).getPassword().equals
                        (loginRequest.getConfirmPassWord()))throw new IllegalArgumentException ("inccrrectPassWord");
//        else {
//            Users users1 = login(loginRequest);
//
//        }
        return "login successfully";
    }
public void updateFirstName(RegisterRequest registerRequest){
        userRepository.findByKey(registerRequest.getEmail()).setEmail(registerRequest.getFirstName());
//        return registerRequest.getMessage();
}

    @Override
    public Users findByEmail(String email, String password) {
        if (password.equals(userList.get(email).getPassword()))  return userList.get(email);
    else {
        return null;
        }
    }

    @Override
    public void deleteByEmail(String emil) {
userList.remove(emil);
    }
    public UpdatePasswordResponce  changePassword(ChangePasswordRequest changePasswordRequest) throws signUpSignin {
        Users use = userRepository.findByKey(changePasswordRequest.getEmail());
                if (use == null){
                    throw new signUpSignin("email does not exist");
                }
                if (changePasswordRequest.getNewPassword() != null){
                    use.setPassword(changePasswordRequest.getNewPassword());
                }
                return  new UpdatePasswordResponce("password changed succefully");
    }

    @Override
    public Users login (LoginRequest loginRequest) throws signUpSignin {
        if (!loginRequest.getPassWord().equals(loginRequest.getConfirmPassWord())){
            throw  new signUpSignin("password mismatch");
        }
        return userRepository.login(loginRequest);
    }


}
