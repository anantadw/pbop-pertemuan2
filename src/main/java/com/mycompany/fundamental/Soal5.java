/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.fundamental;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String A, B;
        Scanner input = new Scanner(System.in);
        
        System.out.print("A : ");
        A = input.next().toLowerCase();
        System.out.print("B : ");
        B = input.next().toLowerCase();
        
        // sum the length
        int length = A.length() + B.length();
        System.out.println(length);
        
        // determine if A lexicographically larger than B
        int compare  = A.compareTo(B);
        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // capitalize the first letter in A and B and print them on a single line, separated by a space.
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                            + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
