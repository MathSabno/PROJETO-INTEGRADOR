/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

import java.util.Scanner;

public class calculoEscritura{
    
    public static double calculoEscritura (double vlImovel, double financiamento){
        Scanner input = new Scanner (System.in);
        double vlEscritura;
        
        if (financiamento == 0){
            vlEscritura = vlImovel * 0.02;
            return vlEscritura;
        }else{
            vlEscritura = 0;
            return vlEscritura;
        }
                      
    }
}
