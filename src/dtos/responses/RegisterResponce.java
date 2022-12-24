package dtos.responses;

public class RegisterResponce {

    private String firstName;
    private String lastName;
    private String email;
    private String message;

   private String password;
   private String number;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
