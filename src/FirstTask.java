import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        System.out.println(katalanNumbers(n));
    }

    private static long katalanNumbers(int n) {

        return factorial(2 * n) / (factorial(n) * factorial(n + 1)); //get Katalan numbers

    }

    private static long factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }
}
