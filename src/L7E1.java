import java.util.Scanner;

public class L7E1 {
    public static void main(String[] args) {
        int option = 0;
        do {
            showMenu();
            option = getOption();
            switch (option){
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("This isn't a valid option. Try a numberbetween 1 and 4.");
                    break;
            }
        } while (option != 4);
    }

    private static void option3() {
        System.out.println("Bonjour\n");
    }

    private static void option2() {
        System.out.println("HELLO\n");
    }

    private static void option1() {
        System.out.println("Hi\n");
    }

    private static int getOption() {
        Scanner cs = new Scanner(System.in);
        return cs.nextInt();
    }

    private static void showMenu() {
        System.out.println("1. Hi;\n2. Hello;\n3. Bonjour;\n4. Bye;\n");
    }
}
