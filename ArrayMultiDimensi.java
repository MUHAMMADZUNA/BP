/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensi;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD ZUNA
 */
public class ArrayMultiDimensi {

   public static void main(String[] args) {
        String loker[][] = new String[5][10]; 
        Scanner s = new Scanner(System.in); 
        int baris=0, kolom=0, pilih = 0;
        do{
            System.out.println("\nPencarian Pekerjaan Digital "); 
            System.out.println("1. Masukkan Pencarian Loker"); 
            System.out.println("2. Cari Pencarian di Loker"); 
            System.out.println("3. Status Pekerjaan Loker"); 
            System.out.println("4. Selesai"); 
            System.out.print("Pilih = ");
            pilih = s.nextInt(); 
            switch(pilih){
               case 1: String barang; 
                int i, j=0;
                boolean ketemu=false; 
                System.out.print("Nama Barang = "); 
                barang = s.next(); 
                System.out.println("Cari loker...");
                 for (i = 0; i < 5; i++) {
                    baris = i;
                    for (j = 0; j < 10; j++) { 
                        kolom = j;
                        if(loker[i][j]==null){ 
                            ketemu = true;
                            break;
                        }
                     }
                    if(ketemu)break;
                }
                  if(i==5 && j==10){
                    System.out.println("Lowongan Pekerjaan Penuh");
  
                  }
                  else{
                       loker[baris][kolom] = barang; 
                        System.out.println(baris+"-"+kolom);
                  }
                  break;
                case 2: 
                    barang = "";
                ketemu = false; j = 0;
                System.out.print("Barang yang dicari = "); 
                barang = s.next(); 
                System.out.println("Pencarian...");
                    for ( i = 0; i < 10; i++) {
                        baris=i;
                        for ( j = 0; j < 10; j++) {
                           kolom=j;
                           if(loker[i][j].compareToIgnoreCase(barang)==0){
                                ketemu = true;
                        break;

                           }
                        }
                         if(ketemu) break;
                    }
                      if(i==5){ 
                           System.out.println("Barang Tidak Ada");
                      }
                      else{
                          System.out.println("Ada di"+baris+"-+kolom");
                      }
                      break;
                case 3:
                    int isi=0; int kosong = 0;
                        System.out.println("Cek Loker..."); 
                       for ( i = 0; i < 10; i++) {
                           for ( j = 0; j < 10; j++) {
                                if(loker[i][j]==null){
                                    kosong++;
                                }
                                else{
                                    isi++;
                                }
                           }
                           System.out.println("Loker terisi: "+isi); 
                           System.out.println("Loker kosong: "+kosong); break;
                    }
            }

          }while(pilih!=4);
        }
}
