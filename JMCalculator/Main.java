package JMCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите два числа от 1 до 10 c оператором: ( +, -, *, / ); \nНапример: 1 + 1 либо X - V;");
        System.out.print("Введите два числа: ");

        String s1 = scan.next();
        String operator = scan.next();
        String s2 = scan.next();

        try {

            if (ArabicNumber.isNum(s1) && ArabicNumber.isNum(s2)) {

                try {

                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);

                    if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {

                        switch (operator) {
                            case "+" -> System.out.println("Ответ: " + ArabicNumber.sum(n1, n2));
                            case "-" -> System.out.println("Ответ: " + ArabicNumber.sub(n1, n2));
                            case "*" -> System.out.println("Ответ: " + ArabicNumber.mul(n1, n2));
                            case "/" -> System.out.println("Ответ: " + ArabicNumber.div(n1, n2));
                            default -> System.err.println("Введен не верный оператор: " + "\" " + operator + " \"");
                        }
                    } else System.out.println("Введите числа от 0 до 10!");

                } catch (ArithmeticException e) {
                    System.err.println("Деление на ноль невозможно!");
                    e.printStackTrace();
                }

            } else if (RomanNumber.romanValue(s1) && RomanNumber.romanValue(s2)) {

                int n1 = RomanNumber.romanSym(s1);
                int n2 = RomanNumber.romanSym(s2);

                try {

                    switch (operator) {
                        case "+" -> System.out.println("Ответ: " + RomanNumber.sum(n1, n2));
                        case "-" -> System.out.println("Ответ: " + RomanNumber.sub(n1, n2));
                        case "*" -> System.out.println("Ответ: " + RomanNumber.mul(n1, n2));
                        case "/" -> System.out.println("Ответ: " + RomanNumber.div(n1, n2));
                        default -> System.err.println("Введен не верный оператор: " + "\" " + operator + " \"");
                    }

                } catch (ArithmeticException e) {
                    System.err.println("Деление на ноль невозможно!");
                    e.printStackTrace();
                }
            } else throw new Error();
        } catch (Error e) {
            System.err.println("Введены разные значения! " + s1 + " " + operator + " " + s2);
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error Exception!");
            e.printStackTrace();
        }
    }
}
