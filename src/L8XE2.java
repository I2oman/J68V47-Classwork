public class L8XE2 {
    public static void main(String[] args) {
        int[] scores = {24, 56, 44, 28, 66, 78, 55, 77, 81, 18};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("The average score is: " + averageScore(scores));
        System.out.println("The minimum score is: " + minimumScore(scores));
        System.out.println("The maximum score is: " + maximumScore(scores));
    }

    private static double averageScore(int[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.println(scores[i]);
        }
        return sum / scores.length;
    }

    private static int minimumScore(int[] scores) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    private static int maximumScore(int[] scores) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
}
