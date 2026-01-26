/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanTiga; //menyimpan file ke folder pertemuanTiga 

/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memanggil fungsi kelas scanner
public class LuasdanKelilingLingkaran { //mendeklarasikan atau menyatakan kelas LuasdanKelilingLingkaran
    public static void main(String[] args) { //metode untuk menjalankan program
         Scanner dataLingkaran = new Scanner(System.in); //memanggil fungsi scanner membaca input di keyboard
         
         System.out.println("PROGRAM HITUNG LINGKARAN"); //mencetak tulisan tersebut pada tampilan
         double jariJari; //mendeklarasikan atau menyatakan jariJari merupakan bilangan bertipe double atau desimal
         
         System.out.print("Masukkan jariJari Lingkaran:"); //meminta user memasukkan data jari jari
         jariJari = dataLingkaran.nextInt(); //memasukkan nilai jariJari dan dibaca sebagai bilangan bulat
         
         double luasLingkaran = Math.PI * jariJari * jariJari; 
         //mendeklarasikan rumus pperhitungan luasLingkaran bertipe double
         double kelilingLingkaran = 2 * Math.PI * jariJari; 
         //mendeklarasikan rumus perhitungan kelilingLingkaran bertipe double
         
         System.out.println("luas lingkaran tersebut adalah = " + luasLingkaran); 
         //mencetak hasil dari luas lingkaran yang diinput di keyboard
         System.out.println("keliling lingkaran tersebut adalah = " +kelilingLingkaran); 
         //mencetak hasil dari keliling lingkaran yang diinput di keyboard
    } //akhir dari metode program
} //akhir dari kelas LuasdanKelilingLingkaran
