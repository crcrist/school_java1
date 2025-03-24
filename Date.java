public class Date {
  public static void printAmerican(String day, int date, int year, String month) {
    System.out.println(day + ", " + month + date + ", " + year);
  }

  public static void printEuropean(String day, int date, int year, String month) {
    System.out.println(day + " " + date + " " + month + year);
  }

    public static int getNumber() {
        return 42;
    }
    
    

   public static void main(String[] args) {
    String day = "Sunday";
    int date = 2;
    String month = "February ";
    int year = 2025;

    printAmerican(day, date, year, month);
    printEuropean(day, date, year, month);
    System.out.println("boo!") + 7;
   }    
} 
