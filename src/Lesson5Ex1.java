import java.util.Scanner;

public class Lesson5Ex1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input a base number: ");
        int base = cs.nextInt();
        for (int i = 1; i < 13; i++) {
            System.out.println(base+" x "+i+" = "+i*base);
        }
    }
}
