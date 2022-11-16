package tdd;

public class Kata {

    public int squareOf(int number) {
        return number * number;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int maxOf(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber? firstNumber: secondNumber;
        //if (firstNumber > secondNumber) return firstNumber;
        //return secondNumber;
    }
}

