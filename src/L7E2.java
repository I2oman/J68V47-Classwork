import java.util.Scanner;

public class L7E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int c = calculateSum(a, b);
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }

    private static int calculateSum(int a, int b) {
        return a+b;
    }
}
