import java.util.Scanner;

public class Lesson2Exercise1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = cs.nextLine();
        System.out.print("Enter your hobby: ");
        String hobby = cs.nextLine();
        System.out.println(name + " loves " + hobby + "in their free time");
        System.out.println("They find it relaxing and satisfying to see their " + hobby + " come to life.");
        System.out.println(hobby + " allows " + name + " to express their creative side.");
    }
}
