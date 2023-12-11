/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sorting {

    /**
     * @param args the command line arguments
     */ private static int i; 
    public static void main(String[] args) {
        int count,temp;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        
        int num[]=new int[count];
        System.out.println("Masukkan Harga: ");
        for(int i=0; i<count ;i++){
            num[i]=scan.nextInt();
        }
        scan.close();
        for(int i=0; i<count ;i++){
            for(int j=1; j<count; j++){
                if (num[i]<num[j]){
                    temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    
                }
            }
        }
        System.out.println("Diurutkan Hraga Tertinggi");
        for (int i=0; i<count; i++){
            System.out.println(num[i]);
        }
    }
    
}
