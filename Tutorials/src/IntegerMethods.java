public class IntegerMethods {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;

        String str = "1800";
        Integer f = Integer.parseInt(str);
        System.out.println(f*2);

        int e = 500; // wont have all the functions that Integer has since it's primitve

        System.out.println(a.intValue()); //gives int value of Integer
        System.out.println(b.doubleValue()); //gives double value
        System.out.println(c.floatValue()); // gives float value
        System.out.println(Integer.parseInt("233211")); // converts String to int
        System.out.println(Integer.compare(100, 100)); //if same returns 0
        System.out.println(Integer.compare(100, 90)); //if first is greater returns 1
        System.out.println(Integer.compare(90, 100)); //if second is greater returns -1
        System.out.println(a.equals(d)); //return boolean
        System.out.println(a.equals(c)); //returns boolean
        System.out.println(Integer.divideUnsigned(100, 10)); // returns 10 (100/10)
        System.out.println(Integer.min(109, 50)); //returns 50 because it is the smallest of the two









    }
}