public class arePrimeFactors {
  public static boolean arePrimeFactors(int n, int[] array) {
    
    int product = 1;
   
    for (int value : array) {
      if (value <= 1) {
          return false;
      }

      if (value == 2){
      } else {

      for (int i = 2; i <= Math.sqrt(value); i++) {
          if (value % i == 0) {
            return false;
          }
        }
      }

        product *= value;
    
    }

    return product == n;    
  }
    
  
  public static void main(String[] args) { 
    int n = 70;
    int array[] = {2, 5, 7};
    int nonArray[] = {2, 3, 10};
    boolean answer = arePrimeFactors(n, array);
    boolean answer2 = arePrimeFactors(n, nonArray);
    
    // Print out the results
    System.out.println("answer 1 is :" + answer + "answer 2 is :" + answer2);
  }
}

