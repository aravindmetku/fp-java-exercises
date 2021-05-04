import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.util.Locale;

/*
 * todo: Add example
 * */
public class ex1 {
    public static void main(String[] args) {
        // add your example
        Tuple2<String, Integer> java8 = Tuple.of("Java", 8);

        Tuple2<String, Integer> map1 = java8.map1(d -> d.toUpperCase(Locale.ROOT));

        System.out.println(java8);
        System.out.println(map1);
    }
}
