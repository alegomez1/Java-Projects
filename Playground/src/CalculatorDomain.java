public class CalculatorDomain {

    private int firstNumber, secondNumber;

    public CalculatorDomain() {

        firstNumber = 0;

        secondNumber = 0;

    }


    //Addition method

    public int additionMethod(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    //Difference method

    public int differenceMethod(int firstNumber, int secondNumber){
        int difference = secondNumber - firstNumber;
        return difference;
    }

    //Average method

    public double averageMethod(int firstNumber, int secondNumber){

        int sum = firstNumber + secondNumber;
        double average = sum / 2.0;
        return average;

    }

    //Getters and Setters

    public void setFirstNumber(int firstNumber){
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber(){
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "CalculatorDomain{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
