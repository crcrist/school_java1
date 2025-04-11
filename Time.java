public class Time {
    // Instance variables
    private int hour;
    private int minute;
    private double second;
    
    // Default constructor
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    // Constructor with parameters
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // The increment method
    public Time increment(double seconds) {
        Time result = new Time();
        
        // Calculate total seconds
        double totalSeconds = this.hour * 3600 + this.minute * 60 + this.second + seconds;
        
        // Use division and remainder to calculate hours, minutes, and seconds
        result.hour = (int) (totalSeconds / 3600) % 24;
        result.minute = (int) ((totalSeconds % 3600) / 60);
        result.second = totalSeconds % 60;
        
        return result;
    }
    
    // Method to display time in a readable format
    public String toString() {
        return String.format("%02d:%02d:%05.2f", hour, minute, second);
    }
    
    // Main method with your original code plus test for increment()
    public static void main(String[] args) {
        // Your original code
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
        
        // Test the increment method
        System.out.println("\nTesting increment() method:");
        Time currentTime = new Time(19, 7, 34);
        System.out.println("Current time: " + currentTime);
        
        // Test incrementing by different amounts
        Time time1 = currentTime.increment(60);  // Add 1 minute
        System.out.println("After adding 60 seconds: " + time1);
        
        Time time2 = currentTime.increment(3600);  // Add 1 hour
        System.out.println("After adding 3600 seconds: " + time2);
        
        Time time3 = currentTime.increment(86400);  // Add 1 day
        System.out.println("After adding 86400 seconds (1 day): " + time3);
    }
}
