import java.util.Scanner;

public class L9E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String response = scanner.nextLine();

        while (!response.isEmpty()) {
            String character = response.substring(0, 1);
            response = response.substring(1);
            System.out.println(character);
        }
    }
}
