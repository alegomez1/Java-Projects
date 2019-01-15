public class ForLoopArray {

    public static void main(String[] args) {

        double[] numList = {120.5, 322.8, 144.0, 53.2};

        //Print all the array elements
        for (int x=0; x < numList.length; x++) {
            System.out.println(numList[x]);
        }


        //Sum all the elements of an array
        double sum = 0;
        for (int x=0; x < numList.length; x++){
            sum = sum + numList[x];

        }

        System.out.println("The sum is: " + sum);


        //Find the largest element of an array
        double max = numList[0]; //Initializing the first element to be the largest element
        for (int x = 1; x < numList.length; x++) {

            //Compare the element with the largest element
            //If the next element is larger than the last element, then
            //the new element is the maximum(largest element)

            if (numList[x] > max) {
                max = numList[x];

            }

        }

        System.out.println("The max value is: " + max);


    }
}
