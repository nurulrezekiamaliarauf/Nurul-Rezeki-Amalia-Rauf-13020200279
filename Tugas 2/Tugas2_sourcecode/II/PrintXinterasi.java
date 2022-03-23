/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode.II;

/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Kamis, 17 Maret 2022
 * Waktu: 08.00 WITA
 */
import java.util.Scanner;
public class PrintXinterasi {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }else{ 
            /* MInimal ada satu data yang dijumlahkan */
            Sum = x; /* Inisialisasi; invariant !! */
            for (;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x==999)
                break;
                else{
                    Sum = Sum + x; /* Proses */
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
        /* Terminasi */
    }
}
