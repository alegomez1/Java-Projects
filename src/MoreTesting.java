import java.util.Scanner;

public class MoreTesting {



    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);


        int x;

        System.out.println("Please enter a number");

        x = kb.nextInt();


        switch(x){

            case 0:
                System.out.println("Looks like you picked zero");
                break;

            case 5:
                System.out.println("It's five");
                break;

            case 7: case 8: case 9:
                System.out.println("Are you trying to make a joke here?");
                break;

            default:
                System.out.println("You need a number");
        }



    }
}
