public class myExp {
    
    // Part 1: Calculate e^x using the first n terms of the series
    public static double myexp(double x, int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
    }
    
    // Factorial method
    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Part 2: More efficient version that doesn't use Math.pow or factorial
    public static double myexpEfficient(double x, int n) {
        double sum = 0.0;
        double term = 1.0;  // First term is 1
        
        for (int i = 0; i < n; i++) {
            sum += term;
            term = term * x / (i + 1);  // Calculate next term based on current term
        }
        
        return sum;
    }
    
    // Part 3: Method to check results
    public static void check(double x, int n) {
        System.out.println(x + "\t" + myexpEfficient(x, n) + "\t" + Math.exp(x));
    }
    
    public static void main(String[] args) {
        // Part 4: Test with different numbers of terms for x = 1.0
        System.out.println("Testing different numbers of terms for x = 1.0:");
        for (int n = 1; n <= 20; n++) {
            System.out.println("Terms: " + n + "\t" + myexpEfficient(1.0, n) + "\t" + Math.exp(1.0));
        }
        
        // Part 5: Testing with positive values
        System.out.println("\nTesting with positive values:");
        check(0.1, 20);
        check(1.0, 20);
        check(10.0, 100);
        check(100.0, 1000);
        
        // Part 6: Testing with negative values
        System.out.println("\nTesting with negative values:");
        check(-0.1, 20);
        check(-1.0, 20);
        check(-10.0, 100);
        check(-100.0, 1000);
    }
}
