/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasPraktikum2 {
   public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        int angka =  0;
        int [] data = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada array:  ");
        for (int i=0; i<data.length;i++){
    System.out.print(data[i]+"\t");
        }
        double rata=0;
        for(int a=0; a<data.length; a++)
        rata+=data[a]; rata/=data.length;
        System.out.print("\nNilai Rata-Rata nilai array adalah " +rata);
        System.out.println("\n");
        System.out.print("Nilai yang ada diatas rata rata: ");
     for(int p=0; p<data.length; p++){
         if(data[p]>rata){
             System.out.print(data[p]+"\t");
         }
     }   
        
   }
   
        
}
