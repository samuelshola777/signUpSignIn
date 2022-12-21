package data.repository;

import data.model.Users;

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

    public Users login(String email, String password){
        if (password.equals(userList.get(email).getPassword()))  return userList.get(email);
        else {
            return null;
        }
    }

}
