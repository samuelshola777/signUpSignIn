package dtos.requests;

public class LoginRequest {
    private String email;
    private String confirmPassWord;
    private String passWord;
    private String message;

    public String getMessage() {
        return message;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassWord() {
        return passWord;
    }

    public String getConfirmPassWord() {
        return confirmPassWord;
    }
}

