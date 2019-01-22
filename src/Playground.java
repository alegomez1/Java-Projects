
import java.util.Scanner;
public class Playground {

    int reqPoints;
    int packs = 0;

    public static void introduction(int reqPoints, int packs) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter how many points you have total");
        reqPoints = kb.nextInt();
        kb.nextLine();
        System.out.println("Which type of packs would you like to calculate?" +
                "\n1: Gold packs" +
                "\n2: Silver packs" +
                "\n3: Bronze packs");
        int packChoice = kb.nextInt();

        switch (packChoice) {

            case 1:
                while (reqPoints >= 10000) {
                    reqPoints = reqPoints - 3000;
                    packs = packs + 1;
                }
                System.out.println("You can buy " + packs + " packs and have " + reqPoints + " points leftover");
                break;

            case 2:
                while (reqPoints >= 5000) {
                    reqPoints = reqPoints - 1500;
                    packs = packs + 1;
                }
                System.out.println("You can buy " + packs + " packs and have " + reqPoints + " points leftover");
                break;

            case 3:
                while (reqPoints >= 1000) {
                    reqPoints = reqPoints - 250;
                    packs = packs + 1;
                }
                System.out.println("You can buy " + packs + " packs and have " + reqPoints + " points leftover");
                break;


        }

    }









    public static void main(String[] args) {



        introduction(5000, 0);


    }




}
