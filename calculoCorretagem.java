/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

import java.util.Scanner;

public class calculoCorretagem {
    public static double calculoCorretagem (double valorImovel){
        
        isNumeric validador = new isNumeric();
        boolean valida = false;
        int corretagem;
        double taxaUsuario;
        double taxa = 0;
        String str;
        
        Scanner input = new Scanner (System.in);
        
        do {
            System.out.println("Houve participação imobiliaria na compra do imovel? ");
            System.out.println("1 - Sim. Houve participação.\n2 - Não houve participação");
            str = input.next();
            
            while(!(str.equals("1") || str.equals("2"))){
               System.out.println("1 - Sim. Houve participação.\n2 - Não houve participação");
                str = input.next();
            }
            corretagem = Integer.parseInt(str);
        }while (corretagem != 1 && corretagem !=2);

        switch(corretagem){
            case 1:
                
                do {
                    System.out.println("Qual a porcetagem praticada no seu contrato? ");
                    str = input.next();                
                    valida = isNumeric.isNumericCorretagem(str);
                    
                }while (valida == false);
                
                taxaUsuario = Integer.parseInt(str);
                taxaUsuario = taxaUsuario / 100;
                taxa = (valorImovel * taxaUsuario);
                break;
                
            case 2:
                taxa = 0;
                break;
        }
        return taxa;
    }  
}
