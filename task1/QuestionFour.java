package task1;

import java.util.List;              
import java.util.stream.Collectors; 
import java.util.stream.IntStream;  

public class QuestionFour {

    //main method
    public static void main(String[] args) {
        
        //calling my methods to print the output
        multiple2();
        multiple3();
        multiple7();
    }

    static void multiple2() {
        //Creating my list to store 71-150
        List<Integer> myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        
        myList.add(150); //adding last item

        System.out.println("\n2 has the following multiples:");
        //Getting the multiples of 2 using for loop:
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break;
            } 
        }
    }

    static void multiple3() {
        System.out.println("3 has the following multiples:");
        //Creating my list to store 71-150
        List<Integer> myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        
        myList.add(150); //adding last item

        //Getting the  multiples of 3 using for loop
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break;
            } 
        }
    }

    static void multiple7() {
         //Multiples of 7:
         System.out.println("7  has the following multiples:");

         //Creating my list to store 71-150
        List<Integer> myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        myList.add(150); //adding last item
         
         //Getting the multiples of 7 using for loop
         for (int i = 0; i <= myList.size(); i++) {
             if (myList.get(i) % 7 == 0) {
                 System.out.println(myList.get(i));
             }
             
             if (i == 150-71) {
                 break;
             } 
         }
    }
}
