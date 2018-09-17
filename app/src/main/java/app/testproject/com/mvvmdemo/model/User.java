package app.testproject.com.mvvmdemo.model;

public class User {
    
    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;
    
    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
    
    public String getEmailHint() {
        return emailHint;
    }
    
    public String getPasswordHint() {
        return passwordHint;
    }
}
