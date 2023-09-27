import java.math.BigInteger;
import java.util.Scanner;

public class Lesson5ExtraA {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
