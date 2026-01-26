/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanDua; //menyimpan file ke folder pertemuanDua

/**
 *
 * @author LENOVO
 */
public class KelilingdanLuasLingkaran { //mendeklarasikan kelas KeliingdanLuasLingkaran
    public static void main(String[] args) { //metode untuk menjalankan atau memulai program
        int jariJari; //mendeklarasikan atau menyimpan bilangan bulat untuk jariJari
        double PHI, keliling, luas; //mendeklarasikan atau menyimpan bilangan desimal untuk PHI, keliling, dan luas
        
        jariJari = 21; //besar jariJari yang disimpan adalah 21
        PHI = 3.14; //besar PHI yang disimpan adalah 3.14
        keliling = 2 * PHI * jariJari; //rumus perhitungan keliling adalah 2 x PHI X jariJari
        luas = PHI * jariJari * jariJari; //rumus perhitungan luas adalah PHI X jariJari x jariJari
        System.out.println("Hasil dari keliling lingkaran adalah :"+keliling); 
        //mencetak hasil dari keliling lingkaran adalah 131.88
        System.out.println("Hasil dari luas lingkaran adalah :"+luas); 
        //mencetak hasil dari luas lingkaran adalah 1384.74
    } //akhir dari metode program
} //akhir dari kelas KelilingdanLuasLingkaran