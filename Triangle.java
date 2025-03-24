import java.util.Scanner;


public class Triangle {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);


      System.out.print("enter length of side a for the triangle ");
      if (!in.hasNextDouble()) {
        String word = in.next();
        System.err.println(word + " is not a number");
        return;
    }
      double a = in.nextDouble();
      if (a <= 0) {
        System.err.println("a cannot be 0");
        return;
    }


      System.out.print("enter length of side b for the triangle ");
      if (!in.hasNextDouble()) {
        String word = in.next();
        System.err.println(word + "is not a number");
        return;
    }
      double b = in.nextDouble();
      if (b <= 0) {
        System.err.println("b cannot be 0");
        return;
    }

      System.out.print("enter length of side c for the triangle ");
      if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
      double c = in.nextDouble();
      if (c <= 0) {
        System.err.println("c cannot be 0");
        return;
    }

    if ( a + b <= c || b + c <= a || a + c <= b) {
      System.out.println("cannot make triangle");
    }
    else {
      System.out.println("can make a triangle");
    }


  }    
}
