/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calendar;
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class Calendar {
    public Calendar(){
        
    }
    
    // Calulates whether year is leap year or not
    public void leap(int year){
        String isLeap;  // Holds leap year string value
        // Determine if year is a leap year and set text
        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            isLeap = "a leap year";
        }
        else{
            isLeap = "not a leap year";
        }
        System.out.println(year + " is " + isLeap); // Print if the year is or is not a leap year
    }
    
    // Calculates first day of year given year
    public String firstDayOfYear(int Year){
        int firstDay;                   // first day value
        String holder;                  // String to hold year for century and year extraction
        int year;                       // holder for the last two digits of the year
        int century;                    // holder for century
        int leapMonth=0;                // Holder value for month if varying whether the year is a leap year or not
        // If leap year set month to 6 for january otherwise leave it as 0
        if(Year%4 == 0 && Year%100 != 0 || Year%400 == 0){
            leapMonth = 6;
        }
        String day = null;                          // holder of what day the first day is
        holder = Integer.toString(Year);            // Set holder to year
        century = Integer.parseInt(holder.substring(0,2));  // Parse year for century
        year = Integer.parseInt(holder.substring(2,4));     // parse year for year value
        // Calculate century value for algorithm
        if(century%4 == 0){
            century = 6;
        }
        else if(century-1%4 == 0){
            century = 4;
        }
        else if(century-2%4 == 0){
            century = 2;
        }
        else{
            century = 0;
        }
        // Calculate first day via algorithm
        firstDay=(1+leapMonth+year+(year/4)+century)%7;
        // Set day
        switch(firstDay){
            case 0: day = "Sunday";
                    break;
            case 1: day = "Monday";
                    break;
            case 2: day = "Tuesday";
                    break;
            case 3: day = "Wednesday";
                    break;
            case 4: day = "Thursday";
                    break;
            case 5: day = "Friday";
                    break;
            case 6: day = "Saturday";
                    break;
        }
        return day;     // Return day
        
    }
    
     // Calculates first day of month given month and year
    public String firstDayOfMonth(int month, int Year){
        int firstDay;           // first day value
        String holder;          // Holder value for year parsing
        int year;               // holder of year value
        int century;            // holder of century value
        int leapMonth=0;        // holder of month value
        // Calculate month value
        if (month != 1 && month!=2){
            switch(month){
                case 3: leapMonth = 3;
                    break;
                case 4: leapMonth = 6;
                    break;
                case 5: leapMonth = 1;
                    break;
                case 6: leapMonth = 4;
                    break;
                case 7: leapMonth = 6;
                    break;
                case 8: leapMonth = 2;
                    break;
                case 9: leapMonth = 5;
                    break;
                case 10: leapMonth = 0;
                    break;
                case 11: leapMonth = 3;
                    break;
                case 12: leapMonth = 5;
                    break;
                    
            }
        }
        // if month is january calculate value
        else if (month == 1){
            // If leap year
            if(Year%4 == 0 && Year%100 != 0 || Year%400 == 0){
                leapMonth = 6;
            }
            else{
                leapMonth = 0;
            }
        }
        // Calculate value if february
        else{
            // If leap year
            if(Year%4 == 0 && Year%100 != 0 || Year%400 == 0){
                leapMonth = 2;
            }
            else{
                leapMonth = 3;
            }
        }
        String day = null;  // String for day holder
        holder = Integer.toString(Year);    // Set holder to year as string
        century = Integer.parseInt(holder.substring(0,2));  // parse century value
        year = Integer.parseInt(holder.substring(2,4));     // parse year value for algorithm
        // Calculate century value for algorithm
        if(century%4 == 0){
            century = 6;
        }
        else if(century-1%4 == 0){
            century = 4;
        }
        else if(century-2%4 == 0){
            century = 2;
        }
        else{
            century = 0;
        }
        // Find firstday using algoritm
        firstDay=(1+leapMonth+year+(year/4)+century)%7;
        
        switch(firstDay){
            case 0: day = "Sunday";
                    break;
            case 1: day = "Monday";
                    break;
            case 2: day = "Tuesday";
                    break;
            case 3: day = "Wednesday";
                    break;
            case 4: day = "Thursday";
                    break;
            case 5: day = "Friday";
                    break;
            case 6: day = "Saturday";
                    break;
        }
        return day; // Return day
        
    }
    
    // Calculates number of days in month given month and year
    public int numDaysInMonth(int month, int year){
        int daysInMonth = 0;    // Create holder for number of days in month
        // If month isnt february
        if(month != 2){
            switch(month){
                case 1:daysInMonth = 31;
                    break;
                case 3: daysInMonth = 31;
                    break;
                case 4: daysInMonth = 30;
                    break;
                case 5: daysInMonth = 31;
                    break;
                case 6: daysInMonth = 30;
                    break;
                case 7: daysInMonth = 31;
                    break;
                case 8: daysInMonth = 31;
                    break;
                case 9: daysInMonth = 30;
                    break;
                case 10: daysInMonth = 31;
                    break;
                case 11: daysInMonth = 30;
                    break;
                case 12: daysInMonth = 31;
                    break;
            }
                
                    
        }
        // if leap year
        else if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            daysInMonth = 29;
        }
        // if not leap year
        else{
            daysInMonth = 28;
        }
        return daysInMonth;
    }
    
    // Function that prints the calendar of the given month and year
    public void printCalendar(int month, int year){
        String monthName = null;        // String to hold month name
        Calendar testCalendar = new Calendar();     // Create new calendar object
        String day;     // String to hold day
        int dayCount=1; // day count for printing out calendar
        int dayOfWeek=0;    // Holder for day of week
        int daysInMonth = testCalendar.numDaysInMonth(month, year);     // holder of days in month
        // Set month from month input
        switch(month){
            case 1: monthName ="January";
                break;
            case 2: monthName ="February";
                break;
            case 3: monthName ="March";
                break;
            case 4: monthName ="April";
                break;
            case 5: monthName ="May";
                break;
            case 6: monthName ="June";
                break;
            case 7: monthName ="July";
                break;
            case 8: monthName ="August";
                break;
            case 9: monthName ="September";
                break;
            case 10: monthName ="October";
                break;
            case 11: monthName ="November";
                break;
            case 12: monthName ="December";
                break;
        }
        // Set day using calendar firsDayOfMonth method
        day = testCalendar.firstDayOfMonth(month,year);
        // Set dayof week value given day of week string
        switch(day){
            case "Sunday": dayOfWeek = 0;
                break;
            case "Monday": dayOfWeek = 1;
                break;
            case "Tuesday": dayOfWeek = 2;
                break;
            case "Wednesday": dayOfWeek = 3;
                break;
            case "Thursday": dayOfWeek = 4;
                break;
            case "Friday": dayOfWeek = 5;
                break;
            case "Saturday": dayOfWeek = 6;
                break;
    }
        System.out.println("     " + monthName + " " + year);   // Print month
        System.out.println("Su Mo Tu We Th Fr Sa ");    // Print header
        // Loop to print first week of month
        for(int i=0;i<=6;i++){
            if(i>=dayOfWeek){
                System.out.printf("%2d",dayCount);  // Print day
                dayCount++;     // Update day
            }
            else{
                System.out.print("  ");
            }
            System.out.print(" ");
        }
        System.out.println();   // Print line to seperate week
        int weekCount = 0;      // count value to hold number of days in the week
        while(dayCount <= daysInMonth){
            
            System.out.printf("%2d",dayCount);  // Print day
            System.out.print(" ");  // Print space
            // If day is saturday start next week
            if(weekCount == 6){
                weekCount =-1;  // Reset week count
                System.out.println();
            }
            weekCount++;    // Increment weekCount
            dayCount++;     // Increment day count
        }
        System.out.println();   // Print new line at end of calendar
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userYear = 0;   // User input for year
        int userMonth = 0;  // User input for month
        Calendar calendar = new Calendar(); // Create new calendar object
        Scanner input = new Scanner(System.in); // Create new scanner object
        System.out.println("Enter a year please: ");    // Prompt for year
        userYear = input.nextInt();     // Store user input for year
        System.out.println("Enter a month Please: ");   // Prompt for month
        userMonth = input.nextInt();        // Store user input for month
        
        System.out.println("The first day of " + userYear + " is a " + calendar.firstDayOfYear(userYear));  // Print first day of year
        System.out.println("The first day of the entered month is: " + calendar.firstDayOfMonth(userMonth,userYear));   // Print first day of entered month
        System.out.println("The number of days in the month is: " + calendar.numDaysInMonth(userMonth, userYear));
        calendar.leap(userYear);    // Print if the year is a leap year
        calendar.printCalendar(userMonth,userYear);     // Print out calendar for month and year
    }
    
}
