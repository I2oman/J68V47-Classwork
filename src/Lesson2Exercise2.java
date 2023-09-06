import java.util.Scanner;

public class Lesson2Exercise2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int a = cs.nextInt();
        System.out.print("What is the second number? ");
        int b = cs.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(float) a/b);
        System.out.println(a+"%"+b+"="+(a%b));
        System.out.println(a+"^"+b+"="+(int) Math.pow(a,b));
    }
}
