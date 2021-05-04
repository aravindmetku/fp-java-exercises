package utils;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String name;
    boolean active;

    public static List<User> allUsers = List.of(
            User.builder().active(false).name("Abc").build(),
            User.builder().active(true).name("Bdb").build(),
            User.builder().active(true).name("kab").build(),
            User.builder().active(true).name("Aoo").build()
    );


    public boolean activeUser() {
        return this.active && this.getName().startsWith("A");
    }
}
