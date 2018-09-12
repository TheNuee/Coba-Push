package calculator2;

import java.util.Scanner;

import java.util.*;

public class Calculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Data
        double bil1, bil2, hsl = 0;
        char operator;
        //Scanner import
        Scanner sc = new Scanner(System.in);

        //Start Prog.
        System.out.println("**** Kalkulator ****");
        System.out.println("----SETYA ELCOM----");
        System.out.println("#MUHAMMAD RIZKY A.H#");
        System.out.println("####################");
        System.out.println("Tambah ( + ), Kurang ( - ), Kali ( * ), Bagi ( / ), Hasil Bagi ( % )");
        System.out.print("Bilangan Pertama : ");
        bil1 = sc.nextDouble();
        System.out.print("Operasi : ");
        operator = sc.next().charAt(0);
        System.out.print("Bilangan Kedua : ");
        bil2 = sc.nextDouble();

        if (operator == '+') {
            hsl = bil1 + bil2;
            System.out.println("Hasil : " + bil1 + " + " + bil2 + " = " + hsl);
        } else if (operator == '-') {
            hsl = bil1 - bil2;
            System.out.println("Hasil : " + bil1 + " - " + bil2 + " = " + hsl);
        } else if (operator == '*') {
            hsl = bil1 * bil2;
            System.out.println("Hasil : " + bil1 + " * " + bil2 + " = " + hsl);
        } else if (operator == '/') {
            hsl = bil1 / bil2;
            System.out.println("Hasil : " + bil1 + " / " + bil2 + " = " + hsl);
        } else if (operator == '%') {
            hsl = bil1 % bil2;
            System.out.println("Hasil : " + bil1 + " % " + bil2 + " = " + hsl);
        } else {
            System.out.println("XX-I OPERATOR SALAH I-XX");
        }

    }

}
