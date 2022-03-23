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
public class If2 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stubu
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a >= 0){
        System.out.println ("Nilai a positif "+ a);
        }else /* a< 0 */
            {
                System.out.println ("Nilai a negatif "+ a);
            }
    }
}

