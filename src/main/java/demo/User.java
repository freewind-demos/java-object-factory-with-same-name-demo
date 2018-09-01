package demo;

public class User {
    public String name;
    public User(String name) {
        this.name = name;
    }
    public static User User(String name) {
        return new User(name);
    }
}
