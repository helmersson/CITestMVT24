package user;

public class User {
    private String userName;
    private String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String newUserName) {
        userName = newUserName;
    }

    public void setPassWord(String newPassWord) {
        passWord = "hej";
    }
}
