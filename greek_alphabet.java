public class greek_alphabet {
   public static void main(String[] args) { 
      System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
          System.out.print((char) i);
        }
          System.out.println();

String s = "banana";

      String r = "";
      for (int i = s.length() - 1; i >= 0; i--) {
        r += s.charAt(i);
        }
      System.out.print(r);


    for (int hour = 0; hour < 24; hour++) {
      for (int min = 0; min < 60; min++) {
        String time = String.format("%02d:%02d", hour, min); 
        System.out.println(time);
        }
      }
    }    
}
