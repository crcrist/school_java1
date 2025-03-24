public class isAbecedarian {
  public static boolean abcdarian(String s) {
      for (int i = 0; i < s.length() - 1; i++) {
         if (s.charAt(i) > s.charAt(i + 1)) {
            return false;
         }
      }
      return true;
   }
    
   public static void main(String[] args) { 
      System.out.println(abcdarian("cba"));
  }
}
