public class squareRoot {

  public static void main(String[] args) {
      double result = squareRoot(9);
      System.out.println(result);  
  }

  public static double squareRoot(double n) {
      double x = n / 2;
      double y = 1.0;
      double i = 1.0;

      while (i > 0.0001) {
          y = (x + n/x)/2;
          i = Math.abs(x-y);
          x = y;
        }
      return y;
    
   }
}


