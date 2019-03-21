package Udemy.Abstraction;

public class Employee extends Customer {

   private String empID;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getCustomerInfo(){
        return String.format("Customer: %s, EmployeeID: %s, Address: %s", getName(), getEmpID(), getAddress());
    }
}
