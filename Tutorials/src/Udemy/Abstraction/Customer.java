package Udemy.Abstraction;

public abstract class Customer {

   private String name;
   private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Abstract method
    public abstract String getCustomerInfo();
}
