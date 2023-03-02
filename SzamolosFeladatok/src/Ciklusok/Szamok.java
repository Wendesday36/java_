/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciklusok;

import java.util.Scanner;

/**
 *
 * @author berta
 */
public class Szamok {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        szamokAlap();
        beKeres();
    }

//    private static void szamokAlap() {
//        for (int x = 2; x < 3; x++) {
//            for (int i = 2; i < 4; i++) {
//                for (int n = 2; n < 5; n++) {
//                    System.out.println(x + " " + i + " " + n);
//
//                }
//
//            }
//        }
//
//    }
    private static void beKeres() {
        System.out.print("Ismétléssel?(i/n):");
        boolean ismetlessel = sc.next().equals("i");

        int db = 0, ismnlkdb = 0;
        for (int x = 2; x < 4; x++) {
            for (int i = 2; i < 4; i++) {
                for (int n = 2; n <= 4; n++) {
                    if (ismetlessel) {

                        System.out.println(x + " " + i + " " + n);
                        db++;
                    } else if (i != x && i != n && n != x) {
                        System.out.println("" + x + i + n);
                        ismnlkdb++;
                    }
                }

            }
        }
        if (ismetlessel) {
            System.out.println("az összes permutácio:" + db);

        } else {
            System.out.println("ism nelkuli osszes permutácio:" + ismnlkdb);
        }
    }
}
