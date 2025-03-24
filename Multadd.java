public class Multadd {

  public static double multadd(double a, double b, double c) {
    return a * b + c;
  }

  public static double expSum(double x) {
    
    double exp = Math.exp(-x);
    return multadd(x, exp, Math.sqrt(1 - exp));
  }

   public static void main(String[] args) { 

      System.out.println("Testing basic multadd:");
      System.out.println("1.0 * 2.0 + 3.0 = " + multadd(1.0, 2.0, 3.0));
      
      // Compute sin(pi/4) + cos(pi/4)/2
      double pi4 = Math.PI / 4;
      double result1 = multadd(1.0, Math.sin(pi4), Math.cos(pi4) / 2);
      System.out.println("\nsin(pi/4) + cos(pi/4)/2 = " + result1);
      
      // Compute log(10) + log(20)
      double result2 = multadd(1.0, Math.log(10), Math.log(20));
      System.out.println("\nlog(10) + log(20) = " + result2);

      System.out.println("\nx*e^(-x) + sqrt(1 - e^(-x)) = " + expSum(1.0));

    }    
}
