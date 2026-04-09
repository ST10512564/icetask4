/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask4;

/**
 *
 * @author lab_services_student
 */
public class Customer {

    public static void main(String[] args) {
       
        //These must be at the very top of the class
    private String name;
    private int points;

    // Constructor to initialize name and set points to 0 [cite: 47]
    public Customer(String name) {
        this.name = name;
        this.points = 0;
    }
 // Adds 10 points and notifies the user [cite: 10, 49]
    public void addPoints() {
        this.points += 10;
        System.out.println("10 Points added");
    }

   
}
        
        
        
    }
}
