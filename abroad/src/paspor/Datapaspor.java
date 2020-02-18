/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paspor;

import java.util.Scanner;
import visa.Datavisa;

/**
 *
 * @author Asus
 */
public class Datapaspor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan data paspor: ");
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nNama Depan: ");
        String namad = input.nextLine();
                
        System.out.print("Nama Belakang: ");
        String namab = input.nextLine();
        
        System.out.print("Jenis Kelamin: ");
        String jk = input.nextLine();
        
        System.out.print("Kewarganegaraan: ");
        String kew = input.nextLine();
        
        Hasilpaspor datapaspor = new Hasilpaspor();
        datapaspor.hasil(namad,namab,jk,kew);
        
        Scanner pilih = new Scanner(System.in);
        System.out.print("\nBuat Visa? (y/n)");
        String buatvisa = pilih.nextLine();
        
        if(buatvisa.equals("y")){
            Datavisa visa1 = new Datavisa();
            visa1.hasil2();
        }
        
        else{
            System.out.println("\nSelesai");
        }
    }
    
}
