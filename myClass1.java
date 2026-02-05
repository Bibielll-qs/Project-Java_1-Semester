/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat

/**
 *
 * @author LENOVO
 */
public class myClass1 { //mendeklarasikan kelas myClass1
    public static void main(String[] args) { //membuka main block atau metode menjalankan program
        boolean a, b, c; //mendeklarasikan variabel a, b, c bertipe boolean
        a = b = c = true; //menyimpan true pada a, b, c
        
        if(!a || (b && c)) { //perbandingan nilai true atau false dengan syarat
            System.out.println("If executed");//dieksekusi jika salah satu dari or bernilai true
        } //akhir dari kondisi ini
        else { //selain dari di atas
            System.out.println("else executed"); //dieksekusi jika kondisi di atas false
        } //akhir dari selian dari di atas
    } //akhir dari main atau metode program
} //akhir dari kelas myClass1