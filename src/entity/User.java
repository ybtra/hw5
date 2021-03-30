package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password){
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        return getFullName() +  "\n" + "E-mail:" + email;
    }

    public boolean  isPasswordCorrect(String checkPassword){
        return password.equals(checkPassword);
    }
}
