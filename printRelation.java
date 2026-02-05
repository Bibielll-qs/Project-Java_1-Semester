/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat

/**
 *
 * @author LENOVO
 */
public class printRelation { //mendeklarasikan kelas printRelation
    public static void main(String[] args) { //membuka main block atau metode menjalankan program
    
        int a = 7 * 3 + 6 / 2 - 5; //mendeklarasikan perhitungan a merupakan variabel bertipe integer
        int b = 21 - 8 + a % 3 * 11; //mendeklarasikan perhitungan b merupakan variabel bertipe integer
        
        if(a<b) { //perbandingan dengan syarat a lebih kecil dari b, kondisi 1
            System.out.println("A is less than B"); //akan dieksekusi jika kondisi 1 benar
        } //akhir dari kondisi 1
        if(a==b) { //perbandingan dengan syarat a sama dengan b, kondisi 2
            System.out.println("A is equal to B"); //akan dieksekusi jika kondisi 1 salah dan kondisi 2 benar
        } //akhir dari kondisi 2
        if(a>b) { //perbandingan denagn syarat a lebih besar dari b, kondisi 3
            System.out.println("A is greater than B"); //akan dieksekusi jika kondisi 1 dan 2 salah, kondisi 3 dijalankan
        } // akhir dari kondisi 3
    } //akhir dari main atau metode program
} //akhir dari kelas printRelation
