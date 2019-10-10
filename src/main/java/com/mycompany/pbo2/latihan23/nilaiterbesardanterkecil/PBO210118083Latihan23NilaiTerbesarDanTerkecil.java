/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan23.nilaiterbesardanterkecil;
    import java.util.Scanner;
/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Program : Nilai Terbesar dan Terkecil
 */
public class PBO210118083Latihan23NilaiTerbesarDanTerkecil {
    public static int mahasiswa, terbesar, terkecil;
    public static String nama;
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("==== Program Nilai Terbesar dan Terkecil ====");
        System.out.print("Masukan Nama Petugas : " );
        nama = scanner.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        mahasiswa = scanner.nextInt();
        int[] nilai = new int [mahasiswa];
        for (int i=0; i<mahasiswa; i++){
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + ":");
            nilai[i] = scanner.nextInt();
        }
        
        terbesar = nilai[0];
        terkecil = nilai[0];
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for (int i=0; i<mahasiswa; i++){
            if (terbesar < nilai [i])
                terbesar = nilai [i];
            if (terkecil > nilai [i])
                terkecil = nilai [i];
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + ":"+ nilai [i] );
            
        }
        System.out.println("Nilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
    }
}
