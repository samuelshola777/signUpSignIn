package services;

import data.model.Users;



public interface UserServices {
    Users registerUser(String firstName, String lastName,  String password, String email);
    Users findByEmail(String email, String password);
    void deleteByEmail(String emil);
}
