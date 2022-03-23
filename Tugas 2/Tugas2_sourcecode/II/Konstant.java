/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode.II;

/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Rabu, 16 Maret 2022
 * Waktu: 08.00 WITA
 */
import java.util.Scanner;
public class Konstant {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan=new Scanner(System.in);
        /* program */ /* baca data */
        System.out.print ("Jari-jari lingkaran =");
        r = masukan.nextFloat();
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");
    }
}
