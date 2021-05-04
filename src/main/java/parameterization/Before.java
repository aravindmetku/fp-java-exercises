package parameterization;

public class Before {

    public static int sum(int n) {
        int p = 0;
        for (int i = 1; i <= n; i++) { // repetition
            p = p + i;
        }
        return p;
    }


    public static int product(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) { // repetition
            p = p * i;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(product(10));
    }
}
