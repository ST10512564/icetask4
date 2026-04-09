/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.icetask4;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class BeanCafe {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer user = new Customer("Taelo"); 
        int choice = 0;
       while (choice != 4) {
            // Display Menu [cite: 4-8]
            System.out.println("\nJava Bean Café ---");
            System.out.println("1. Buy Coffee (+10 pts)");
            System.out.println("2. Redeem Reward (50 pts)");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> user.addPoints();
                case 2 -> user.redeemPoints();
                case 3 -> user.displayStatus();
                case 4 -> { 
                    System.out.println("Goodbye!");
                    printBonusCalendar(31, 2); // Example: 31 days starting Tuesday [cite: 81-83]
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void printBonusCalendar(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
