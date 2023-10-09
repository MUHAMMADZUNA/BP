/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopmenu;

import java.util.Scanner;

/**
 *
 * @author zuna
 */
public class Loopmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih;
        do{
              System.out.println("MENU");
              System.out.println("1.Sate Ayam");
              System.out.println("2.Rawon");
              System.out.println("3.Gado-Gado");
              System.out.println("4.Rujak");
              System.out.println("5.selesai");
              System.out.print("pilih = ");
              pilih = s.nextInt();
              switch(pilih){
                  case 1: System.out.println("Lezat");
                  break;
                  case 2: System.out.println("Nikmat");
                  break;
                  case 3: System.out.println("Uenak");
                  break;
                  case 4: System.out.println("Maknyus");
                  break;
                  case 5: System.out.println("Trmksh");
                  break;
               
              }
        }while(pilih!=5);
                  
                      
             
        }
        
    }
    

