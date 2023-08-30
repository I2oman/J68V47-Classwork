import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        FileWriter fw = new FileWriter("output.txt");
        String[] numbers = bf.readLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        System.out.println(a + b);
        fw.write(String.valueOf(a+b));
        fw.close();
    }
}