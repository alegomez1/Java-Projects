public class RegularExpressions {

    public static final String STRING_TEST = "This is my " + "small example";


    public static void main(String[] args) {



        System.out.println(STRING_TEST.matches("\\w.*"));
        String[] splitString = (STRING_TEST.split("\\s"));
        System.out.println(splitString.length);
        //for each loop


    }
}
