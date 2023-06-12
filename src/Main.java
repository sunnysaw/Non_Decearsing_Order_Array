/*
Question : You have been given an integer arraylist "Arr" of size of N. Write a solution to check if it
could become non-decreasing by modifying at most 1 element.
 */
//
import java.util.Scanner;
public class Main {
    static void nonDecreasingOrder(int[] array) {
        int count = 0;
        String a = "ture";
        String b = "false";
        for (int start = 0; start < array.length - 1; start++) {
            if (array[start] > array[start + 1]) {
                array[start + 1] = array[start];
                count++;
            }
        }
        if (count <= 1) {
            System.out.println(a);
        } else
            System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfArray, start;
        System.out.println("Enter the size of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++) {
            array[start] = input.nextInt();
        }
        nonDecreasingOrder(array);
    }
}

