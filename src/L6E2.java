import java.time.LocalTime;
import java.util.Scanner;

public class L6E2 {
    public static void main(String[] args) {
        String[] jokes = {
                "Why did the bicycle fall over?\nBecause it was two-tired!",
                "What do you call a fish with no eyes?\nFsh!",
                "What do you get when you cross a snowman and a vampire?\nFrostbite!",
                "What do you call a bear with no teeth?\nA gummy bear!",
                "Why did the math book look sad?\nBecause it had too many problems!",
                "",
                "",
                "",
                "",
        };
        Scanner cs = new Scanner(System.in);
        System.out.println("Hello");
        while (true) {
            System.out.print("\n1. Say “hello”\n2. Tell me the time\n3. Tell me a joke\n4. Quit\n> ");
            String line = cs.next();
            if (line.equals("1")) {
                System.out.println("Hello");
            } else if (line.equals("2")) {
                LocalTime time = LocalTime.now();
                System.out.println(time.getHour() + ":" + time.getMinute());
            } else if (line.equals("3")) {
                System.out.println(jokes[(int) (Math.random() * (jokes.length))]);
            } else if (line.equals("4") || line.toLowerCase().equals("quit")) {
                break;
            }
        }
    }
}
