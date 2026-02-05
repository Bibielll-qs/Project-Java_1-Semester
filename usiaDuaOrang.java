/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat
/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memanggil fungsi kelas scanner

public class usiaDuaOrang { //mendeklarasikan atau menyatakan kelas usiaDuaOrang
    public static void main(String[] args){ //membuka main block atau metode menjalankan program
    Scanner scanner = new Scanner(System.in); //membuat objek scanner dengan nama scanner agar bisa membaca input dari keyboard
    
    System.out.println("~~~~~PERBANDINGAN USIA~~~~~"); //mencetak tulisan tersebut pada monitor
    
    System.out.print("Masukkan nama pertama :"); //meminta user memasukkan data nama user pertama
    String nama1 = scanner.next(); //memasukkan data nama1 ke data variabel bertipe string
    System.out.print("Masukkan umur pertama :"); //meminta user memasukkan data umur user pertama
    int  umur1 = scanner.nextInt(); //memasukkan data umur1 ke data variabel bertipe integer
    
    System.out.print("Masukkan nama kedua :"); //meminta user memasukkan data nama user kedua
    String nama2 = scanner.next(); //memasukkan data nama2 ke data variabel bertipe string
    System.out.print("Masukkan umur kedua :"); //meminta user memasukkan data umur user kedua
    int umur2 = scanner.nextInt(); //memasukkan data umur2 ke data variabel bertipe integer
    
    if(umur1>umur2) { //perhitungan umur dengan syarat perbandingan umur, kondisi 1
        System.out.println(nama1 + " lebih tua dari "+nama2); //jika umur1 lebih dari umur2 benar
    } //akhir dari kondisi 1
    else if(umur2>umur1) { //perhitungan umur dengan syarat perbandingan umur, kondisi 2
        System.out.println(nama2 +" lebih tua dari "+nama1); //jika umur2 lebih dari umur1 akan dieksekusi, jika kondisi 1 salah dan kondisi 2 benar
    } //akhir dari kondisi 2
    else { //menjalankan kondisi ini jika kedua  kondisi di atas salah
        System.out.println(nama1 +" dan " +nama2+" memiliki umur yang sama."); //akan dieksekusi jika semua kondisi di atas salah, selain dari atas
    } //akhir dari selain kondisi di atasnya
} //akhir dari main atau metode program
} //akhir dari kelas usiaDuaOrang