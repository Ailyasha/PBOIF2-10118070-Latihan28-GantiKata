/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Mengganti Kata=====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        Scanner input = new Scanner(System.in);
        String kataAwal = input.nextLine();
        
        System.out.print("Ganti Kata : ");
        String kata1 = input.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata2 = input.nextLine();
        
        String kataBaru = kataAwal.replace(kata1, kata2) ;
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : " + kataAwal);
        System.out.println("Kalimat Baru : " + kataBaru);
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
