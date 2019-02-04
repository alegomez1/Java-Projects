public class TimeClass {

    public static void main(String[] args) {

        TimeClassDomain tunaObject = new TimeClassDomain();

        TimeClassDomain tunaObject2 = new TimeClassDomain(5);

        TimeClassDomain tunaObject3 = new TimeClassDomain(5, 23);

        TimeClassDomain tunaObject4 = new TimeClassDomain(5, 23, 12);

        System.out.printf("%s\n", tunaObject.toMilitaryTime());

        System.out.printf("%s\n", tunaObject2.toMilitaryTime());

        System.out.printf("%s\n", tunaObject3.toMilitaryTime());

        System.out.printf("%s\n", tunaObject4.toMilitaryTime());




    }
}
