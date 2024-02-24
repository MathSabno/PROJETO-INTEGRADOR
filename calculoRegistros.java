/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

import java.util.Scanner;
import java.sql.SQLOutput;

public class calculoRegistros {
   public static double calculoRegistro (double vlImovel, double financiamento){
        Scanner entrada = new Scanner(System.in);
        int indice = 0;
        int indice2 = 0;
        int tipoCompra;
        double total = 0;
        String str = null;
        
        if (financiamento == 0){
            tipoCompra = 1;
        }else {
            tipoCompra = 2;
        }

        if (tipoCompra == 1) {

            double[][] valores = {
                    {00.0, 2056.01},
                    {2056.01, 5137.00},
                    {5137.01, 8563.00},
                    {8563.01, 17130.00},
                    {17130.01, 34260.00},
                    {34260.01, 102780.00},
                    {102780.01, 171300.00},
                    {171300.01, 205560.00},
                    {205560.01, 239820.00},
                    {239820.01, 274080.00},
                    {274080.01, 308340.00},
                    {308340.01, 342600.00},
                    {342600.01, 685200.00},
                    {685200.01, 1027800.00},
                    {1027800.01, 1370400.00},
                    {1370400.01, 1713000.00},
                    {1713000.01, 2055600.00},
                    {2055600.01, 3426000.00},
                    {3426000.01, 5139000.00},
                    {5139000.01, 6852000.00},
                    {6852000.01, 8565000.00},
                    {8565000.01, 10278000.00},
                    {10278000.01, 11991000.00},
                    {11991000.00, 13704000.00},
                    {13704000.01, 15417000.00},
                    {15417000.01, 17130000.00},
                    {17130000.01, 20556000.00},
                    {20556000.01, 23982000.00},
                    {23982000.01, 27408000.00},
                    {27408000.01, 30834000.00},
                    {30834000.01, 34260000.00},
                    {34260000.01, 37686000.00},
                    {37686000.01, 41112000.00},
                    {41112000.01, 44538000.00},
                    {44538000.01, 47964000.00},
                    {47964000.01, 51390000.00},
                    {51390000.01, 58242000.00},
                    {58242000.01, 65094000.00},
                    {65094000.00, 71946000.00},
                    {71946000.01, 78798000.00},
                    {78798000.00, 85650000.00},
                    {85650000.01, 92502000.00},
                    {92502000.01, 99354000.00},
                    {99354000.01, 106206000.00},
                    {106206000.01, 113058000.00},
                    {113058000.01, 119910000.00},
                    {119910000.01, 126762000.00},
                    {126762000.01}

            };

            for (int i = 0; i < valores.length; i++) {
                for (int j = 0; j < valores[i].length; j++) {

                    if (vlImovel >= valores[i][j]) {
                        //valor = valores[i][j];
                        indice = i;
                    }
                }
            }
            double[] registro = {
                    229.35,
                    368.03,
                    660.24,
                    979.62,
                    1191.00,
                    1328.20,
                    1695.25,
                    2061.55,
                    2244.36,
                    2428.18,
                    2559.78,
                    2626.51,
                    2928.56,
                    3429.66,
                    3948.37,
                    4467.11,
                    4735.31,
                    6076.26,
                    8489.93,
                    11171.80,
                    13853.69,
                    16535.56,
                    19217.43,
                    21899.29,
                    24581.18,
                    27263.05,
                    31285.84,
                    36649.59,
                    42013.33,
                    47377.09,
                    52740.82,
                    58104.58,
                    63468.31,
                    68832.07,
                    74195.80,
                    79559.56,
                    87605.17,
                    98332.66,
                    109060.15,
                    119787.64,
                    130515.13,
                    141242.62,
                    151970.11,
                    162697.61,
                    173425.10,
                    184152.59,
                    194880.08,
                    206232.46,
            };
            for (int x = 0; x < registro.length; x++){
            }
            System.out.printf("O valor de registro para o imóvel na modalidade A VISTA dentro do valor informado é de: R$ %,.2f\n",
                    registro[indice]);

        }if(tipoCompra == 2){
            

            double[][] valores = {
                    {00.0, 2056.01},
                    {2056.01, 5137.00},
                    {5137.01, 8563.00},
                    {8563.01, 17130.00},
                    {17130.01, 34260.00},
                    {34260.01, 102780.00},
                    {102780.01, 171300.00},
                    {171300.01, 205560.00},
                    {205560.01, 239820.00},
                    {239820.01, 274080.00},
                    {274080.01, 308340.00},
                    {308340.01, 342600.00},
                    {342600.01, 685200.00},
                    {685200.01, 1027800.00},
                    {1027800.01, 1370400.00},
                    {1370400.01, 1713000.00},
                    {1713000.01, 2055600.00},
                    {2055600.01, 3426000.00},
                    {3426000.01, 5139000.00},
                    {5139000.01, 6852000.00},
                    {6852000.01, 8565000.00},
                    {8565000.01, 10278000.00},
                    {10278000.01, 11991000.00},
                    {11991000.00, 13704000.00},
                    {13704000.01, 15417000.00},
                    {15417000.01, 17130000.00},
                    {17130000.01, 20556000.00},
                    {20556000.01, 23982000.00},
                    {23982000.01, 27408000.00},
                    {27408000.01, 30834000.00},
                    {30834000.01, 34260000.00},
                    {34260000.01, 37686000.00},
                    {37686000.01, 41112000.00},
                    {41112000.01, 44538000.00},
                    {44538000.01, 47964000.00},
                    {47964000.01, 51390000.00},
                    {51390000.01, 58242000.00},
                    {58242000.01, 65094000.00},
                    {65094000.00, 71946000.00},
                    {71946000.01, 78798000.00},
                    {78798000.00, 85650000.00},
                    {85650000.01, 92502000.00},
                    {92502000.01, 99354000.00},
                    {99354000.01, 106206000.00},
                    {106206000.01, 113058000.00},
                    {113058000.01, 119910000.00},
                    {119910000.01, 126762000.00},
                    {126762000.01}

            };

            for (int i = 0; i < valores.length; i++) {
                for (int j = 0; j < valores[i].length; j++) {

                    if (vlImovel >= valores[i][j]) {
                        //valor = valores[i][j];
                        indice = i;
                    }

                    if(financiamento >= valores[i][j]){
                        indice2 = i;
                    }
                }
            }
            double[] registro = {
                    229.35,
                    368.03,
                    660.24,
                    979.62,
                    1191.00,
                    1328.20,
                    1695.25,
                    2061.55,
                    2244.36,
                    2428.18,
                    2559.78,
                    2626.51,
                    2928.56,
                    3429.66,
                    3948.37,
                    4467.11,
                    4735.31,
                    6076.26,
                    8489.93,
                    11171.80,
                    13853.69,
                    16535.56,
                    19217.43,
                    21899.29,
                    24581.18,
                    27263.05,
                    31285.84,
                    36649.59,
                    42013.33,
                    47377.09,
                    52740.82,
                    58104.58,
                    63468.31,
                    68832.07,
                    74195.80,
                    79559.56,
                    87605.17,
                    98332.66,
                    109060.15,
                    119787.64,
                    130515.13,
                    141242.62,
                    151970.11,
                    162697.61,
                    173425.10,
                    184152.59,
                    194880.08,
                    206232.46,
            };
            for (int x = 0; x < registro.length; x++){
            }

            do{
                System.out.println("Voce é beneficiário do SFH?\n" + "1 - para SIM\n2 - para NAO");
                str = entrada.next();               
            }
            while (!(str.equals("1") || str.equals("2") || str.equals("3")));
            
            int validSfh = Integer.parseInt(str);
            
            if (validSfh == 2){
                total = registro[indice] + registro[indice2];
                System.out.println("*---------- NAO BENEFICIARIO(A) DO SFH ----------*");
                System.out.println("Você selecionou a opção: NAO BENEFICIÁRIO(A) DO SFH");
                System.out.printf("O valor de registro para o imóvel na modalidade FINANCIAMENTO dentro do valor informado é de: R$ %,.2f\n",
                        registro[indice]);
                System.out.printf("O valor será acrescido de %,.2f que é correspondente ao registro do FINANCIAMENTO\n", registro[indice2]);
                System.out.printf("Totalizando R$ %,.2f\n", total);
            }
            if(validSfh == 1){
                registro[indice2] = registro[indice2] - (registro[indice2] * 0.5);
                total = registro[indice] + registro[indice2];
                System.out.println("*---------- BENEFICIARIO(A) DO SFH ----------*");
                System.out.println("Você selecionou a opção: BENEFICIÁRIO(A) DO SFH");
                System.out.printf("O valor de registro para o imóvel na modalidade FINANCIAMENTO dentro do valor informado é de: R$ %,.2f",
                        registro[indice]);
                System.out.printf("O valor será acrescido de R$ %,.2f que é correspondente ao registro do FINANCIAMENTO com desconto do SFH\n", registro[indice2]);
                System.out.printf("Totalizando R$ %,.2f\n", total);
            }
        }return total; 
   }
}
