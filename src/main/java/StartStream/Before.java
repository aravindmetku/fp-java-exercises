package StartStream;

import java.util.ArrayList;
import java.util.List;

public class Before {

    static List<User> allUsers = List.of(
            User.builder().active(false).name("Abc").build(),
            User.builder().active(true).name("Bdb").build(),
            User.builder().active(true).name("kab").build(),
            User.builder().active(true).name("Aoo").build()
    );

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        for (User user : allUsers) {
            if (user.active && user.getName().startsWith("A")) {
                userList.add(user);
            }
        }

        System.out.println("userList = " + userList);
    }
}
