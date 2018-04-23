package models.users;

//back the login form
public class Login {

    private String email;
    private String password;

    //validtate method
    //after base login submitted
    public String validate() {

        //call static auth method in user
        if (User.authenticate(getEmail(), getPassword()) == null){
            return "Invalid user or password";
        }
        return null;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}