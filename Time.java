public class Time {
   public static void main(String[] args) {
    int hour = 19;
    int minute = 7;
    int second = 34;

    double secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;

    System.out.println(secondsSinceMidnight + " seconds have ocurred since midnight");

    int totalHour = 23;
    int totalMinute = 59;
    int totalSecond = 59;
    
    double secondsTotalInDay = (totalHour * 3600) + (totalMinute * 60) + totalSecond;

    System.out.println(secondsTotalInDay - secondsSinceMidnight + " total seconds left in today");

    double pctOfDayPassed = secondsSinceMidnight / secondsTotalInDay;
    
    System.out.println(pctOfDayPassed + " percent of today has passed");

   }    
} 
