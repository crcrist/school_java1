public class gaussian {

  public static void main(String[] args) {
      double result = gauss(3,5);
      System.out.println(result);  
  }

  public static double gauss (double x, double n) {
    // parameters are x (input to the equation
    // n is the number of terms to include
    
    double sum = 0;
    double term = 1;
    double xSquared = x * x;


      for (int i = 0; i < n; i++) {
        
        sum += term;

        term = term * (-xSquared) / (i + 1);
      }

      return sum;
    
   }
}


