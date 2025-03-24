public class scrable {
  public static boolean isScrable(String word, String letters) {
    word = word.toLowerCase();
    letters = letters.toLowerCase();
    
    char[] lettersArray = letters.toCharArray();

    for (int i = 0; i < word.length(); i++) {
        char currentChar = word.charAt(i);
        boolean found = false;

        for (int j = 0; j < letters.length(); j++) {
            if (lettersArray[j] == currentChar) {
                lettersArray[j] = '*';
                found = true;
                break;
            }
        }
   if (!found ) {
      return false;
      }
    }
    return true;
  }

   public static void main(String[] args) {

    System.out.println(isScrable("Vinny", "NNYIV"));
    System.out.println(isScrable("Papa", "ABC"));
    System.out.println(isScrable("Hello", "HELO"));
   }    
}
