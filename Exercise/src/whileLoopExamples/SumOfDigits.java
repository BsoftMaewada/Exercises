package whileLoopExamples;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfDigits {

    // Print the sum of digits

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits: ");
        int inputNumber = sc.nextInt();
        int sumOfDigits = 0;
        int temp = 0;

        while(inputNumber > 0){
            temp = inputNumber % 10;
            sumOfDigits += temp;
            inputNumber = inputNumber / 10;
        }
        System.out.println("The sum of digits is: " +sumOfDigits);
    }



}
