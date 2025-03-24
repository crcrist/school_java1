public class areFactors {
  public static boolean areFactors(int n, int[] array) {
    // Create array of size n
    boolean factor = true;
    
    // Initialize all values to true
    for (int value : array) {
        if (n % value != 0)   {
          factor = false;
      }
    }
    return factor;    
  }
    
  
  public static void main(String[] args) {
    int n = 10;
    int array[] = {2, 5, 10};
    int nonArray[] = {2, 3, 7};
    boolean answer = areFactors(n, array);
    boolean answer2 = areFactors(n, nonArray);
    
    // Print out the results
    System.out.println("answer 1 is :" + answer + "answer 2 is :" + answer2);
  }
}

