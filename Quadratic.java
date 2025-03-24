import java.util.Scanner;


public class Quadratic {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);


      System.out.print("enter value a for Quadratic formula: ");
      if (!in.hasNextDouble()) {
        String word = in.next();
        System.err.println(word + " is not a number");
        return;
    }
      double a = in.nextDouble();
      if (a == 0) {
        System.err.println("a cannot be 0");
        return;
    }
      

      System.out.print("enter value b for Quadratic formula: ");
      if (!in.hasNextDouble()) {
        String word = in.next();
        System.err.println(word + "is not a number");
        return;
    }
      double b = in.nextDouble();

      System.out.print("enter value c for Quadratic formula: ");
      if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
      double c = in.nextDouble();

      double numerator_sqr = Math.pow(b,2) - 4 * a * c;

      if (numerator_sqr > 0) {
        double x1 = (-b + Math.sqrt(numerator_sqr)) / (2 * a);
        double x2 = (-b - Math.sqrt(numerator_sqr)) / (2 * a);
        System.out.println("two solutions:");
        System.out.printf("x1 = %.2f\n", x1);
        System.out.printf("x2 = %.2f\n", x2);
    }
    else if (numerator_sqr == 0) {
        double x = -b / (2.0 * a);
        System.out.println("One solutions:");
        System.out.printf("x = %.2f\n", x);
    }
    else {
        System.out.println("No real solutions exist");
    }

  }    
}
