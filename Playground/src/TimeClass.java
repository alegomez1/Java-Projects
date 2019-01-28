public class TimeClass {

    public static void main(String[] args) {

        TimeClassDomain tunaObject = new TimeClassDomain();
        System.out.println(tunaObject.toMilitaryTime());
        tunaObject.setTime(7, 27, 6);
        System.out.println(tunaObject.toString());

        tunaObject.setTime(15, 55, 8);
        System.out.println(tunaObject.toString() +"\n" +   tunaObject.toMilitaryTime());




    }
}
