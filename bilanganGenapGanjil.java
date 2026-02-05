/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat

/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memangggil fungsi kelas scanner

public class bilanganGenapGanjil { //mendeklarasikan atau menyatakan kelas bilanganGenapGanjil
    public static void main(String[] args){ //membuka main block atau metode menjalankan program
        Scanner scanner = new Scanner(System.in); //membuat objek scanner dengan nama scanner agar bisa membaca input dari keyboard
        
        System.out.print("Masukkan nilai bilangan bulat:"); //meminta user memasukkan data nilaiBilangan user
        int nilaiBilangan = scanner.nextInt(); //memasukkan data nilaiBilangan ke data variabel bertipe integer
        
        if(nilaiBilangan % 2 == 0){ //perhitungan nilaiBilangan denagn syarat habis dibagi 2, kondisi 1
            System.out.println(+nilaiBilangan+ " adalah tipe bilangan genap");//akan dieksekusi jika bilangan bertipe genap benar
        } //akhir dari kondisi 1
        else{ //menjalankan kondisi ini jika kondisi di atas salah
            System.out.println("Tipe bilangan adalah :"+nilaiBilangan+ "adalah bilanagan ganjil"); 
            //akan dieksekusi jika kondisi di atas salah atau bilangan bertipe ganjil
        } //akhir dari kondisi selain di atasnya
    } //akhir dari main atau metode program
} //akhir kelas bilanganGenapGanjil

