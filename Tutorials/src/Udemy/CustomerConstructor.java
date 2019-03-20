package Udemy;

public class CustomerConstructor {

    private String name;
    private int id;

    public CustomerConstructor(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomerConstructor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
