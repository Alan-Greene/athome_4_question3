package inclass_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int num;
        int max = 0;

        while (count < 9){
            try {
                System.out.println("Enter number: " + (count+1));
                num = in.nextInt();
                if (num < 0){
                    System.out.println("Negative number entered. " +
                            "Please enter number " + (count+1) + " again.");
                    num = in.nextInt();
                }
                if (num > max){
                    max = num;
                }
                count++;
            } catch (InputMismatchException i){
                System.out.println("Error in input, please enter digits only");
                in.nextLine();
            }
        }

        System.out.println("The max is: " + max);
    }
}
