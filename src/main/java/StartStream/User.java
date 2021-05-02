package StartStream;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class User {
    String name;
    boolean active;

    boolean activeUser() {
        return this.active && this.getName().startsWith("A");
    }
}
