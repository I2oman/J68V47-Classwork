import java.util.Scanner;

public class L8XE1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("The number of items in the array is: " + names.length);
    }
}
