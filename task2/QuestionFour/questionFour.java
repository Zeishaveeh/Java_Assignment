package QuestionFour;

public class questionFour {
 
    //non static method
    void combineWords(String sentence1, String sentence2) {
        System.out.println(sentence1 + sentence2);
    }

    // This is a static method
    static String findSecondSentence() {
        return " Java?. ";
    }

    // main method
    public static void main(String[] args) {

        String sentence1, sentence2;
        // calling a static method
        sentence1 = "What is";
        sentence2 = findSecondSentence();

        // using non-static method
        questionFour thisClassObj = new questionFour();
        thisClassObj.combineWords(sentence1, sentence2);
    }
}