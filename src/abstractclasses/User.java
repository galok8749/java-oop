package abstractclasses;

public abstract class User {
    private String name;
    private String email;
    private String password;

    private String userType;
    User(String userType) {
        this.userType = userType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

//    void saySomething() {
//        System.out.println("Something");
//    }

    // abstract method must implement by child class else make abstract too
    abstract void saySomething();

    void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
