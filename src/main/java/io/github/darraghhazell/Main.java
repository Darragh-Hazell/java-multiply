package io.github.darraghhazell;

public class Main {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        var stringNumberOne = System.getenv("NUMBER1");
        var stringNumberTwo = System.getenv("NUMBER2");
        try {
            numberOne = Integer.parseInt(stringNumberOne);
            numberTwo = Integer.parseInt(stringNumberTwo);
        } catch (NumberFormatException e) {
            System.out.println("Provided inputs are not proper integers: " + e.getMessage());
            return;
        }
        System.out.println(numberOne + " * " + numberTwo + " = " + numberOne * numberTwo);
    }
}