package codigoPI;

import java.util.Scanner;

public class calculoJuros {
        
    // Solicitar a quantia de entrada
    public static double quantiaEntrada(double valorImovel){
        
        isNumeric validador = new isNumeric();
        boolean valida = false;
        String str;
        Scanner scanner = new Scanner(System.in);
        
        double entrada;

        do{
            System.out.print("Digite o valor da entrada (Deve ser no mínimo 20% do valor do imóvel): ");
            str = scanner.next();
            valida = isNumeric.isNumeric(str);
        }while (valida == false);
        
        entrada = Double.parseDouble(str);
        
        while (entrada < valorImovel * 0.20 || entrada > valorImovel) { 
            do{
                System.out.print("Digite novamente o valor da entrada (Deve ser no mínimo 20% do valor do imóvel): ");
                str = scanner.next();
                valida = isNumeric.isNumeric(str);
            }while (valida == false);
            entrada = Double.parseDouble(str);
        }
        return entrada;
    }
        
    // Solicitar a quantia de parcelas em meses a ser paga (máximo 420)
    public static int qntdParcelas(){
        isNumeric validador = new isNumeric();
        boolean valida = false;
        String str = null;
        Scanner scanner = new Scanner(System.in);
        
        int parcelas;
        
        do {   
            
            System.out.print("Digite quantas parcelas (em meses) você deseja para seu financiamento (máximo 420 parcelas): ");
            str = scanner.next(); 
            valida = isNumeric.isNumeric(str);
            
            while (valida == false){
                System.out.print("Digite quantas parcelas (em meses) você deseja para seu financiamento (máximo 420 parcelas): ");
                str = scanner.next();  
                valida = isNumeric.isNumeric(str);
            }
            parcelas = Integer.parseInt(str);
            
           
        }while (parcelas <= 0 || parcelas > 420);

        return parcelas;
    }
    
        
    // Cálculo dos valores do banco Caixa
    public static double calculoCaixa(double jurosCaixa, double taxadeJurosCaixa, double jurosTotalCaixa, double valorImovel, double entrada, int parcelas, double calculoCaixa) {
        double valorFinanciamento = valorImovel - entrada;
        taxadeJurosCaixa = (jurosCaixa / 12);
        jurosTotalCaixa = valorFinanciamento * taxadeJurosCaixa * parcelas;
        calculoCaixa = (valorFinanciamento + jurosTotalCaixa) / parcelas;

        return calculoCaixa;
    }
       
    // Cálculo dos valores do banco Itau
    public static double calculoItau (double jurosItau, double taxadeJurosItau, double jurosTotalItau, double valorImovel, double entrada, int parcelas, double calculoItau) {
        double valorFinanciamento = valorImovel - entrada;
        taxadeJurosItau = (jurosItau / 12);
        jurosTotalItau = valorFinanciamento * taxadeJurosItau * parcelas;
        calculoItau = (valorFinanciamento + jurosTotalItau) / parcelas;

        return calculoItau;
    }
       
    // Cálculo dos valores do banco Santander
    public static double calculoSantander (double jurosSantander, double taxadeJurosSantander, double jurosTotalSantander, double valorImovel, double entrada, int parcelas, double calculoSantander) {
        double valorFinanciamento = valorImovel - entrada;
        taxadeJurosSantander = (jurosSantander / 12);
        jurosTotalSantander = valorFinanciamento * taxadeJurosSantander * parcelas;
        calculoSantander = (valorFinanciamento + jurosTotalSantander) / parcelas;
        
        return calculoSantander;
    }
    
    // Cálculo dos valores do banco Bradesco
    public static double calculoBradesco (double jurosBradesco, double taxadeJurosBradesco, double jurosTotalBradesco, double valorImovel, double entrada, int parcelas, double calculoBradesco) {
        double valorFinanciamento = valorImovel - entrada;
        taxadeJurosBradesco = (jurosBradesco / 12);
        jurosTotalBradesco = valorFinanciamento * taxadeJurosBradesco * parcelas;
        calculoBradesco = (valorFinanciamento + jurosTotalBradesco) / parcelas;
        
        return calculoBradesco;
    }
    
    // Cálculo dos valores do banco Santander
    public static double calculoBdB (double jurosBdB, double taxadeJurosBdB, double jurosTotalBdB, double valorImovel, double entrada, int parcelas, double calculoBdB) {
        double valorFinanciamento = valorImovel - entrada;
        taxadeJurosBdB = (jurosBdB / 12);
        jurosTotalBdB = valorFinanciamento * taxadeJurosBdB * parcelas;
        calculoBdB = (valorFinanciamento + jurosTotalBdB) / parcelas;
        
        return calculoBdB;
    }
    public static void imprimirBancos (double calculoCaixa, double calculoItau, double calculoSantander, double calculoBradesco, double calculoBdB){
        //Retorna para o usuário os calculos dos devidos bancos
        System.out.println("\nOpções de bancos para financiamento:");
        System.out.println("\n1 - Caixa (Taxa de juros: 9,99% a.a)");
        System.out.printf("Valor da parcela na Caixa: R$ %,.2f\n\n", calculoCaixa);
        System.out.println("2 - Itau (Taxa de juros: 10,49% a.a)");
        System.out.printf("Valor da parcela na Itaú: R$ %,.2f\n\n", calculoItau);
        System.out.println("3 - Santander (Taxa de juros: 10,99% a.a)");
        System.out.printf("Valor da parcela na Santander: R$ %,.2f\n\n", calculoSantander);
        System.out.println("4 - Bradesco (Taxa de juros: 11,49% a.a)");
        System.out.printf("Valor da parcela na Bradesco: R$ %,.2f\n\n", calculoBradesco);
        System.out.println("5 - Banco do Brasil (Taxa de juros: 12% a.a)");
        System.out.printf("Valor da parcela na Banco do Brasil: R$ %,.2f\n\n", calculoBdB);
    }
    public static double escolherBanco (double calculoCaixa, double calculoItau, double calculoSantander, double calculoBradesco, double calculoBdB, int parcelas){
        
        Scanner input = new Scanner(System.in);
        
        int escolha;
        
        double financiamento = 0;
        
        do{
            String str = null;
            System.out.printf("Informe o banco que utilizará para o financiamento:\n 1 - Caixa\n 2 - Itau\n 3 - Santander\n 4 - Bradesco\n 5 - Banco do Brasil\n");
            str = input.next();
            
            escolha = Integer.parseInt(str);
            
            while (!(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5"))){
                System.out.printf("Opção inválida! Digite novamente:\n");
                str = input.next();
            }
            escolha = Integer.parseInt(str);
            
                switch(escolha){
                    case 1:
                        financiamento = calculoCaixa * parcelas;
                        break;
                    case 2:
                        financiamento = calculoItau * parcelas;
                        break;
                    case 3:
                        financiamento = calculoSantander * parcelas;
                         break; 
                    case 4:
                        financiamento = calculoBradesco * parcelas;
                         break;   
                    case 5:
                        financiamento = calculoBdB * parcelas;
                         break;
                    default:    
                        System.out.printf("Opção inválida!");
                }
        }while (escolha < 1 || escolha > 5);

        return financiamento;
    }
}
