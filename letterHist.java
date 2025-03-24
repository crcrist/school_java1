import java.util.Arrays;

public class letterHist {
  public static int[] letterHist(String s) {
    int[] counts = new int[26];
    String lower = s.toLowerCase();
    
    for (char letter : lower.toCharArray()) {
      if (letter >= 'a' && letter <= 'z') {
        int index = letter - 'a';
        counts[index]++;
      }
    }
    return counts;    
  }

  public static boolean stringAnnogram(String s1, String s2) {
     int[] counts1 = new int[26];
     String lower1 = s1.toLowerCase();
    
      for (char letter : lower1.toCharArray()) {
      if (letter >= 'a' && letter <= 'z') {
        int index = letter - 'a';
        counts1[index]++;
      }
    }

     int[] counts2 = new int[26];
     String lower2 = s2.toLowerCase();
    
      for (char letter : lower2.toCharArray()) {
      if (letter >= 'a' && letter <= 'z') {
        int index = letter - 'a';
        counts2[index]++;
      }
    }
      
    return Arrays.equals(counts1,counts2);
  }
  
  public static void main(String[] args) {
    //String s = "balloon";
    //int[] hist = letterHist(s);
    
    // Print out the results
    //System.out.println("answer is: " + Arrays.toString(hist));
    String s1 = "doggy";
    String s2 = "gody";
    System.out.println(stringAnnogram(s1,s2));
    
  }
}
