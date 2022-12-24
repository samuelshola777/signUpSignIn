package dtos.requests;

public class ChangePasswordRequest {
    private String oldPassword;
    private String newPassword;
    private  String email;

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getEmail() {
        return email;
    }
}
