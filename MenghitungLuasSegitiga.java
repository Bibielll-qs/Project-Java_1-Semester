/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanDua;//untuk menyimpan file ke folder pertemuanDua

/**
 *
* @author LENOVO
 */
public class MenghitungLuasSegitiga {//mendeklarasikan kelas MenghitungLuasSegitiga 
    public static void main(String[] args) {//metode untuk menjalankan program
        int alas, tinggi;//mendeklarasikan atau menyimpan bilangan bulat untuk alas dan tinggi
        double luasSeg;//mendeklarasikan atau menyimpan bilangan desimal untuk luasSeg
        
        alas = 35;//besar alas adalah 35
        tinggi = 3;//besar tinggi adalah 3
        luasSeg = 0.5 * alas * tinggi;//perhitungan luasSeg didapat dari 0.5 x alas x tinggi 
        System.out.println("Hasil dari luas segitiga dengan alas : "+alas+" dan tinggi :"+tinggi+" adalah ="+luasSeg);
        //mencetak hasil dari luas segitiga dengan alas 35 dan tinggi 3 adalah 52.5
    }//akhir dari metode program
}//akhir dari kelas MenghitungLuasSegitiga
