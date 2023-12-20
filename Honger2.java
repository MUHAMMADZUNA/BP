/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honger;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    String nama;
    int harga;
    int jumlahDipesan; // Menambahkan informasi jumlah menu yang dipesan
    
    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        this.jumlahDipesan = 0; //Default jumlah di pesan diinnisialiasasi ke 0
    }
}
 class Kasir {
     ArrayList<Menu> menu;
     ArrayList<Menu> pesanan;
     double totalHarga; // Menambahkan informasi total harga pesanan
     
     public Kasir() {
         menu = new ArrayList<>();
         pesanan = new ArrayList<>();
         totalHarga = 0;
         
         System.out.println("=====================SELAMAT DATANG DI HONGER SURABAYA====================");
         System.out.println("BISA DI BANTU KAK UNTUK PESANAN NYA : ");
         
         //Inisialisasi menu
         menu.add(new Menu("1.Nasi Goreng Kambing",40000));
         menu.add(new Menu("2.Nasi Goreng Briyani Kambing",45000));
         menu.add(new Menu("3.Nasi Goreng Sapi",45000));
         menu.add(new Menu("4.Nasi Goreng Briyani Sapi",55000));
         
     }
     public void tampilkanMenu() {
         System.out.println("Menu Makanan");
         for (Menu item : menu) {
             System.out.println(item.nama + ": RP "+ item.harga + "\n");
             
         }
     }
     public void pesanMakanan(String namaMakanan, int jumlah) {
         for (Menu item : menu) {
             if (item.nama.equals(namaMakanan)) {
                 int totalHargaItem = item.harga * jumlah;
                 item.jumlahDipesan += jumlah;// menambah jumlah menu yang di pesan 
                 pesanan.add(new Menu(namaMakanan,totalHargaItem));
                 totalHarga += totalHargaItem;
                 System.out.println(jumlah+" "+namaMakanan+" telah ditambahkan ke dalam pesanan");
                 return;
             }
         }
         System.out.println("Menu Tidak Ditemukan,Mohon pilih menu yang ada");
     }
     public void prosesPembayaran(int jumlahUang) {
         double diskon = hitungDiskon(totalHarga);
         double totalSetelahDiskon = totalHarga - diskon;
         int kembalian = jumlahUang - (int) totalSetelahDiskon;
         
         
         
         
         if (kembalian >= 0) {
             System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
             System.out.println("Diskon : Rp " + diskon);
             System.out.println("Total harga setelah diskon: Rp " + totalSetelahDiskon);
             System.out.println("Jumlah Uang yang di berikan: Rp " + jumlahUang);
             System.out.println("Kembalian: Rp " + kembalian);
             System.out.println("==========================Terima kasih sudah Membeli==============");
             
             
             //Tampilkan jumlah menu yang di pesan
             System.out.println("Jumlah Menu yang Dipesan");
             for (Menu item : menu) {
                 if (item.jumlahDipesan > 0) {
                     System.out.println(item.nama + ": "+ item.jumlahDipesan);
                 }
             }
         } else {
            
            System.out.println("Maaf,Uang Anda Tidak Mencukupi");
             
         }
     }
public double hitungDiskon(double totalHarga) {
double diskon = 0;
if (totalHarga > 250000) {
   diskon = 0.05 * totalHarga;
} else if (totalHarga > 150000) {
  diskon = 0.02 * totalHarga;
}
return diskon;
}
 
 }
public class Honger2 {  
    public static void main(String[] args) {
        Kasir KasirRumahMakan = new Kasir();
        Scanner s = new Scanner(System.in);
        
        KasirRumahMakan.tampilkanMenu();
        
        System.out.println(" Pilih makanan");
        String makanan = s.nextLine();
        
        System.out.println("Masukkan jumlah porsi yang kamu pesan:");
        int jumlah = s.nextInt();
        
        KasirRumahMakan.pesanMakanan(makanan, jumlah);
        
        System.out.println("Masukkan jumlah Uang");
        int jumlahUang = s.nextInt();
        
        KasirRumahMakan.prosesPembayaran(jumlahUang);
        
      
        
        s.close();
    
        
         
    }
    
  }
