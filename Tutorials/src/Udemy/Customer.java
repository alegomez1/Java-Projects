

package Udemy;

import java.util.Scanner;
import java.util.Random;

public class Customer {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random myRan = new Random();
        CustomerConstructor cust = new CustomerConstructor();

        System.out.println("How many customers do you want to add?");

        int numberOfCustomers = keyboard.nextInt();

        String[] customerList = new String[numberOfCustomers];
        int[] idList = new int[numberOfCustomers];

        for (int i = 0; i<numberOfCustomers; i++){

            System.out.println("Customer name:");
            String custName = keyboard.nextLine();
            int custID = myRan.nextInt(101) + 400;
            customerList[i] = custName;
            idList[i] =custID;
        }

        System.out.println(customerList[2]);
        System.out.println(idList[]);


    }
}
