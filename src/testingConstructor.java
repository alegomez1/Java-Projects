import java.util.Random;
public class testingConstructor {


    private int b1;
    private int b2;
    private int b3;

    private int i1;
    private int i2;
    private int i3;

    private int n1;
    private int n2;
    private int n3;

    int[][] numbers = { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} };

    public testingConstructor(){

        this.b1 = numbers[0][0];
        this.b2 = numbers[0][1];
        this.b3 = numbers[0][2];

        this.i1 = numbers[1][0];
        this.i2 = numbers[1][1];
        this.i3 = numbers[1][2];

        this.n1 = numbers[2][0];
        this.n2 = numbers[2][1];
        this.n3 = numbers[2][2];
    }

    public void changeNumbers(){
        Random myRan = new Random();

        for (int i = 0; i<3; i++){



            for (int x = 0; x<3; x++){
                numbers[i][x] = myRan.nextInt(10)+1;
            }

        }
    }

    public void showNumbers(){
        System.out.printf("%d   %d   %d\n" +
                          "%d   %d   %d\n" +
                          "%d   %d   %d", numbers[0][0],numbers[0][1],numbers[0][2],
                                          numbers[1][0],numbers[1][1],numbers[1][2],
                                          numbers[2][0],numbers[2][1],numbers[2][2]);
    }


}
