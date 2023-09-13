import java.io.*;
import java.util.Scanner;

public class Lesson3Exercise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("countrys.txt"));
        int lines = 0;
        while (bf.readLine() != null) lines++;
        Scanner cs = new Scanner(System.in);
        System.out.print("How many rounds do you want: ");
        int raunds = cs.nextInt();
        cs.nextLine();
        for (int r = 0; r < raunds; r++) {
            int rline = (int) (Math.random() * (lines));
            bf = new BufferedReader(new FileReader("countrys.txt"));

            String country = "";
            String capital = "";

            String line = "";
            for (int i = 0; i <= rline; i++) {
                line = bf.readLine();
                if (i == rline) {
                    String[] larr = line.split("~");
                    country = larr[0];
                    capital = larr[1].toLowerCase();
                }
            }

            System.out.print("Q" + (r + 1) + ". What is the capital of " + country + "? ");
            String ans = cs.nextLine().toLowerCase();

            if (ans.contains(capital)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
