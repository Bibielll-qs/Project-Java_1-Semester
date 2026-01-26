/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanTiga; //menyimpan file ke folder pertemuanTiga

/**
 *
 * @author LENOVO
 */
import java.util.Scanner; //memnaggil fungsi kelas scanner

public class sdBhinneka { //mendeklarasikan atau menyatakan kelas sdBhinneka
    public static void main(String[] args){ //metode untu menjalankan program
    Scanner scanner = new Scanner(System.in); //memanggil fungsi scanner untuk membaca input di keyboard
    
    System.out.println("SD BHINNEKA"); //mencetak tulisan tersebut ke tampilan layar
    
    System.out.print("Masukkan nilai Tugas 1 :"); //meminta user memasukkan data nilai  Tugas 1
    double tugas1 = scanner.nextDouble(); //mendeklarasikan tugas1 bertipe double
    
    System.out.print("Masukkan nilai Tugas 2 :"); //meminta user memasukkan data nilai tugas2
    double tugas2 = scanner.nextDouble(); //mendeklarasikan tugas2 bertipe double
    
    System.out.print("Masukkan nilai Tugas 3 :"); //meminta user memasukkan data nilai tugas3
    double tugas3 = scanner.nextDouble(); //mendeklarasikan tugas3 bertipe double
    
    double rataRata = (tugas1 + tugas2 + tugas3)/3; //mendeklarasikan rumus rataRata bertipe double
    
    System.out.println("Nilai Rata-rata :"+rataRata); //mencetak hasil nilai rata rata yang diinput ke tampilan
} //akhir dari metode program
} //akhir dari kelas sdBhinneka
