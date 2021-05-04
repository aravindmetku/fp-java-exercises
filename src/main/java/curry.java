import java.util.function.*;

// Tested with JDK 1.8.0-ea-b75
public class CurryingAndPartialFunctionApplication
{
   public static void main(String[] args)
   {
      IntBinaryOperator simpleAdd = (a, b) -> a + b;
      IntFunction<IntUnaryOperator> curriedAdd = a -> b -> a + b;

      // Demonstrating simple add:
      System.out.println(simpleAdd.applyAsInt(4, 5));

      // Demonstrating curried add:
      System.out.println(curriedAdd.apply(4).applyAsInt(5));

      // Curried version lets you perform partial application:
      IntUnaryOperator adder5 = curriedAdd.apply(5);
      System.out.println(adder5.applyAsInt(4));
      System.out.println(adder5.applyAsInt(6));
   }
}