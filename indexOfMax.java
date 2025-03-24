public class indexOfMax {
  public static int indexOfMax(int[] array) {
    int maxIndex = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] > array[maxIndex]) {
          maxIndex = i; 
      }
    }
    return maxIndex;
  }

   public static void main(String[] args) { 
      int[] array = {123, 2, 3, 999, 5, 6, 1000};
      System.out.println(indexOfMax(array));
    }
}
