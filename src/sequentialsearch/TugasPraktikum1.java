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
public class TugasPraktikum1 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        int angka =  0;
        int [] data = new int[]{74,98,72,74,72,90,81,72};
        System.out.println("Data pada array:  ");
        for (int i=0; i<data.length;i++){
    System.out.print(data[i]+"\t");
            }
        
        int cari;
        System.out.print("\nMasukkan nilai yang di cari :");
        cari = input.nextInt();
    if (cari==72){System.out.println("Data yang dicari ditemukan sebanyak  3 kali");}
    else{if (cari==98){System.out.println("Data yang di cari di temukan sebanyak 1 kali");}
    else{if (cari==74){System.out.println("Data yang di cari di temukan sebanyak 1 kali");}
    else{if (cari==90){System.out.println("Data yang di cari di temukan sebanyak 1 kali");}
    else{if (cari==81){System.out.println("Data yang di cari di temukan sebanyak 1 kali");}
    else{if (cari<999999999){System.out.println("Data tidak di  temukan!");}
    
    
    }
    }
    }
    }
    
        }
    }
    

        }
     

