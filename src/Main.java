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
        FileWriter fw = new FileWriter("output.txt");
        String[] numbers = bf.readLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        fw.write(String.valueOf(a+b));
        fw.close();
    }
}