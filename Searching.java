/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;


import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String barang[] = {"Penggaris","Pena","Penghapus","Kemeja","Celana","Dasi","Dompet"};
        boolean ketemu;
        int i, pilih=1;
        do{ 
            System.out.println("Daftar Barang:");
            for(i = 0; i < barang.length; i++){
                System.out.println((i+1)+". "+barang[i]+"");
            }
            ketemu=false;
            System.out.println("");
            System.out.print("Cari Barang = ");
            String cari = s.next();
            for (i = 0; i < barang.length; i++){
                if(barang[i].compareToIgnoreCase(cari)==0){
                    ketemu = true;
                    break;
            }
        }
            if(ketemu==true){
                System.out.println("Ada di loker nomer "+(i+1));
            }else{
                System.out.println("Tidak Ditemukan");
            }
            System.out.println("Cari lagi?");
            System.out.println("[1.ya]]");
            System.out.println("[2,tidak");
            System.out.println("Jawab = ");
            pilih = s.nextInt();
        }while(pilih==1);
        System.out.println("Thank You");
    }
}