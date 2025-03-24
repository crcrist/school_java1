import java.math.BigInteger;

public class Big {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger pow(int x, int n) {
      if (n == 0) return BigInteger.ONE;
      // find x to the n/2 recursively
      BigInteger t = pow(x, n / 2);
      // if n is even, the result is t squared
      // if n is odd, the result is t squared times x
      if (n % 2 == 0) {
        return t.multiply(t);
      } else {
        return t.multiply(t).multiply(BigInteger.valueOf(x));
      }
    }
      
    public static void main(String[] args) {
    /*    
    System.out.println("Testing factorial limits with BigInteger:");
        
        try {
            // Try increasingly large values
            for (int n = 1000; n <= 100000; n += 1000) {
                long startTime = System.currentTimeMillis();
                BigInteger fact = factorial(n);
                long endTime = System.currentTimeMillis();
                
                System.out.println("factorial(" + n + ") has " + 
                                  fact.toString().length() + " digits");
                System.out.println("Calculation time: " + 
                                  (endTime - startTime) + " ms");
                
                // Optional: if it's taking too long, break
                if (endTime - startTime > 10000) { // 10 seconds
                    System.out.println("Calculations getting too slow, stopping.");
                    break;
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error reached!");
        }
    */

    BigInteger result = pow(2,2);
    System.out.println(result);
    }
}
