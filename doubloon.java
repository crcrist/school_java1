public class doubloon {
  public static boolean isDoubloon(String word) {
    word = word.toLowerCase();
    
    for (int i = 0; i < word.length(); i++) {
        char currentChar = word.charAt(i);
        
        int count = 0;
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == currentChar) {
                count++;
            }
        }
        
        if (count != 2) {
            return false;
        }
    }
    
    return true;
  }

   public static void main(String[] args) {

    System.out.println(isDoubloon("Vinny"));
    System.out.println(isDoubloon("Papa"));
   }    
}
