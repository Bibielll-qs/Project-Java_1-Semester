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

public class tokoJogjaMart { //mendeklarasikan atau menyatatakan kelas tokoJogjaMart
    
    public static void main(String[] args) { //metode menjalankan program
        Scanner scanner = new Scanner(System.in); //memanggil fungsi scanner untuk membaca input di keyboard
        
        System.out.println("~~~~~TOKO JOGJA MART~~~~~"); //mencetak tulisan tersebut pada tampilan layar
        System.out.print("Masukkan harga barang:"); //meminta user memasukkan data harga barang
        
        double hargaBarang = scanner.nextDouble(); //mendeklarasikan hargaBarang bertipe double
        
        System.out.print("Masukkan jumlah barang yang dibeli :"); //meminta user memasukkan data jumlah barang yang dibeli
        int jumlahBarang = scanner.nextInt(); //mendeklarasikan jumlahBarang bertipe double
        
        double hargaTotalSebelumDiskon = hargaBarang * jumlahBarang; //mendeklarasikan hargaTotalSebelumDiskon bertipe double
        double besarDiskon = hargaTotalSebelumDiskon * 0.2; //mendeklarasikan rumus besarDiskon bertipe double
        double hargaSetelahDiskon = hargaTotalSebelumDiskon - besarDiskon; //mendeklarasikan hargaSetelahDiskon bertipe double
        
        System.out.println("Harga total sebelum diskon : Rp."+hargaTotalSebelumDiskon); 
        //mencetak hasil harga total sebelum diskon yang diinput
        System.out.println("Besar diskon (20%) : Rp."+besarDiskon); 
        //mencetak hasil besar diskon yang diinput ke tampilan
        System.out.println ("Harga setelah diskon : Rp." + hargaSetelahDiskon); 
        //mencetak hasil harga setelah diskon yang diinput ke tampilan
    }
}
