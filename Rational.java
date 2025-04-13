public class Rational {
    // Instance variables
    private int numerator;
    private int denominator;
    
    // Default constructor
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator() {
      return this.numerator;
    }
    
    public int getDenominator() {
      return this.denominator;
    }
    public void setNumerator(int numerator) {
      this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
      this.denominator = denominator;
    }

    // print rational method
    public static void printRational(Rational rational) {
      System.out.println("numerator: " + rational.numerator + "\n" + "denominator: " + rational.denominator);
    }
    
    // Method to display time in a readable format
    public String toString() {
        return String.format("numerator: %d, denominator: %d", this.numerator, this.denominator);
    }

    public boolean equals(Rational rational) {
        if (this == rational) return true;

        if (rational == null || getClass() != rational.getClass()) return false;

        Rational other = (Rational) rational;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }
   
    public void negate() {
      this.numerator = this.numerator * -1;
    }

    public void invert() {
      int temp = this.numerator;
      this.numerator = this.denominator;
      this.denominator = temp;
    }

    public double toDouble() {
      return (double) numerator/denominator;
    }

    // Method to reduce a rational number to lowest terms
    public Rational reduce() {
        // Find the GCD of numerator and denominator
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        
        // Euclidean algorithm for GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        // a is now the GCD
        int sign = (denominator < 0) ? -1 : 1;
        return new Rational(sign * numerator / a, Math.abs(denominator) / a);
    }

    public Rational add(Rational other) {
        // Find the new numerator and denominator
        int newNumerator = (this.numerator * other.denominator) + 
                           (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        
        // Create a new Rational with the result
        Rational result = new Rational(newNumerator, newDenominator);
        
        // Reduce the result and return it
        return result.reduce();
}

    public static void main(String[] args) {

        Rational rational1 = new Rational();
        rational1.setNumerator(8);
        rational1.setDenominator(2);
        Rational.printRational(rational1);
        String rationalAsString = rational1.toString();
        System.out.println("calling rational1 toString: " + rationalAsString);
        
        Rational rational2 = new Rational(10, 2);
        rational2.negate();
        rational2.invert();
        Rational.printRational(rational2);
        rational2.toDouble();
        System.out.println(rational2);
       

        Rational rational3 = new Rational(1, 2);
        System.out.println(rational3 + " as a double is: " + rational3.toDouble());

        

        Rational reduced = rational1.reduce();
        System.out.println("Reduced: " + reduced);

        Rational sum = rational3.add(rational2);
        System.out.println(rational3 + " + " + rational2 + " = " + sum);


/*
        Rational rational2 = new Rational();
        Rational rational3 = new Rational();
        Rational.printRational(rational1);
        Rational.printRational(rational2);
        Rational.printRational(rational3);
        System.out.println("\nare the rationals equal? - " + rational1.equals(rational2));
        System.out.println("\nare the rationals equal? - " + rational1.equals(rational3));
*/
  }
}

