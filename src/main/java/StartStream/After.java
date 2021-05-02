package StartStream;

import java.util.List;
import java.util.stream.Collectors;

public class After {

    static List<User> allUsers = List.of(
            User.builder().active(false).name("Abc").build(),
            User.builder().active(true).name("Bdb").build(),
            User.builder().active(true).name("kab").build(),
            User.builder().active(true).name("Aoo").build()
    );

    public static void main(String[] args) {

        List<User> userList = allUsers.stream()
                .filter(User::activeUser)
                .collect(Collectors.toList());

        System.out.println("userList = " + userList);
    }
}
