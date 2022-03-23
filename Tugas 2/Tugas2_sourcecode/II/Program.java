/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode.II;

/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Senin, 14 Maret 2022
 * Waktu: 08.00 WITA
 */
import java.util.Scanner;
  
public class Program{
	public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
		
		int jam, menit, detik, konversi;

		System.out.print("Masukkan Detik yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jam = konversi/3600;
		menit = (konversi%3600)/60;
		detik = (konversi%3600)%60;

		System.out.println("konversi dari : "+ konversi + "detik, adalah : ");
		System.out.println(jam+" jam : "+menit+"menit : "+detik+"detik");	
	}
}