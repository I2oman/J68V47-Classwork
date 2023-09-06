import java.io.*;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String word = bf.readLine();
        int times = 5;
        try {
            times = Integer.parseInt(bf.readLine());
        } catch (Exception e) {
        }

        for (int k = 0; k < times; k++) {
            int[] positions = new int[word.length()];
            for (int i = 0; i < positions.length; i++) {
                positions[i] = -1;
            }
            for (int i = 0; i < word.length(); i++) {
                while (true) {
                    int number = (int) (Math.random() * (word.length()));
                    boolean dublicate = false;
                    for (int j = 0; j < positions.length; j++) {
                        if (positions[j] == number) {
                            dublicate = true;
                            break;
                        }
                    }
                    if (!dublicate) {
                        positions[i] = number;
                        break;
                    }
                }
            }
            for (int i = 0; i < word.length(); i++) {
                pw.print(word.charAt(positions[i]));
            }
            pw.println();
        }

        pw.close();
    }
}
