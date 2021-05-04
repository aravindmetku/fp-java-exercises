import java.util.function.Function;

class FunctionTester {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = t -> t * 3;
        Function<Integer, Integer> add = t -> t + 3;
        Function<Integer, Integer> FirstAddThenMultiply  = multiply.compose(add);
        Function<Integer, Integer> FirstMultiplyThenAdd = multiply.andThen(add);
        
        // a.andThen(b) == b.compose(a)
        System.out.println(FirstMultiplyThenAdd.apply(3));
        System.out.println(FirstAddThenMultiply.apply(3));
    }
}
