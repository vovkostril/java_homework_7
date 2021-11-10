import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int array[] = input_numbers();

        System.out.println("Your result = " + calculator(array));

    }


    public static int[] input_numbers () {

        int size = 3;
        int array[] = new int[size];
        System.out.println("Insert numbers:");

        for (int i = 0; i < size; i++) {
            //if(input.hasNextInt()){
            array[i] = input.nextInt();
            /*} else {
                //try Recursion
                System.out.println("Wrong input, please, enter your number again! ");
                input.next();
                i = input_numbers();

            }*/
        }

        return array;
    }

    public static int calculator (int[] array) {
        int result = 0;
        int size = 3;
        int summ = 0;

        for (int i = 0; i < size; i++) {
            summ += array[i];
        }

        //what if size is not 3, I want customer put size from input later
        result = summ / size;
        return result;


    }



}
