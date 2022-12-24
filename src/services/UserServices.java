package services;

import data.model.Users;
import dtos.requests.LoginRequest;
import dtos.requests.RegisterRequest;
import dtos.responses.RegisterResponce;
import exception.signUpSigninExection.signUpSignin;


public interface UserServices {
    RegisterResponce registerUser(RegisterRequest registerRequest);
    Users findByEmail(String email, String password);
    void deleteByEmail(String emil);
  Users login (LoginRequest loginRequest) throws signUpSignin;
}
