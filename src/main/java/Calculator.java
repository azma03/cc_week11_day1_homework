public class Calculator {

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public float divide(float firstNumber, float secondNumber){
        if(secondNumber != 0){
            return firstNumber / secondNumber;
        }
        return 0;
    }
}
