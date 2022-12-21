package data.model;

public class Users {
    private  String fName;
    private String lName;
    private String fNumber;

    private String password;
    private String email;


    public Users(String fName, String lName, String fNumber,  String password, String email) {
        this.fName = fName;
        this.lName = lName;
        this.fNumber = fNumber;
        this.password = password;
        this.email = email;
    }
    public Users(){}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users(String fName, String lName, String password, String email) {
        this.fName = fName;
        this.lName = lName;
        this.fNumber = fNumber;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", fNumber='" + fNumber + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
