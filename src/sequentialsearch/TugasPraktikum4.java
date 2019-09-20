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
public class TugasPraktikum4 {
    public static void main(String[] args){
        Scanner hd= new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat: ");
        cari = hd.nextLine();
        
        int a=0; 
        for(int x=0; x<cari.length(); x++){
            if(cari.charAt(x) == 'a'){
                a++;
            }
        }
        int i=0;
        for(int x=0; x<cari.length(); x++){
            if(cari.charAt(x) == 'i'){
                i++;
            }
        }
            
        
          int u=0;
          for(int x=0; x<cari.length(); x++){
              if(cari.charAt(x) == 'u'){
                  u++;
              }
          }
        int e=0;
        for(int x=0; x<cari.length(); x++){
            if(cari.charAt(x) == 'e'){
                e++;
            }
        }
        int o=0;
        for(int x=0; x<cari.length(); x++){
            if(cari.charAt(x) == 'o'){
              o++;  
            }
       
        }
        System.out.println("Jumlah huruf a = " + a);
        System.out.println("Jumlah huruf i = " + i);
        System.out.println("Jumlah huruf u = " + u);
        System.out.println("Jumlah huruf e = " + e);
        System.out.println("Jumlah huruf o = " + o);
        
        int jumlahvokal=0;
        jumlahvokal= a+i+u+e+o;
        System.out.println("Jumlah semua huruf vokal = " +jumlahvokal);
    }
}
