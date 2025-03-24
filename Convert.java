import java.util.Scanner;
import java.util.Random;
  /**
  * Converts centimeters to feet and inches.
  */
public class Convert {

    public static void main(String[] args) {
    // Exercise 3.1
    /*
      String hello = "hello";
      String exlaim = "!!!";
      System.out.print(hello + " world" + exlaim + "\n");

      final int integer = 2;
      final double dooble = 2;
      System.out.print("here is an integer:" + integer + "\n");
      System.out.print("here is a double:" + dooble + "\n");

      // System.out.printf("here is what happens when display int with f: %.2f", integer);
      // trying to display a type int with %f results in an error "IllegalFormatConversionException"
      
      // System.out.printf("here is what happens when displaying a double using d: %d", dooble);
      // also get an illegalformatconversionexception error
      
      System.out.printf("here is what happens when you use 2 format specifiers: %.2f and %s", dooble);
      // this will cause a missingformatargumentexception error
    //
    // these errors are also at run time and not compile
    */

    // Exercise 3.2
    /*
      double celcius, farenheight;
      Scanner in = new Scanner(System.in);
    
      System.out.print("Enter a temperature in Celcius: ");
      celcius = in.nextDouble();
      in.nextLine(); // for formatting

      // convert and output the result
      farenheight = (celcius * 9/5) + 32;
    

      System.out.printf("%.1f C = %.1f F",
      celcius, farenheight);
    */

    // Exercise 3.3
    /*
      int input_seconds, hours, minutes, seconds;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a number of seconds: ");
      input_seconds = in.nextInt();
      in.nextLine();

      // convert seconds to hours, mins, seconds
      
      hours = input_seconds / 3600;
      minutes = (input_seconds / 60) - (hours * 60);
      seconds = input_seconds - ((hours * 3600) + (minutes * 60));
      
      System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.\n",
      input_seconds, hours, minutes, seconds);
    */

    // Exercise 3.4
    /* 
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    
    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n");
    System.out.print("Type a number: ");
    int guessed_number = in.nextInt();
    System.out.printf("Your guess is: %d\n", guessed_number);
      
    int number = random.nextInt(100) + 1;
    System.out.printf("The number I was thinking of is: %d\n", number);
    
    int difference = Math.abs(guessed_number - number);
    System.out.printf("You were off by: %d\n", difference);
    */
  }
}
