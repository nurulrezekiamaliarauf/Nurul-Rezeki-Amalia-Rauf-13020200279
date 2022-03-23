/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode;

/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Selasa, 15 Maret 2022
 * Waktu: 08.00 WITA
 */
public class Ekspresi1 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int x = 1; int y = 2; float fx; float fy;
        /* ALGORITMA */
        System.out.print ("x/y (format integer) = "+ x/y); 
        System.out.print ("\nx/y (format float) = "+ x/y);
        /* supaya hasilnya tidak nol */
        fx=x;
        fy=y;
        System.out.print ("\nx/y (format integer) = "+ fx/fy); 
        System.out.print ("\nx/y (format float) = "+ fx/fy);
        /* casting */
        System.out.print ("\nfloat(x)/float(y) (format integer) = "+ 
        (float)x/(float)y); 
        System.out.print ("\nfloat(x)/float(y) (format float) = "+ 
        (float)x/(float)y);
        x = 10; y = 3;
        System.out.print ("\nx/y (format integer) = "+ x/y); 
        System.out.print ("\nx/y (format float) = "+ x/y); 
    }
}
