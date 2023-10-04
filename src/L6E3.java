import java.util.Scanner;

public class L6E3 {
    public static void main(String[] args) {
        int score = 10;
        for (int round = 1; round < 11; round++) {
            int a = (int) (Math.random() * (10));
            int b = (int) (Math.random() * (10));
            int operation = (int) (Math.random() * (3));
            String[] operators = {"+", "-", "*"};
            String operator = operators[operation];
            System.out.println("Round " + round + " your score is: " + score);
            System.out.print(a + " " + operator + " " + b + " = ");
            Scanner cs = new Scanner(System.in);
            int ans = cs.nextInt();
            if (operation == 0 && a + b == ans) {
                System.out.println("Correct!!!");
            } else if (operation == 1 && a - b == ans) {
                System.out.println("Correct!!!");
            } else if (operation == 2 && a * b == ans) {
                System.out.println("Correct!!!");
            } else {
                System.out.println("Wrong");
                score--;
            }
        }
        if (score == 10) {
            System.out.println("Well done");
        } else {
            System.out.println("Your score is: " + score);
        }
    }
}
