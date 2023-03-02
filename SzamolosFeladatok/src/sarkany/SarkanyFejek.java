/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarkany;

/**
 *
 * @author berta
 */
public class SarkanyFejek {

    public static void main(String[] args) {
        for (int x = 1; x <= 20; x++) {
            for (int y = 1; y < 13; y++) {
                if (7 * x + 11 * y == 145) {
                    System.out.println("7feju:" + x);
                    System.out.println("11feju:" + y);
                    System.out.println("------------");
                }
            }
        }
    }
}
