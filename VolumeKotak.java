/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanDua; //menyimpan file ke folder pertemuanDua

/**
 *
 * @author LENOVO
 */
public class VolumeKotak { //mendeklarasikan atau menyatakan kelas VolumeKotak
    public static void main(String[] args){ //metode untuk menjalankan dan memulai program
        int panjang, lebar, tinggi, volume; 
        //mendeklarasikan atau menyimpan bilangan bulat untuk panjang, lebar,tinggi, dan volume
        
        panjang = 10; //besar panjang yang disimpan adalah 10
        lebar = 15; //besar lebar yang disimpan adalah 15
        tinggi = 5; //besar tinggi yang disimpan adalah 5
        volume = panjang * lebar * tinggi; //rumus perhitungan volume yang disimpan adalah panjang x lebar x tinggi
        System.out.println("Hasil dari volume kotak adalah :"+volume); //mencetak hasil dari volume kotak adalah 60
    } //akhir dari metode program
} //akhir dari kelas VolumeKotak 
