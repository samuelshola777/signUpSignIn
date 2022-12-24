package controller;

import data.model.Users;
import data.repository.UserRepository;
import dtos.requests.LoginRequest;
import dtos.requests.RegisterRequest;
import dtos.responses.LoginReponse;
import dtos.responses.RegisterResponce;
import services.UserServiceImpl;
import services.UserServices;

public class UserController {
 UserServices userServices = new UserServiceImpl();
 UserRepository userRepository = new UserRepository();

 public RegisterResponce registerUser(RegisterRequest registerRequest){
         return    userServices.registerUser(registerRequest);
 }
 public Users findByEmail(String emil, String password){
     if (password.equals(userRepository.findByKey(emil).getPassword()))
     return userServices.findByEmail(emil, password);
     else {
         return null;
     }
         }
 public String deleteByEmail(String email){
     userServices.deleteByEmail(email);
     return "delete successfully";
        }
public LoginReponse login(LoginRequest loginRequest){
  return  userServices.login(loginRequest);
}
}
