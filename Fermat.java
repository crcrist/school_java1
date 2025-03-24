import java.util.Scanner;


public class Fermat {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      

      System.out.print("enter value a for Fermats formula: ");
      double a = in.nextDouble();

      System.out.print("enter value b for Fermats formula: ");
      double b = in.nextDouble();

      System.out.print("enter value c for Fermats formula: ");
      double c = in.nextDouble();

      System.out.print("enter value n for Fermats formula: ");
      double n = in.nextDouble();

      double a_sq = Math.pow(a,n);
      double b_sq = Math.pow(b,n);
      double c_sq = Math.pow(c,n);

      if ((a_sq + b_sq == c_sq) && n > 2) {
          System.out.println("Holy smokes, Fermat was wrong!");
      } else {
          System.out.println("No, that doesn't work");
      }
   }    
}
