/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanTiga; //menyimpan file folder ke pertemuanTiga

/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memanggil fungsi kelas scanner

public class beratBadanIdeal { //mendeklarasikan atau menyatakan kelas beratBadanIdeal
    public static void main(String[] args) { //metode untuk menjalankan program
        Scanner scanner = new Scanner(System.in); //memanggil fungsi scanner membaca input di keyboard
        
        System.out.println("PROGRAM HITUNG BERAT BADAN"); //mencetak tulisan tersebut pada tampilan layar
        System.out.println("Masukkan tinggi badan (cm):"); //meminta user memasukkan data tinggi badan
        int tinggiBadan = scanner.nextInt(); //mendeklarasikan tinggiBadan merupakan bilangan bertipe integer

        int beratBadanIdeal = tinggiBadan - 100; //mendeklarasikan rumus berat badan ideal

        System.out.println("berat badan ideal anda adalah: " + beratBadanIdeal + "kg");
        //mencetak hasil dari berat badan ideal yang diinput
    } //akhir dari metode program
} //akhir dari kelas beratBadanIdeal
