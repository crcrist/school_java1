public class sieveOfEratosthenes {
  public static boolean[] sieve(int n) {
    // Create array of size n
    boolean[] isPrime = new boolean[n];
    
    // Initialize all values to true
    for (int i = 0; i < n; i++) {
        isPrime[i] = true;
    }
    
    // 0 and 1 are not prime
    isPrime[0] = false;
    isPrime[1] = false;
    
    // Apply the Sieve of Eratosthenes algorithm
    for (int p = 2; p*p < n; p++) {
        // If p is prime, mark all its multiples as non-prime
        if (isPrime[p] == true) {
            // Start from p*p and mark all multiples of p as false
            for (int multiple = p*p; multiple < n; multiple += p) {
                isPrime[multiple] = false;
            }
        }
    }
    
    return isPrime;
  }
  
  public static void main(String[] args) {
    int n = 100;
    boolean[] primes = sieve(n);
    
    // Print out the results
    System.out.println("Prime numbers up to " + n + ":");
    for (int i = 0; i < n; i++) {
        if (primes[i]) {
            System.out.print(i + " ");
        }
    }
  }
}
