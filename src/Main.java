import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        keyInput();
        fileInput();
    }

    private static void keyInput() {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        System.out.println(a + b);
    }

    private static void fileInput() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String[] numbers = bf.readLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        pw.println(a + b);
        pw.close();
    }
}