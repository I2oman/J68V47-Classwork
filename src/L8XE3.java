import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L8XE3 {
    public static List<String> directions = new ArrayList<String>(Arrays.asList(
            "Start by exiting the building you are currently in and turning left onto the main road.",
            "Walk down the road for two blocks until you reach the traffic lights.",
            "At the traffic lights, turn right onto Oak Street.",
            "Follow Oak Street for one block then turn left onto Elm Street.",
            "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
            "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
            "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSteps();
        while (true) {
            showMenu();
            System.out.print("Your choice > ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("***Add direction***\nPosition > ");
                    int p = sc.nextInt();
                    System.out.print("Direction > ");
                    String d = sc.nextLine();
                    d = sc.nextLine();
                    addStep(p, d);
                    System.out.println("***Result***");
                    printSteps();
                }
                case 2 -> {
                    System.out.print("***Remove direction***\nPosition > ");
                    int p = sc.nextInt();
                    removeStep(p);
                    System.out.println("***Result***");
                    printSteps();
                }
                case 3 -> {
                    System.out.println("***Bye***");
                    System.exit(0);
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println(
                "***Menu***\n" +
                        "1. Add direction (position, direction)\n" +
                        "2. Remove direction (position)\n" +
                        "3. Exit"
        );
    }

    private static void printSteps() {
        for (int i = 0; i < directions.size(); i++) {
            System.out.println((i + 1) + ". " + directions.get(i));
        }
        System.out.println();
    }

    private static void addStep(int position, String direction) {
        directions.add(position - 1, direction);
    }

    private static void removeStep(int position) {
        directions.remove(position - 1);
    }
}
