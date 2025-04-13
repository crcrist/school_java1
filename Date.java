public class Date {
    // Instance variables
    private int year;
    private int month;
    private int day;
    
    // Default constructor
    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    
    // Constructor with parameters
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
      return this.year;
    }
    
    public int getMonth() {
      return this.month;
    }

    public int getDay() {
      return this.day;
    }

    public void setYear(int year) {
      this.year = year;
    }

    public void setMonth(int month) {
      this.month = month;
    }

     public void setDay(int day) {
      this.day = day;
    }
   
    // print date method
    public static void printDate(Date date) {
      System.out.println(date.year + "-" + date.month + "-" + date.day);
    }
    
    // Method to display time in a readable format
    public String toString() {
        return String.format("%d-%d-%d", this.year, this.month, this.day);
    }

    public boolean equals(Date date) {
        if (this == date) return true;

        if (date == null || getClass() != date.getClass()) return false;

        Date other = (Date) date;
        return this.year == other.year && this.month == other.month && this.day == other.day;
    }
    
    public static void main(String[] args) {

        Date date1 = new Date(1999, 12, 16);
        Date date2 = new Date(1999, 12, 16);
        Date date3 = new Date(2001, 10, 28);
        Date.printDate(date1);
        Date.printDate(date2);
        Date.printDate(date3);
        System.out.println("\nare the dates equal? - " + date1.equals(date2));
        System.out.println("\nare the dates equal? - " + date1.equals(date3));

  }
}

