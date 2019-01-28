public class Class1 {


    public static void main(String[] args) {

        System.out.println(average(5,4,7,8,45,12454,3));

    }

    //... means we don't know how many numbers
    public static int average(int...numbers){
        int total=0;
        for(int x:numbers)
            total+=x;

        return total/numbers.length;
    }

}

