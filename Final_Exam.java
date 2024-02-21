/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.final_exam;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Final_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int Num = scanner.nextInt();
        int[] numbers = new int[Num];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < Num; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Input numbers:");
        for (int i = 0; i < Num; i++) {
            System.out.println(numbers[i]);
        }
        scanner.close();
    }
}

