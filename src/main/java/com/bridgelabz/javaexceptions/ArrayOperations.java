package com.bridgelabz.javaexceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperations {

    public static void retrieveValue(int[] array, int index) {
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to retrieve: ");
            int index = scanner.nextInt();

            retrieveValue(array, index);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}

