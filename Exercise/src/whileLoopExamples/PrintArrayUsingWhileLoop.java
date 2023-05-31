package whileLoopExamples;

import java.util.Scanner;

public class PrintArrayUsingWhileLoop {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4,6};
        int i= 0;

        while (i < 4){
            System.out.println(arr[i]);
            i++;
        }
    }
}
