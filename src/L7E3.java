import java.util.Scanner;

public class L7E3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("1. Easy math pboblems\n2.Hard math problems\n3. Quit\n> ");
        int difficulty = cs.nextInt();
        if (difficulty == 3) {
            System.exit(0);
        }
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        while (count <= 10 && lives > 0) {
            int random1 = (int) (Math.random() * (100)) + 1;
            int random2 = (int) (Math.random() * (100)) + 1;
            if (difficulty == 1) {
                userAnswer = askQwestion(random1, random2, difficulty);
                answer = random1 + random2;
            } else if (difficulty == 2) {
                userAnswer = askQwestion(random1, random2, difficulty);
                answer = random1 * random2;
            }
            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
    }

    private static int askQwestion(int number1, int number2, int difficulty) {
        Scanner cs = new Scanner(System.in);
        System.out.print("What is " + number1);
        if (difficulty == 1) {
            System.out.print(" + ");
        } else {
            System.out.print(" * ");
        }
        System.out.println(number2 + "?");
        int userAnswer = cs.nextInt();
        return userAnswer;
    }

    private static int correctAnswer(int score) {
        System.out.println("Correct!");
        score++;
        return score;
    }

    private static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is " + answer);
        lives--;
        System.out.println("You have " + lives + " lives left");
        return lives;
    }

    private static void gameOver(int score, int lives) {
        System.out.println("Game over. Your Score is " + score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }
}
