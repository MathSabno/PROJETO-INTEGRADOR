/*a
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoPI;

public class calculoFinal {
    public static void calculoFinal(double vlImovel, double financiamento, double vlRegistros, double vlITBI, double vlIPTU, double vlCorretagem, double vlTabeliao, double vlEscritura){
       
        double valorFinal;
                
        double valorImovel = vlImovel;
        
        if (financiamento != 0){
            vlImovel = financiamento;
        }
        else{
            vlImovel = vlImovel;
        }
        
        valorFinal = vlImovel + vlTabeliao + vlCorretagem + vlIPTU + vlRegistros + vlEscritura + vlITBI;
        
        System.out.println("*---------- VALOR FINAL ----------*");
        System.out.printf("O valor final será aproximadamente RS %,.2f\n", valorFinal);
        
        System.out.println("*---------- DESCRITIVO ----------*");
        System.out.printf("Valor de compra: R$ %,.2f\nValor com financiamento: R$ %,.2f\nValor registros: R$ %,.2f\nValor ITBI: R$ %,.2f\nValor IPTU: R$ %,.2f\nValor corretagem: R$ %,.2f\nValor tabelião: R$ %,.2f\nValor escritura: R$ %,.2f\n", 
                valorImovel, financiamento, vlRegistros, vlITBI, vlIPTU, vlCorretagem, vlTabeliao, vlEscritura);      
    }
}
