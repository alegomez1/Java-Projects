package Udemy.Abstraction;

public class AbstractionExample {

    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.setEmpID("12345");
        empl1.setName("Steve");
        empl1.setAddress("Cupertino Lane");
        System.out.println(empl1.getCustomerInfo());

    }
}
