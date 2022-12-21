package controller;

import data.model.Users;
import data.repository.UserRepository;
import services.UserServiceImpl;
import services.UserServices;

public class UserController {
 UserServices userServices = new UserServiceImpl();
 UserRepository userRepository = new UserRepository();

 public Users registerUser(String firstName, String lastName,  String password, String email){
         return    userServices.registerUser(firstName, lastName,   password,  email);
 }
 public Users findByEmail(String emil, String password){
     if (password.equals(userRepository.findByKey(emil).getPassword()))
     return userServices.findByEmail(emil, password);
     else {
         return null;
     }
         }
 public void deleteByEmail(String email){
     userServices.deleteByEmail(email);
        }

}
