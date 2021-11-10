import java.util.Scanner;

public class Arithmetics {

    static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {

        int number1 = input_number();
        int number2 = input_number();
        char operator = input_operator();
        double result = 0;


        if (operator == '+') {
            result = add(number1, number2);
        } else if (operator == '-') {
            result = sub(number1,number2);
        } else if (operator == '*') {
            result = mul(number1, number2);
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("You cannot divide by zero!");
            } else {
                result = div(number1,number2);
            }
        }

        System.out.println("Your result = " + result);


    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    public static int div(int number1, int number2) {
        return number1 / number2;
    }

    public static int input_number () {

        System.out.println("Please, enter number: ");
        int number;
        if(input.hasNextInt()){
            number = input.nextInt();
        } else {
            //try Recursion
            System.out.println("Wrong input, please, enter your number again! ");
            input.next();
            number = input_number();

        }
        return number;
    }

    public static char input_operator() {

        System.out.println("Please, enter operator: ");
        char operator;
        if(input.hasNext()){
            operator = input.next().charAt(0);
        } else {
            //try Recursion
            System.out.println("Wrong input, please, enter your operator again! ");
            input.next();
            operator = input_operator();

        }
        return operator;
    }



}
