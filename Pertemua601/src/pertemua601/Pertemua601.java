/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemua601;

import java.util.Scanner;

/**
 *
 * @author Linvianti
 * TGL : 15 April 2025
 */
public class Pertemua601 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb= new VolumeBalok();
        Scanner inp = new Scanner (System.in);
        
        System.out.println("Hitung Volume Balok");
        System.out.print("Nilai Panjang: ");
        vb.panjang = inp.nextInt();
        System.out.print("Nilai Lebar: ");
        vb.lebar = inp.nextInt();
        System.out.print("Nilai Tinggi: ");
        vb.tinggi= inp.nextInt();
        System.out.println("Nilai Volumenya: ");
        System.out.println("V = P * L * T ");
        System.out.printf(" = %d * %d * %d\n ",vb.panjang,vb.lebar ,vb.tinggi);
        System.out.printf(" = %d'",vb.Volume());
    }
    
}
