/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1bpdowhile09102023;

import java.util.Scanner;

/**
 *
 * @author zuna
 */
public class Tugas1BPdoWHILE09102023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      System.out.println ("Masukan bilangan");
      int x, n = s.nextInt();
      while (n>=1) {
          x=1;
          do{
              System.out.println(""+x);
              x+=2;           
          }while  (x<=n);
          n++;
          System.out.println("");break;
    }
    }
}
