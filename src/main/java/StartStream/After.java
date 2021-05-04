package StartStream;

import static utils.User.allUsers;

import java.util.List;
import java.util.stream.Collectors;
import utils.User;

public class After {

    public static void main(String[] args) {

        List<User> userList = allUsers.stream()
                .filter(User::activeUser)
                .collect(Collectors.toList());

        System.out.println("userList = " + userList);
    }
}
