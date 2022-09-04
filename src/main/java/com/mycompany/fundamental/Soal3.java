/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.fundamental;

/**
 *
 * @author acer
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double x = 92.98;
        
        // fungsi round() dari class Math akan membulatkan sebuah bilangan
        // floating point/pecahan ke nilai terdekat
        // nilai nx adalah hasil dari pembulatan terdekat dari nilai x
        int nx = (int) Math.round(x);
        
        System.out.println(nx);
    }
}