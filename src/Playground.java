
public class Playground {





    public static void main(String[] args) {

        double[] hoursWorked = {9, 9.3, 4.2, 8.7, 10.1};

        //Adding all the hours

        double sum = 0;

        for (int x = 0; x < hoursWorked.length; x++) {
            sum += hoursWorked[x];
        }

        System.out.println("You worked a total of " + sum + " hours this week");


        //Finding the largest number

        double max = hoursWorked[0];
        for (int x = 0; x < hoursWorked.length; x++) {
            if (hoursWorked[x] > max) {
                max = hoursWorked[x];
            }
        }

        System.out.println("The most hours you worked was: " + max);

    }
}
