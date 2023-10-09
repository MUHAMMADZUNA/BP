/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga.atas;

import java.util.Scanner;

/**
 *
 * @author zuna
 */
public class SegitigaAtas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Program Segitiga Atas");
        System.out.print("Masukkan N =");
        int j, N = s.nextInt ();
        while (N>0) {
            j=1;
            do{
                System.out.print(j+" ");
                j++;
            } while(j<=N);
            N--;
            System.out.println("");
         
        }
    }
    
}
