package services;

import data.model.Users;
import data.repository.UserRepository;

import java.util.HashMap;

public class UserServiceImpl implements  UserServices{
    private final UserRepository userRepository = new UserRepository();
    Users  users = new Users();
    private final HashMap<String , Users> userList = new HashMap<>();

    @Override
    public Users registerUser(String firstName, String lastName,  String password, String email) {
        Users users = new Users();
        users.setfName(firstName);
        users.setlName(lastName);
            if (userRepository.findByKey(email) != null )throw new IllegalArgumentException("email already exist, can't duplicate an already existing email ");
            else {
                users.setEmail(email);
                users.setPassword(password);
                return userRepository.saveUser(users);
            }

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
}
