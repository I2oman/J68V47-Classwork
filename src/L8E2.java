public class L8E2 {
    public static void main(String[] args) {
        int[] scores = {24, 56, 44, 28, 66, 78, 55, 77, 81, 18};
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.println(scores[i]);
        }
        System.out.println("The average score is: " + (sum / scores.length));
    }
}
