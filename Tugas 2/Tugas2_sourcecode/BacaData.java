/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode;
/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Senin, 14 Maret 2022
 * Waktu: 08.00 WITA
 */
import java.util.Scanner;
public class BacaData {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ;Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
