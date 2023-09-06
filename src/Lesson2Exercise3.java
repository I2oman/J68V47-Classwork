import java.util.Scanner;

public class Lesson2Exercise3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        String[] names = new String[3];
        float[] prices = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            names[i] = cs.next();
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            prices[i] = cs.nextFloat();
        }

        System.out.println("NESMART");
        float sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("%-16s£%.2f", names[i], prices[i]).replace(' ', '.'));
            sum += prices[i];
        }
        System.out.println(String.format("%-12s£%.2f", "SUBTOTAL", sum).replace(' ', '.'));
    }
}
