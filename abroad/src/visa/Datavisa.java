/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visa;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Datavisa {
    public void hasil2(){
        System.out.println("\nMasukkan data visa: ");
        
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("\nTipe Visa: ");
        String tipevisa = input2.nextLine();
        
        System.out.print("Negara Tujuan: ");
        String destination = input2.nextLine();
                
        System.out.print("Tujuan Keberangkatan: ");
        String aim = input2.nextLine();
        
        System.out.print("Max Stay: ");
        int stay = input2.nextInt();
        
        
        Hasilvisa datav = new Hasilvisa();
        datav.hasil3(tipevisa,destination,aim,stay);
        
    }
}
