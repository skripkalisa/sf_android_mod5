package Mod3;

// Создать и вывести на печать двумерный массив.
// Размер задаётся пользователем.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size.");
        System.out.println("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];


        for(int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i * j;
                System.out.print(Integer.toString(i + 1) + Integer.toString(j + 1) + " ");
            }
            System.out.println("|");
        }
        System.out.println("\n");
        for(int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < columns; j++) {

                System.out.print( matrix[i][j]+ " ");
            }
            System.out.println("|");
        }
    }
}
