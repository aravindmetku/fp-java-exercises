package StartStream;

import static utils.User.allUsers;

import java.util.ArrayList;
import java.util.List;
import utils.User;

public class Before {


    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        for (User user : allUsers) {
            if (user.isActive() && user.getName().startsWith("A")) {
                userList.add(user);
            }
        }

        System.out.println("userList = " + userList);
    }
}
