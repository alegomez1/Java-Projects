import java.util.Scanner;
public class Playground {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        Integer a = 9;
        Integer b = 50;

        if (Integer.compare(a, b) == 1){
            System.out.printf("%d is greater than %d",a,b);
        }else
            System.out.println("The first is not greater");
    }
}
