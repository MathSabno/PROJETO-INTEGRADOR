/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

import java.util.Scanner;

public class calculoIPTU {
    public static double calculoIPTU (double valorVenal){
        
        Scanner input = new Scanner (System.in);
        int qtdimovel;
        String str = null;
        
        do {
            System.out.printf("É o seu primeiro imóvel?\n");
            System.out.printf("1 - Para SIM\n2 - Para NÃO\n");
            str = input.next();
            
            while (!(str.equals("1") || str.equals("2"))){
                System.out.println("Opção inválida! Digite:\n1 - Para sim\n2 - Para não\n");
            }
            qtdimovel = Integer.parseInt(str);
        
        }while (qtdimovel != 1 && qtdimovel != 2);
            
        double calculoIptu = 0;
        
        switch(qtdimovel){
                case 1:
                    if(valorVenal<=230000){
                        System.out.printf("Você é isento do tributo.");
                    }
                    else if(valorVenal > 230000 && valorVenal <= 300000){
                        calculoIptu = (valorVenal * 0.011) - 900;
                    }
                    else if(valorVenal > 600000.01 && valorVenal <= 1200000.00){
                        calculoIptu = (valorVenal * 0.013) - 2100.00;
                    }
                    else{
                        calculoIptu = (valorVenal * 0.015) - 4500.00;
                    }
                    break;
                    
                case 2:
                    if(valorVenal<=150000){
                        calculoIptu = (valorVenal * 0.007);
                    }
                    else if(valorVenal > 150000.01 && valorVenal <= 300000){
                        calculoIptu = (valorVenal * 0.009) - 300;
                    }
                    else if(valorVenal > 300000.01 && valorVenal <= 600000.00){
                        calculoIptu = (valorVenal * 0.011) - 900;
                    }
                    else if(valorVenal > 600000.01 && valorVenal <= 1200000.00){
                        calculoIptu = (valorVenal * 0.013) - 2100.00;
                    }
                    else{
                        calculoIptu = (valorVenal * 0.015) - 4500.00;
                    }
                    break;
                     
       } return calculoIptu;
    }
}

