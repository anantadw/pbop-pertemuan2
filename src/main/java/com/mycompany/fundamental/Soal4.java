/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.fundamental;

/**
 *
 * @author acer
 */
public class Soal4 {
    
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        
        System.out.println(b);
    }
}
