package lesson_06;

public class Calculator {

    // Method signature
    // Method overloading _ Nap chong ham

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //Varargs | Rest parameters
    public int sum(int initNumber, int... restNumbers) {
        int arrTotal = 0;
        for (int number : restNumbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }

    // WHEN : overloading happens : appeared at compile time
    // WHEN : overriding happens :  appeared at run time
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(5, 7);
        calculator.sum(7, 8, 9);
        System.out.println(calculator.sum(8, 9, 10, 2, 8));
    }
}
