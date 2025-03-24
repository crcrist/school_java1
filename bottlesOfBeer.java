public class bottlesOfBeer {
  public static void bottlesOfBeer(int n) {
      if (n == 0) {
        System.out.println("No bottles of beer on the wall, no bottles of beer, \nya’ can’t take one down, \nya’ can’t pass it around, \n’cause there are no more bottles of beer on the wall!");
    } else {
      System.out.println(n + " bottles of beer on the wall, \n" + n +" bottles of beer, \nya’ take one down, ya’ pass it around,");
      bottlesOfBeer(n - 1);
    }
  }

public static int oddSum(int n) {
    if (n == 1) {
      return 1; 
    } 
      return n + oddSum(n - 2);
  }


public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1; 
  } else if (n == 0) {
      return ack(m - 1, 1);
  } else {
      return ack(m - 1, ack(m, n-1));
  }
    
}

public static double power(double x, int n) {
    if (n == 0) {
      return 1; // anything raised to 0 is 1 
    } else if (n % 2 == 0) {
      // when n is even
      double halfPower = power(x, n/2);
      return halfPower * halfPower;
    } else {
        // when n is odd 
        return x * power(x, n-1);
    }
}
  

public static int maxInRange(int[] array, int lowIndex, int highIndex)  {

    if (lowIndex == highIndex) {
      return array[lowIndex]; 
    }

    int mid = (lowIndex + highIndex) / 2;
    int leftMax = maxInRange(array, lowIndex, mid);
    int rightMax = maxInRange(array, mid + 1, highIndex);

    return Math.max(leftMax, rightMax);
  }

public static int max(int[] array) {
    int lowIndex = 0;
    int highIndex = array.length - 1;
    int maxValue = maxInRange(array, lowIndex, highIndex);

    return maxValue;
  }



  public static void main(String[] args) {
    //bottlesOfBeer(10);
    //System.out.println(oddSum(5));
    // int num = ack(3,20);
    // System.out.println(num);
    //double powered = power(5,3);
    //System.out.println(powered);
    int[] array = {1, 6, 3, 4, 5};
    //int maxInt = maxInRange(array, 1, 4);
    int maxInt = max(array);
    System.out.println(maxInt);
  }
}

