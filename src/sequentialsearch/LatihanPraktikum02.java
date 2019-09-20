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
public class LatihanPraktikum02 {
    public static void main(String[] args){
    int cari;
    boolean found = false;
    int[] data = new int[]{8,90,56,90,87,76,42};
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan data yang dicari");
    cari = input.nextInt();
    for (int i = 0; i< data.length; i++){
         if(cari == data[1]){
             found =  true;
             System.out.println("Data ditemukan pada indeks ke-" + i);
             
         }
    }
    if (found != false){
        System.out.println("Data ditemukan!");
    }else {
            System.out.println("Data tidak ditemukan!");
      
    }
    
}
}


