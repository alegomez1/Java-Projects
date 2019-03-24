package Lab6;
public class Lab6
{


    /*
    *   QUESTIONS FROM WORD DOCUMENT
    *   Part A:
    *   1. A
    *   2. have a nice day
    *   3. 0
    *   4. 5
    *   5. RUNTIME ERROR
    *   6. I
    *   7. A NICE DAY
    *   8. HAVE A NICE DAY
    *   9. RUNTIME ERROR
    *   10. SYNTAX ERROR
    *
    *   Part B:
    *   1. "ananaB"
    *   2. "ecitsloS"
    *   3. "terceS poT"
    *   4. "baaaaaac"
    *   5. "bac"
     */

    //Here in main I am calling the funWithStrings() method in order to run the program
    public static void main(String[] args) {

    funWithStrings();



    }

    /*
    *   This method runs through different String functions such as substring, indexOf, etc. to manipulate a String variable called 'coolWord'.
    *   Based on the method being used, a different resulting String is produced.
    *   It also calls the reverse() method to give it an input and it returns the input but in reversed order.
     */

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

        //Reversed versions:
        System.out.println("---------------------------------");
        System.out.println(reverse(test1));
        System.out.println(reverse(test2));
        System.out.println(reverse(test3));
        //Normal versions:
        System.out.println("---------------------------------");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);



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
        System.out.println("---------------------------------");
        System.out.println(reverse("Banana"));
        System.out.println(reverse("Solstice"));
        System.out.println(reverse("Top Secret"));
        System.out.println(reverse("caaaaaab"));
        System.out.println(reverse("cab"));


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

    /*
    *   This method is used to reverse the order of letters in a word or phrase. It accepts a String parameter and returns a String output.
    *   It uses a for-loop, concatenation, and the charAt method to achieve this.
     */
    public static String reverse(String toReverse) {



        String reversed = ""; //reversed must be built from scratch
        for (int i=toReverse.length()-1; i>=0; i--){
            int wordLength = toReverse.length();
            reversed = reversed + toReverse.charAt(i);
        }

        //Use toReverse’s characters to build reversed
        //Hint: Write a for-loop that uses concatenation and charAt!

        return reversed;
    }


}
