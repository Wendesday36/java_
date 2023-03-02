/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciklusok;

/**
 *
 * @author berta
 */
public class Szamok {

    public static void main(String[] args) {
        szamokAlap();
        beKeres();
    }

    private static void szamokAlap() {
        for (int x = 2; x < 3; x++) {
            for (int i = 2; i < 4; i++) {
                for (int n = 2; n < 5; n++) {
                    System.out.println(x + " " + i + " " + n);

                }

            }
        }

    }

    private static boolean beKeres() {
        System.out.println("Ismétléssel vagy ismétlés nélkül szeretnéd?");
        boolean False;
        if (Boolean.FALSE) {
            szamokAlap();
        } 
        else if(Boolean.TRUE) {
            for (int x = 2; x < 3; x++) {
                for (int i = 3; i < 4; i++) {
                    for (int n = 2; n < 5; n++) {
                        System.out.println(x + " " + i + " " + n);

                    }

                }
            }
        }
        return false;
   
    }
}
