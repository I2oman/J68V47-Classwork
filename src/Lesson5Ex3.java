import java.util.Scanner;

public class Lesson5Ex3 {
    public static void main(String[] args) {
        int score = 0;
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
                score++;
            } else if (operation == 1 && a - b == ans) {
                System.out.println("Correct!!!");
                score++;
            } else if (operation == 2 && a * b == ans) {
                System.out.println("Correct!!!");
                score++;
            } else {
                System.out.println("Wrong");
            }
        }
        System.out.println("Your total score is: "+score);
    }
}
