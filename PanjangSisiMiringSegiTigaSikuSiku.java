/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanDua; //menyimpan file ke folder pertemuanDua

/**
 *
 * @author LENOVO
 */
public class PanjangSisiMiringSegiTigaSikuSiku { //mendeklarasikan atau menyatakan kelas PanjangSisiMiringSegiTigaSikuSiku
    public static void main(String[] args) { //metode untuk memulai atau menjalankan program
        int alas, tinggi; //mendeklarasikan atau menyimpan bilangan bulat untuk alas dan tinggi
        double panjangSisiMiring; //mendeklarasikan atau menyimpan bilangan desimal untuk panjangSisiMiring
        
        alas = 8; //besar alas yang disimpan adalah 8
        tinggi = 10; //besar tinggi yang disimpan adalah 10
        panjangSisiMiring = Math.sqrt ((alas * alas) + (tinggi * tinggi)); 
        //rumus perhitungan panjangSisisMiring adalah akar ((alas x alas) + (tinggi x tinggi))
        System.out.println("+Hasil dari panjang sisi segitiga siku-siku adalah :"+panjangSisiMiring); 
        //mencetak hasil dari panjang segitiga siku-siku adalah 750
   } //akahir dari metode program
} //akhir dari kelas PanjangSisiMiringSegiTigaSikuSiku
