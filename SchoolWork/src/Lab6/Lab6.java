package Lab6;

public class Lab6 {

    public static void main(String[] args) {

     funWithStrings();
    }

    public static void funWithStrings() {
        /*
        ***************Task 1B****************
        In this method, create a new string variable called coolWord
        that points to the string literal "SuperCaliFragilisticExpialiDocious".
        Then print out the following output using System.out.println(…).


        A   (get this letter from coolWord, and capitalize it)
        3   (number of occurrences of the letter a in coolWord)
        SuperDocious  (print 2 subparts of coolWord together)
        -1   (as a result of trying to find the letter w in coolWord)
        supercalifragilisticexpialidocious3 (make coolWord be all lowercase,
        and concatenate 3 at the end of it)

        Use ONLY the string class methods. Do not simply use "a", "-1", etc.
        as the argument for System.out.println(…). Use concatenation to print
        out the last two strings. Use indexOf to print out the numbers.


        */

        String coolWord = "SuperCaliFragilisticExpialiDocious";

       // String test = String.valueOf(coolWord.charAt(6));

        System.out.println(coolWord.valueOf(coolWord.charAt(6)).toUpperCase());



        int letterCounter =0;

        for (int i=0;i<coolWord.length();i++){
            if (coolWord.charAt(i) == 'a'){
                letterCounter ++;
            }

        }
        System.out.println(letterCounter);

        System.out.println(coolWord.substring(0,5) + coolWord.substring(27,34));

        System.out.println(coolWord.indexOf('w'));

        System.out.println(coolWord.toLowerCase().concat("3"));


        /*
        ***************Task 2C****************
        In this method, use the completed reverse method to print the reversed
        versions, followed by the non-reversed versions, of the three string
        literals pointed by test1, test2, and test3.
        */

        String test1 = "cyber security";
        String test2 = "internet of things";
        String test3 = "cloud computing";
        //write code below, should occupy at most six lines
        //print reversed versions...
        //print non-reversed versions...
        ;



        /*
        ******************Task 2D ********************
        Further test the reverse method by calling it again from the
        playWithStrings() method, providing the following input as arguments,
        writing the calculated output in the word document table and checking
        that the calculated output matches the expected output. If they are
        different, then update your method until they match.

        Input   		Correct output

        "Banana"	 	"ananaB"
        "Solstice"	 	"ecitsloS"
        "Top Secret" 	 	"terceS poT"
        "caaaaaab"	 	"baaaaaac"
        "cab"                   "bac"

        Fill out the final table, which is provided in the String Lab document.
        */


    }

    /*
    ***************Task 2B****************
    A skeleton for the reverse method is written below. Complete the
    skeleton. Hint: write a for-loop that uses concatenation, and charAt.
    */

    /**
     * Reverses a string.
     *
     * @param toReverse The string to reverse
     * @return The reversed string
     */
    public static String reverse(String toReverse) {
        String reversed = ""; //reversed must be built from scratch

        //Use toReverse’s characters to build reversed
        //Hint: Write a for-loop that uses concatenation and charAt!

        return reversed;
    }

}
