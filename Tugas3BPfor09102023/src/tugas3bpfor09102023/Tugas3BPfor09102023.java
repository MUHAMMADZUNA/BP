/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3bpfor09102023;

import java.util.Scanner;

/**
 *
 * @author zuna
 */
public class Tugas3BPfor09102023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner ( System.in);
      System.out.println("Masukkan Bilangan");
      int x = s.nextInt();
      for (int i = 1; i <= x; i++) {
        if(i%2==1){
        
            System.out.println(""+i);
        }
       } 
      }
    
}

