package dtos.responses;

public class LoginReponse {
 private    String email;
  private   String passWord;
  private String message;

private String confirmPassword;

 public void setConfirmPassword(String confirmPassword) {
  this.confirmPassword = confirmPassword;
 }

 public void setMessage(String message) {
  this.message = message;
 }


 public void setEmail(String email) {
  this.email = email;
 }


 public void setPassWord(String passWord) {
  this.passWord = passWord;
 }
}
