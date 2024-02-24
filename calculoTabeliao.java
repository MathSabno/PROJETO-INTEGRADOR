/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

public class calculoTabeliao {
    public static double calculoTabeliao (double vlImovel, double financiamento){
        double vlTaxa = 0;
        double valor = 0;
        int indiceValores = 0;
        
        if (financiamento == 0) {
            double [][] valores = {
                {00.00, 1359.00},
                {1359.01, 5137.00},
                {5137.00, 8563.00},
                {8563.01, 17130.00},
                {17130.01, 34260.00},
                {34260.01, 68520.00},
                {68520.01, 102780.00},
                {102780.01, 137040.00},
                {137040.01, 171300.00},
                {171300.01, 205560.00},
                {205560.01, 239820.01},
                {239820.01, 274080.00},
                {274080.00, 294399.00},
                {294399.00, 342600.00},
                {342600.00, 685200.00},
                {685200.01, 1027800.00},
                {1027800.01, 1370400.00},
                {1370400.01, 3485249.00},
                {3485249.01, 5227874.00},
                {5227874.01, 6970498.00},
                {6970498.01, 8713123.00},
                {8713123.01, 10455748.00},
                {10455748.01, 12198372.00},
                {12198372.01, 13940997.00},
                {13940997.01, 15683622.00},
                {15683622.01, 17426246.00},
                {17426246.01, 20911495.00},
                {20911495.01, 24396745.00},
                {24396745.01, 27881993.00},
                {27881993.01, 31367243.00},
                {31367243.01},        
            };
            for (int i = 0; i < valores.length; i++){
                for (int j = 0; j < valores[i].length; j++) {
                    if(vlImovel >= valores[i][j]){
                        vlTaxa = valores[i][j];
                        indiceValores = i;
                    }
                }
            }
            double [] vlPagar = {
                318.26,
                475.59,
                742.60,
                1060.87,
                1433.96,
                1701.04,
                2019.30,
                2392.40,
                2710.73,
                3032.62,
                3402.09,
                3724.06,
                4097.15,
                4360.55,
                4839.75,
                5373.85,
                5959.16,
                6584.71,
                9145.48,
                11889.07,
                14632.74,
                17376.33,
                20119.94,
                22863.60,
                25607.20,
                28350.84,
                31094.54,
                36581.81,
                42069.04,
                47556.31,
                53043.54,
                58530.88,   
            }; 

            for (int x = 0; x < vlPagar.length; x++){
                valor = vlPagar[indiceValores];  
                break;
            }
            
        } else {
            valor = 0;
        }
            
        return valor;
    }

}


