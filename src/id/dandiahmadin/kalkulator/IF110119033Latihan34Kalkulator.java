/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.kalkulator;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi kalkulator dengan konsep pendekatan berbasis objek
 */
public class IF110119033Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Kalkulator calculator = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukan Angka ke-1 : ");
        calculator.value1 = input.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        calculator.value2 = input.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calculator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calculator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + calculator.bagiBilangan());
        System.out.println("Hasil Sisa : " + calculator.sisaBilangan());
    }
    
}
