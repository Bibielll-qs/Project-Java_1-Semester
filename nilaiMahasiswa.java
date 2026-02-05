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

public class nilaiMahasiswa { //medeklarasikan kelas nilaiMahasiswa

    public static void main(String[] args) { //membuka main block atau metode menjalankan program
        Scanner scanner = new Scanner(System.in); //membuat objek scanner dengan nama scanner agar bisa membaca input dari keyboard

        System.out.println("~~~~~NILAI FINAL MAHASISWA~~~~~"); //mencetak tulisan tersebut pada monitor

        System.out.print("Masukkan nilai UTS 1 :"); //meminta user memasukkan data nilai UTS 1
        double uts1 = scanner.nextDouble(); //memasukkan data uts1 ke variabel bertipe double

        System.out.print("Masukkan nilai UTS 2 :"); //meminta user memasukkan data nilai UTS 2
        double uts2 = scanner.nextDouble(); //memasukkan data uts2 ke variabel bertipe double

        System.out.print("Masukkan nilai UAS :"); //meminta user memasukkan data nilai UAS
        double uas = scanner.nextDouble(); //memasukkan data uas ke variabel bertipe double

        double nilaiFinalMahasiswa = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas); //
        char nilaiHuruf; //mendeklarasikan nilaiHuruf merupakan data bertipe char

        if (nilaiFinalMahasiswa >= 80) { //perhitungan nilaiFinalMahasiswa dengan syarat, kondisi 1
            nilaiHuruf = 'A'; //akan dieksekusi jika kondisi 1 benar
        } //akhir dari kondisi 1
        else if (65 <= nilaiFinalMahasiswa && nilaiFinalMahasiswa < 80) { //perhitungan nilaiFinalMahasiswa dengan syarat, kondisi 2 
            nilaiHuruf = 'B'; //akan dieksekusi jika kondisi 1 salah dan kondisi 2 benar
        } //akhir dari kondisi 2
        else if (55 <= nilaiFinalMahasiswa && nilaiFinalMahasiswa < 65) { //perhitungan nilaiFinalMahasiswa dengan syarat, kondisi 3
            nilaiHuruf = 'C'; //akan dieksekusi jika kondisi 1 dan 2 salah, kondisi 3 benar
        } //akhir dari kondisi 3
        else if (50 <= nilaiFinalMahasiswa && nilaiFinalMahasiswa < 55) { //perhitungan nilaiFinalMahasiswa dengan syarat, kondisi 4
            nilaiHuruf = 'D'; //akan dieksekusi jika kondisi 1,2, dan 3 salah, kondisi 4 benar
        } //akhir dari kondisi 4
        else { //menjalankan kondisi ini jika semua kondisi di atas salah
            nilaiHuruf = 'E'; //akan dieksekusi jika semua kondisi di atas ssalah, selain dari atas
        } //akhir dari selain kondisi di atasnya
        System.out.println("Nilai Total Mahasiswa :" + nilaiFinalMahasiswa); //mencetak hasil dari Nilai Total Mahasiswa yang diinput di keyboard
        System.out.println("Nilai Final :" + nilaiHuruf); //mencetak hasil dari Nilai Final yang diinput di keyboard
    } //akhir dari main atau metode program
} //akhir dari kelas nilaiMahasiswa
