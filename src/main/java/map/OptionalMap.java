package map;

import java.util.Optional;
import java.util.function.Function;

public class OptionalMap {

    public static void main(String[] args) {
        Function<String, String> nuller = s -> null;
        Function<String, String> worldy = s -> s + " world";

        Optional.of("Hello").map(nuller).ifPresentOrElse(System.out::println, () -> System.out.println("No value"));
        Optional.of("Hello").map(worldy).ifPresentOrElse(System.out::println, () -> System.out.println("No value"));
    }
}
