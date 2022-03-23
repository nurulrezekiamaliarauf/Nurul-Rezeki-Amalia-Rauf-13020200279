/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_sourcecode;

/**Nim  :13020200279
 * Nama : Nurul Rezeki Amalia Rauf
 * Hari, Tanggal : Selasa, 15 Maret 2022
 */
public class Casting2 {
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int a=8,b=9;
        float d=2.f,e=3.2f;
        char g='5';
        double k=3.14;
        String n="67",m="45", l="100";
        
        a = Integer.parseInt(n); /*Konversi String ke Integer*/
        k = Double.parseDouble(m); /*Konversi String ke Double*/
        d = Float.parseFloat(l); /*Konversi String ke Float*/
        System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);
        
        n = String.valueOf(b); /*Konversi Integer ke String*/
        m = String.valueOf(g); /*Konversi Karakter ke String*/
        l = String.valueOf(e); /*Konversi Float ke String*/
        System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
        
        k = Double.valueOf(a).intValue(); /*Konversi Integer ke Double*/
        double c = Integer.valueOf(b).doubleValue();
        System.out.println("k : "+k+"\nc : "+c+"\nl : "+l); 
    }
}
