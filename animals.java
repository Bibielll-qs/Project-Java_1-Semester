/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat

/**
 *
 * @author LENOVO
 */
public class animals { //mendeklarasikan kelas animals
    public static void main(String[] args) { //membuka main block atau metode menjalankan program
        boolean rabbit = true; //mendeklarasikan variabel rabbit=true, bertipe boolean
        boolean donkey = false; //mendeklarasikan variabel donkey=false, bertipe boolean
        boolean leporidae = true; //mendeklarasikan variabel leporidae=true, bertipe boolean
        
        if(rabbit && donkey || donkey && leporidae || donkey) { //perbandingan dengan syarat and,or,kondisi ini
            System.out.print("DOG "); //dieksekusi jika kondisi ini benar
        } //akhir dari kondisi ini
        if(rabbit && donkey || donkey && leporidae || donkey || rabbit) { //selain dari atas
            System.out.print("CAT "); //dieksekusi jika kondisi di atas salah
        } //akhir selain dari atas
    } //akhir dari main atau metode program
} //akhir dari kelas animals
