package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) +  minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int d = 10;
        int rsl = Calculator.sum(d);
        System.out.println("Сумма: " + rsl);
        Calculator calculator = new Calculator();
        rsl = calculator.multiply(d);
        System.out.println("Произведение: " + rsl);
        rsl = Calculator.minus(d);
        System.out.println("Разница: " + rsl);
        rsl = calculator.divide(d);
        System.out.println("Деление: " + rsl);
        rsl = calculator.sumAllOperation(d);
        System.out.println("Сумма всех операций: " + rsl);
    }
}
