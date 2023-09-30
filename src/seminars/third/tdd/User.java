package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin =isAdmin;
        this.isAuthenticate = false;
    }
    public boolean isAdmin(){
        return isAdmin;
    }

    public boolean isAuthenticate(){
        return isAuthenticate;
    }

    public void isAuthenticateIn(){
        isAuthenticate = true;

    }
    public void  isAuthenticateOut(){
         isAuthenticate = false;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

}