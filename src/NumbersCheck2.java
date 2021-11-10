import java.util.Scanner;

public class NumbersCheck2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input_number();

        if (number == 0) {
            System.out.println("You are totally wrong!");
        }

        if (isDivide(number)) {
            System.out.println("Number is Prime! ");
        } else {
            System.out.println("Number is not Prime! ");
        }

        if (isPositive(number)) {
            System.out.println("Number is Posi! ");
        } else {
            System.out.println("Number is Negie! ");
        }

        if (isDivide(number)) {
            System.out.println("Numbers sre divided!");
        } else {
            System.out.println("Not divided!");
        }

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

    public static boolean isPrime(int number) {
        boolean result = false;

        if (number%2 == 1) {
            result = true;
        } else {
            System.out.println("Number is not prime! ");
        }

        return result;

    }

    public static boolean isPositive(int number) {
        boolean result = true;

        if (number < 0) {
            return false;
        }
        return result;
    }

    public static boolean isDivide(int number) {
        boolean result = false;
        boolean result_for = true;




        int nums[];
        nums = new int[] {2, 5, 3, 6, 9};

        for (int i = 1; i < nums.length; i++) {
            if (number % nums[i] == 1) {
                return result_for;
            } else {
                return result;
            }
        }

        if (result == result_for) {
            System.out.println("Numbers are legally divideded!");
        } else {
            System.out.println("Not legally!");
        }
        return result;

    }



}
