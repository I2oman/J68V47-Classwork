import java.util.Scanner;

public class Lesson3Exercise3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Loan amount: £");
        double l = cs.nextDouble();
        System.out.print("Interest Rare (APR %): ");
        double j = cs.nextDouble() / 100.0 / 12.0;
        System.out.print("Number of year: ");
        double n = cs.nextDouble() * 12.0;
        double m = l * (j / (1.0 - Math.pow((1.0 + j), -n)));
        System.out.print("Monthly payment for this loan = £ " + m);
    }
}
