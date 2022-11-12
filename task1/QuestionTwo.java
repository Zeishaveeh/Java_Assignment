package task1;

import java.util.Scanner; //importing Scanner

public class QuestionTwo {

    //this method returns the average rounded to 2dp
    static double findAverage(double first, double second, double third, double fourth, double fifth) {
        // finding the average
        var originalAverage = (first + second + third + fourth + fifth) / 5;
        
        // rounding the average
        var roundedAverage = Math.round(originalAverage * 100.0) / 100.0;
        
        return roundedAverage;
    }

    // main function
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks of the units you did on last semester.");

        // getting the units as entered at the console
        System.out.println("Unit 1: ");
        double unit_1;
        unit_1 = input.nextDouble();
        System.out.println("Unit 2: ");
        double unit_2;
        unit_2 = input.nextDouble();
        System.out.println("Unit 3: ");
        double unit_3;
        unit_3 = input.nextDouble();
        System.out.println("Unit 4: ");
        double unit_4;
        unit_4 = input.nextDouble();
        System.out.println("Unit 5: ");
        double unit_5;
        unit_5 = input.nextDouble();


        
        //calling findAverage method
        double average = findAverage(unit_1, unit_2, unit_3, unit_4, unit_5);

        

        System.out.println("\nYou average mark: " + average);
    }

}
