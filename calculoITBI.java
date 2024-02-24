/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;


import java.util.Scanner;

public class calculoITBI {
    

    public static double verificarMaior(double valorVenal, double valorFinanciado) {
        double baseDeCalculo = 0f;

        if (valorVenal > valorFinanciado) {
            baseDeCalculo = valorVenal;
            return baseDeCalculo;
        } else {
            baseDeCalculo = valorFinanciado;
            return baseDeCalculo;
        }
    }

    public static double verificarLimite(double baseDeCalculo) {
        Scanner input = new Scanner(System.in);
        double limite = 634710.560f;
        double semDesconto = 0.03f;
        double valorDesconto = 105785.09f;
        double porcentagemDesconto = 0.005f;
        double itbi = 0;
        double itbiParcial;
        double itbiResto;
        int beneficio;
        String str = null;

        if (baseDeCalculo >= limite) {
            itbi = baseDeCalculo * semDesconto;
            System.out.printf("Você não se enquadra para o desconto.\nSua base de cálculo é R$ %,.2f que ultrapassa o limite de R$ %,.2f\nSeu ITBI é: R$ %,.2f", baseDeCalculo, limite, itbi);
        } else {
            do {
                System.out.println("Você é beneficiário do SFH, PAR, HIS ou de algum consórcio?\n1 - Para sim\n2 - Para não");
                str = input.next();
                
                while (!(str.equals("1") || str.equals("2") || str.equals("3"))){
                    System.out.println("Opção inválida! Digite novamente:\n1 - Para sim\n2 - Para não");
                    str = input.next();
                }
                beneficio = Integer.parseInt(str);
                switch (beneficio) {
                    case 1:
                        itbiParcial = valorDesconto * porcentagemDesconto;
                        itbiResto = (baseDeCalculo - valorDesconto) * semDesconto;
                        itbi = itbiParcial + itbiResto;
                        System.out.printf("Você se enquadra para o desconto.\nSua base de cálculo é R$ %,.2f\nSeu ITBI é: R$ %,.2f\n", baseDeCalculo, itbi);
                        break;
                    case 2:
                        itbi = baseDeCalculo * semDesconto;
                        System.out.printf("Você não se enquadra para o desconto.\nSua base de cálculo é R$ %,.2f\nSeu ITBI é: R$ %,.2f\n", baseDeCalculo, itbi);
                        break;
                    default:
                        System.out.printf("Valor Inválido");
                }
            }while (beneficio != 1 && beneficio !=2);
        }
        return itbi;
    }
}
