package Udemy.Overloading;

public class Addition {

    //return two ints
   public int add(int a, int b){
        return a + b;
    }
    //three parameters
    public int add(int a, int b, int c){
        return a + b + c;
    }
    //doubles
    public double add(double a, double b){
        return a + b;
    }

    public static void main(String args[]){
       Addition obj = new Addition();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(15.56, 12.22));
    }
}
