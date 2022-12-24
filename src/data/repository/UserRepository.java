package data.repository;

import data.model.Users;
import dtos.requests.LoginRequest;
import dtos.responses.LoginReponse;

import java.util.HashMap;

public class UserRepository {
    private final HashMap<String , Users> userList = new HashMap<>();

    public Users saveUser(Users users){
        userList.put(users.getEmail(), users);
        return users;
    }
    public Users findByKey(String email){
        return  userList.get(email);
    }
    public Users deleteByKey(String email){
  return userList.remove(email);
    }

    public Users login(LoginRequest loginRequest){
        if (loginRequest.getPassWord().equals(userList.get(loginRequest.getEmail()).getPassword()))  return userList.get(loginRequest.getEmail());
        else {
            return null;
        }
    }
    public String changeFirstName(String firstName, String email){
        findByKey(email).setfName(firstName);
        return "first name changed succefully";
    } public String changeLastName(String lastName, String email){
        findByKey(email).setlName(lastName);
        return "last name changed succefully";
    }

   public String changePassword(String email, String newPassword){
        findByKey(email).setPassword(newPassword);
        return "password succefully ";
   }

}
