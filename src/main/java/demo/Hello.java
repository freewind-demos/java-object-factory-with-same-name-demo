package demo;

import static demo.User.User;

public class Hello {

    public static void main(String[] args) {
        User user1 = new User("user1");
        System.out.println(user1.name);

        User user2 = User("user2");
        System.out.println(user2.name);
    }

}
