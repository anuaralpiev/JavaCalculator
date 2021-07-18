package JMCalculator;

import java.util.InputMismatchException;

public class RomanNumber {

    public static boolean romanValue(String value) {
        String[] arr = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < arr.length; i++) {
            if (value.equals(arr[i])) return true;
        }
        return false;
    }

    public static int romanSym(String num) {
        try {
            if (num.equals("I")) return 1;
            else if (num.equals("II")) return 2;
            else if (num.equals("III")) return 3;
            else if (num.equals("IV")) return 4;
            else if (num.equals("V")) return 5;
            else if (num.equals("VI")) return 6;
            else if (num.equals("VII")) return 7;
            else if (num.equals("VIII")) return 8;
            else if (num.equals("IX")) return 9;
            else if (num.equals("X")) return 10;
            else if (num.equals("O")) return 0;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных! " + e);
        }
        return -1;
    }

    public static String romanNum(int roman) {

        String s = "";

        while (roman >= 100) {
            s += "C";
            roman -= 100;
        }
        while (roman >= 90) {
            s += "XC";
            roman -= 90;
        }
        while (roman >= 50) {
            s += "L";
            roman -= 50;
        }
        while (roman >= 40) {
            s += "XL";
            roman -= 40;
        }
        while (roman >= 10) {
            s += "X";
            roman -= 10;
        }
        while (roman >= 9) {
            s += "IX";
            roman -= 9;
        }
        while (roman >= 5) {
            s += "V";
            roman -= 5;
        }
        while (roman >= 4) {
            s += "IV";
            roman -= 4;
        }
        while (roman >= 1) {
            s += "I";
            roman -= 1;
        }
        return s;
    }

    public static String sum(int a, int b) {
        return romanNum(a + b);
    }

    public static String sub(int a, int b) {
        return romanNum(a - b);
    }

    public static String mul(int a, int b) {
        return romanNum(a * b);
    }

    public static String div(int a, int b) {
        return romanNum(a / b);
    }
}
