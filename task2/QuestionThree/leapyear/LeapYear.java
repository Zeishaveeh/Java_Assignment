package QuestionThree.leapyear;

import java.util.Scanner;

public class LeapYear {

    // the method to find leap year
    static void isItLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter year :");
        year = input.nextInt();// input the year

        
        //if year is divisible by 4, then it is a leap year
        if ((year % 4) == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

        // main method
        public static void main(String[] args) {

            isItLeapYear(); // calling method
        }
}
