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
public class nilaiFinal { //mendeklarasikan atau menyatakan kelas nilaiFinal
    public static void main(String[] args){ //metode untuk menjalankan program
    Scanner scanner = new Scanner(System.in); //memanggil fungsi scanner membaca input di keyboard
    
    System.out.println("~~~~~NILAI FINAL~~~~~"); //mencetak tulisan tersebut ke tampilan layar
    
    System.out.println("Masukkan nilai Ujian Sisipan 1 :"); //meminta user memasukkan data nilai Ujian Sisipan 1
    double ujianSisipan1 = scanner.nextDouble(); //mendeklarasikan ujianSsisipan1 bertipe double
    
    System.out.println("Masukkan nilai Ujian Sisipan 2 :"); //meminta user memasukkan data nilai Ujian Sisipan 2
    double ujianSisipan2 = scanner.nextDouble(); //mendeklarasikan ujianSisipan2 bertipe double
    
    
    System.out.println("Masukkan nilai Ujian Akhir Semester :"); //meminta user memasukkan data nilai Ujian Akhir Semester
    double uas = scanner.nextDouble(); //mendeklarasikan uas bertipe double
    double nilaiFinal = (0.3 * ujianSisipan1) + (0.3 * ujianSisipan2) + (0.4 * uas); 
    //mendeklarasikan rumus nilai final bertipe double
    
    System.out.println("Nilai Final :"+nilaiFinal); //mencetak hasil Nilai Final yang diinput pada tampilan
    } //akhir dari metode program
} //akhir dari kelas nilaiFinal
