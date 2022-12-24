package dtos.requests;

public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String number;
    private String message;

    public String getMessage() {
        return message;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }
}
