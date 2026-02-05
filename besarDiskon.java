/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanEmpat; //menyimpan file ke folder pertemuanEmpat
/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memanggil fungsi kelas scanner

public class besarDiskon { //mendeklarasikan atau menyatakan kelas besarDiskon
    public static void main(String[] args){ //membuka main block atau metode menjalankan program
        Scanner scanner = new Scanner(System.in); //membuat objek scanner dengan nama scanner agar bisa membaca input dari keyboard
        double diskon1; //mendeklarasikan diskon1 bertipe double
        System.out.println("~~~~~DISKON PEMBELIAN BARANG~~~~~"); //mencetak tulisan tersebut pada monitor
        
        System.out.print("Masukkan jumlah barang yang dibeli :"); //meminta user memasukkan data jumlah barang yang dibeli
        int jumlahBarang = scanner.nextInt(); //memasukkan data jumlahBarang ke data variabel bertipe integer
        
        double hargaPerBarang = 100000; //mendeklarasikan hargaBarang bertipe double dengan nilai 100000
        double totalHargaPembelian = jumlahBarang * hargaPerBarang; 
        //mendeklarasikan perhitungan totalHargaPembelian merupakan bilangan bertipe double
        double diskon = 0.1; //mendklarasikan diskon bertipe double
        System.out.println("Total harga pembelian : Rp"+totalHargaPembelian); //mencetak hasil dari totalHargaPembelian
        if(totalHargaPembelian >= 1000000){ //perhitungan totalHargaPembelian dengan syarat lebih dari sama dengan 1000000
            diskon1 = diskon * totalHargaPembelian; //perhitungan diskon1, potongan harganya
            System.out.println("Anda mendapatkan diskon sebesar 10%!"); //mencetak tulisan tersebut jika kondisi ini terpenuhi/benar
            System.out.println("Besarnya diskon : "+ diskon1); //mencetak besar diskon yang didapat jika kondisi ini benar
            System.out.println("Total yang harus dibayar setelah diskon : Rp "+(totalHargaPembelian - diskon1)); 
            //mencetak harga yang dibayar setelah diskon jika kondisi ini benar
        } //akhir dari kondisi ini
        else { //menjalankan kondisi ini jika syarat/kondisi di atas salah
            System.out.println("Pembelian Anda belum mencapai RP 1.000.000,-. Tidak ada diskon yang diberikan"); 
            //mencetak tulisan ini jika kondisi di atas salah, selain dari atas  
        } //akhir dari selain dari atas
    } //akhir dari main atau metode program
} //akhir dari kelas besarDiskon
