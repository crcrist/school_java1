import java.util.Scanner;
import java.util.Random;


public class Conditions {
   public static void main(String[] args) {

    Random random = new Random();
    Scanner in = new Scanner(System.in);
    
    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n");
    System.out.print("Type a number: ");
    int guessed_number = in.nextInt();
    System.out.printf("Your guess is: %d\n", guessed_number);
      
    int number = random.nextInt(100) + 1;

    int guessed_number2 = 0;
    int difference2 = 0;
    int guessed_number3 = 0;
    int difference3 = 0;
  
    int difference = guessed_number - number;
    // first time guess is evaluated 
    if (difference > 0) { 
          System.out.println("Guess is too high! Try guessing a smaller number");
          guessed_number2 = in.nextInt();
          System.out.printf("Your guess is: %d\n", guessed_number2);
          difference2 = guessed_number2 - number;
      } else if (difference < 0) {
          System.out.println("Guess is too low! Try guessing a larger number");
          guessed_number2 = in.nextInt();
          System.out.printf("Your guess is: %d\n", guessed_number2); 
          difference2 = guessed_number2 - number;
    } else {
          System.out.println("Your guess was correct, that is the number!");
          return;
      }

    if (difference2 > 0) { 
          System.out.println("Guess is too high! Try guessing a smaller number");
          guessed_number3 = in.nextInt();
          System.out.printf("Your guess is: %d\n", guessed_number3);
          difference3 = guessed_number3 - number;
      } else if (difference2 < 0) {
          System.out.println("Guess is too low! Try guessing a larger number");
          guessed_number3 = in.nextInt();
          System.out.printf("Your guess is: %d\n", guessed_number3); 
          difference3 = guessed_number3 - number;
    } else {
          System.out.println("Your guess was correct, that is the number!");
          return;
      }

    if (difference3 > 0) {
          System.out.println("Guess is too high! Good try!");
          System.out.printf("You were off by: %d\n", difference3);
          System.out.printf("The number I was thinking of is: %d\n", number);

    } else if (difference3 < 0) {
          System.out.println("Guess is too low! Good try!");
          System.out.printf("You were off by: %d\n", Math.abs(difference3));
          System.out.printf("The number I was thinking of is: %d\n", number);

    } else {
          System.out.println("Your guess was correct, that is the number!");
          return;

    }

  }
} 
