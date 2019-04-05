public class Student {
    private String firstName;
    private String pantherID;

    public Student(String aName, String anID){
        this.firstName = aName;
        this.pantherID = anID;
    }
    public Student(){
        this.firstName = "Noname";
        this.pantherID = "000000";
    }

    public String getFirstName() {
        return firstName;
    }
    public String getPantherID() {
        return pantherID;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setPantherID(String pantherID) {
        this.pantherID = pantherID;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", pantherID='" + pantherID + '\'' +
                '}';
    }

    public void walk(){
        System.out.println("Walking forward");
    }
}
