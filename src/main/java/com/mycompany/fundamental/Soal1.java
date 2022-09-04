/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamental;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Soal1 {
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);
        
        while (true) {
            // jawaban menemukan di google menggunakan try-catch
            // jika tidak, program akan error ketika memasukkan bilangan di luar
            // kapasitas tipe 'long'
            try {
                System.out.print("Enter number: ");
                number = input.nextLong();

                System.out.println("Number " + number + " can be fitted in:");
                if (number > Byte.MIN_VALUE && number < Byte.MAX_VALUE) {
                    System.out.println(" * byte");
                }

                if (number > Short.MIN_VALUE && number < Short.MAX_VALUE) {
                    System.out.println(" * short");
                }

                if (number > Integer.MIN_VALUE && number < Integer.MAX_VALUE) {
                    System.out.println(" * int");
                }

                if (number > Long.MIN_VALUE && number< Long.MAX_VALUE) {
                    System.out.println(" * long");
                }
            } catch (Exception e) {
                System.out.println("Number " + input.next() + " can't be fitted anywhere.");
            }
        }
    }
}
