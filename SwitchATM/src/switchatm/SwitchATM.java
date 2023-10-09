/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchatm;

import java.util.Scanner;

/**
 *
 * @author zuna
 */
public class SwitchATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ATM 2020");
        System.out.println("1.penarikan\n2.Transfer");
        System.out.println("3.pembayran\npilihan anda");
        byte pilih = s.nextByte ();
        switch(pilih) {
            case 1 : System.out.println("Masukan Nominal = ");
            break;
            case 2 : System.out.println("1.Ke Bank Sama");
                     System.out.println("2.ke Bank Lain");
                     System.out.print("pilihan anda =");
                     int pilih2 = s.nextInt();
                     switch(pilih2){
                         case 1: System.out.println ("Gratis Biaya");
                         break;
                         case 2: System.out.println("Biaya 5.000");
                         
                     }
                     break;
            case 3: System.out.println("1.Tagihan listrik");
                    System.out.println("2.Tiket Online");
                    System.out.println ("3.Biaya kuliah");
                    System.out.print("pilihan anda =");
                    int pilih3 =s.nextInt ();
                    switch(pilih3) { 
                        case 1:System.out.println("ID pel: ");
                        break;
                        case 2:System.out.println("Kode Trx");
                        break;
                        case 3: System.out.println("NPM: "); break;
                    }
                    break;
            default:System.out.println("pilihan tidak ada");
        }
                        
                        
                    
                       
                        
                     }
            
        }
        
    
    

