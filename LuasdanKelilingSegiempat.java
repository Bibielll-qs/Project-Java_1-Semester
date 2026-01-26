/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanDua; //untuk menyimpan file ke folder pertemuanDua

/**
 *
 * @author LENOVO
 */
public class LuasdanKelilingSegiempat { //mendeklarasikan kelas LuasdanKelilingSegiempat
    public static void main(String[] args) { //metode untuk menjalankan atau memulai program
        int panjang, lebar; //mendeklarasikan atau menyimpan bilangan bulat untuk panjang dan lebar 
        int luas, keliling; //mendeklarasikan atau menyimpan bilangan bulat untuk perhitungan luas dan keliling
        
        panjang = 15; //besar panjang yang disimpan adalah 15
        lebar = 10; //besar lebar yang disimpan adalah 10
        luas = panjang * lebar; //rumus perhitungan luas adalah panjang x lebar
        keliling = 2 * (panjang + lebar); //rumus perhitungan keliling adalah (2 x (panjang + lebar))
        System.out.println("Hasil dari luas segiempat adalah :"+luas); //mencetak hasil dari luas segiempat adalah 150
        System.out.println("Hasil dari keliling segiempat adalah :"+keliling); 
        //mencetak hasil dari keliling segiempat adalah 50
    } //akhir daari metode program
} //akhir dari kelas LuasdanKelilingSegiempat
