package Hw4;

public class Hw4a {

    public static void main(String[] args) {


        String Sentence1 = "I live in NY";
        int lengthOfSentence1 = 12;


        String result1 = (lengthOfSentence1 >= 5) ? "10" : "15";

        System.out.println("I live In NY");
        System.out.println("length Of Sentence1 = " +  lengthOfSentence1);
        System.out.println("Length Of Sentence1 = " + result1);



        /*
        TAsk 2
         */

        String fullName = "AbdulWakeel";
        int lengthOfMyFullNameIs = 11;
        System.out.println("length Of My Full Name Is = " +  lengthOfMyFullNameIs);
        int fullNameLength = fullName.length();
        System.out.println("\nlength of My full Name is " + fullNameLength  );


        System.out.println(fullName.contains("a"));


        System.out.println(fullName.endsWith("a"));

        /*
TASK 3

         */

        String statement1 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";

        System.out.println(fullName.contains("king"));


        /*
        TASK 3
         */



        String statement2 = "kINg";
        String statement3 = statement2.toLowerCase();

        System.out.println("statement2 to lower case -> "+ statement3);


        System.out.println(statement1.indexOf("EW"));


        System.out.println(statement3.replace('k', 'K'));



    }
}





/**
 * Due date: Mar 13 (Sunday)
 */

    /**
     * Task -1
     * using Ternary operator assign value to int-variable
     *
     * Variable -> result1
     * if the length of sentence1-String is greater or equals to 5
     *      value in result1 should be 10
     * else
     *      value in result should be 15
     *
     * print:
     *      value of sentence1
     *      length of sentence1
     *      value of result1
     */
    //String sentence1 = "hhhh";

    /**
     * Task - 2
     *
     * Create a String Variable and store your full name in it.
     * Print the following values:
     *  1. length of your full name
     *  2. check if your name ends with "a" (ignore the case)
     *  3. check if your name contains with "a" (ignore the case)
     *
     */


    /**
     *
     */
    //String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
    /**
     * Print the results for:
     *  1. task3-value contains "king" (ignore cases)
     *  2. index of first occurrence of "EW" (ignore cases)
     */


    //String task4 = "kINg";
/**
 * Convert the value in task4 variable into Titlecase
 *      (FirstCharacterUppercase and rest all in lowercase)
 *
 * "kINg" -> "King"
 * "QUEEN" -> "Queen"
 */
