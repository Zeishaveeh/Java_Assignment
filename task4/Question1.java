import java.util.Arrays; //importing  Arrays
import java.util.Scanner; // importing the  Scanner

class Question1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        
        int[] myArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; // creating an arrays and setting the values to 0

        // request the numbers from the users
        System.out.println("\nEnter 15 numbers to our array: \n(After each number, press enter to input.)");
        
        
        // store 1st position to the 15th position
        myArray[0] = input.nextInt();
        myArray[1] = input.nextInt();
        myArray[2] = input.nextInt();
        myArray[3] = input.nextInt();
        myArray[4] = input.nextInt();
        myArray[5] = input.nextInt();
        myArray[6] = input.nextInt();
        myArray[7] = input.nextInt();
        myArray[8] = input.nextInt();
        myArray[9] = input.nextInt();
        myArray[10] = input.nextInt();
        myArray[11] = input.nextInt();
        myArray[12] = input.nextInt();
        myArray[13] = input.nextInt();
        myArray[14] = input.nextInt();

        // change the array to a string list.
        var myList = Arrays.toString(myArray);

        // output the array as a list
        System.out.println("Our array has the following values: " + myList);

        System.out.println("Enter a random number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(myArray, numInput);

    }

    private static void check(int[] arr, int valueToCheck) {

        // Linear Search
        boolean test = false;
        for (int num : arr) {

            // check if the specified num
            // is present in the array or not
            if (num == valueToCheck) {
                test = true;
                break;
            }

        }

        // output the result by printing
        if (test) {
            System.out.println(valueToCheck + " is in the array.");
        } else {
            System.out.println(valueToCheck + " is not in the array.");
        }

    }
}