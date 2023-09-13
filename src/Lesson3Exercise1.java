import java.util.Scanner;

public class Lesson3Exercise1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = cs.nextLine();
        System.out.print("Enter your surname: ");
        String surname = cs.nextLine();
        System.out.print("Enter your year of birth YYYY: ");
        String age = cs.nextLine();
        System.out.println(name.charAt(0) + surname.toLowerCase());
        System.out.println(surname.toLowerCase().charAt(0) + name.toUpperCase().substring(0, 3) + age);
    }
}
