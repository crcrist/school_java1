public class recurse {

  /**
  * Returns the first character of the given String.
  */
  public static char first(String s) {
  return s.charAt(0);
  }
  /**
  * Returns all but the first letter of the given String.
  */
  public static String rest(String s) {
  return s.substring(1);
  }
  /**
  * Returns all but the first and last letter of the String.
  */
  public static String middle(String s) {
  return s.substring(1, s.length() - 1);
  }
  /**
  * Returns the length of the given String.
  */
  public static int length(String s) {
  return s.length();
  }

  public static void printLetters(String s) {
      if (s.length() == 0) {
        return;
    }
      else {
        System.out.println(first(s));
        printLetters(rest(s));
    }

  }

  public static void printBackwards(String s) {

  }


     public static void main(String[] args) { 
        //System.out.println(first("string"));

        //System.out.println(rest("string"));

        //System.out.println(middle("string"));

        //System.out.println(length("string"));

        String s = "string";
        
        //printLetters(s);
      }   
}
