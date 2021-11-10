import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Conversion {

    static Scanner input = new Scanner(System.in);

    public static final double DOLLAR_TO_EURO = 0.86;
    public static final double DOLLAR_TO_POUND = 0.74;
    public static final double DOLLAR_TO_GRIVNA = 26.05;

    public static final double EURO_TO_DOLLAR = 1.16;
    public static final double POUND_TO_DOLLAR = 1.35;
    public static final double GRIVNA_TO_DOLLAR = 0.04;

    public static char euro = 'E';
    public static char grivna = 'U';
    public static char pound = 'P';
    public static char dollar = '$';


    public static void main(String[] args) {

        double number = inputValue();
        char currency1 = inputCurrency();
        char currency2 = inputCurrency();

        double dollar_result = convertToDollar(number, currency1);
        double result = doConvert(dollar_result, currency2);

        System.out.println("Your result! " + result);


    }


    public static double inputValue () {
        System.out.println("Please, enter value of money you want to convert: ");
        double money_value;

        if (input.hasNextDouble()) {
            money_value = input.nextDouble();
        } else {
            System.out.println("Wrong input amount of your money, please, try again!");
            input.next();
            money_value = inputValue();
        }

        return  money_value;
    }
    //String is still problem for me to use
    public static char inputCurrency() {
        System.out.println("Please, choose currency: ");
        char currency;

        if (input.hasNext()) {
            currency = input.next().charAt(0);
        } else {
            System.out.println("Wrong input currency, please, try again!");
            input.next();
            currency = inputCurrency();
        }
        return currency;
    }

    public static double convertToDollar (double number, char currency1) {

        double dollar_result = 0;


        if (currency1 == dollar) {
            dollar_result = number;
        } else if (currency1 == euro) {
            dollar_result = number * EURO_TO_DOLLAR;
        } else if (currency1 == grivna) {
            dollar_result = number * GRIVNA_TO_DOLLAR;
        } else if (currency1 == pound) {
            dollar_result = number * POUND_TO_DOLLAR;
        } else {
            System.out.println("Smth went wrong in block convertToDollar! " + dollar_result);
        }

        return  dollar_result;

    }

    public static double doConvert (double dollar_result, char currency2) {
        double result = 0;

        if (currency2 == dollar) {
            System.out.println("You cannot convert the same currency: " + dollar_result);
        } else if  (currency2 == euro) {
                result  = dollar_result * DOLLAR_TO_EURO;
        } else if (currency2 == grivna) {
            result  = dollar_result * DOLLAR_TO_GRIVNA;
        } else if (currency2 == pound) {
            result = dollar_result * DOLLAR_TO_POUND;
        } else {
            System.out.println("Smth went wrong in block doConvert! " + result);
        }

        return result;


    }


}
