import java.math.BigDecimal;

public class ThirdTask {
    public static void main(String[] args) {
        BigDecimal n = factorial(100);
        System.out.println("factorial is "+n);
        System.out.println("Sum is "+sum(n));
    }
    private static BigDecimal factorial(int n){
        if (n==1) return BigDecimal.valueOf(1);
        return BigDecimal.valueOf(n) .multiply(factorial(n-1));
    }
    private static int sum(BigDecimal n){
        return String.valueOf(n).chars().map(i -> i - '0').sum();

    }
}
