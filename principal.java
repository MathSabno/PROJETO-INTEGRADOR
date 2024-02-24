/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigoPI;

import java.io.IOException;
import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        System.out.println("*---------- SEJA BEM-VINDO ----------*");
        Scanner input = new Scanner (System.in);
        
        String valorImovel;
        double vlImovel;
        String valorConfirmado;
        int vlConfirmado;
        String vlVenal;
        double valorVenal;
        boolean valida ;
        
        isNumeric validador = new isNumeric();
        
        do {            
            //1. Receber valor do imóvel
            System.out.println("Digite o valor total de compra do imóvel: ");
            valorImovel = input.next();
            valida = isNumeric.isNumeric(valorImovel);
            
            //Permite apenas números
            while (valida == false){
                System.out.println("O valor digitado não é um número. Digite novamente:");
                valorImovel = input.next();
                valida = isNumeric.isNumeric(valorImovel);
            };
    
            vlImovel = Double.parseDouble(valorImovel);
            
            //2. Não permite valor negativo
            while (vlImovel <= 0) {
                System.out.println("Valor não pode ser negativo ou igual a zero.\nDigite o valor do imóvel: ");
                vlImovel = input.nextDouble();
            }
            
            //3. Confirma valor do imóvel
            System.out.printf("O valor do imóvel é: R$ %,.2f.\nEstá correto e deseja continuar? Digite:\n1 - Para continuar\n2 - Para refazer\n", vlImovel);
            valorConfirmado = input.next();
            
            while (!(valorConfirmado.equals("1") || valorConfirmado.equals("2"))){
                System.out.printf("Opção inválida! Digite:\n1 - Para continuar\n2 - Para refazer\n");
                valorConfirmado = input.next();
            }
            vlConfirmado = Integer.parseInt(valorConfirmado);
           
        } while (vlConfirmado != 1);
        
        do {
            //1. Recebe valor venal
            System.out.println("Digite o valor venal do imóvel: ");
            vlVenal = input.next();
            valida = isNumeric.isNumeric(vlVenal);
            
            while (valida == false){
                System.out.println("Por favor, digite apenas números. Informe o valor novamente:");
                vlVenal= input.next();
                valida = isNumeric.isNumeric(vlVenal);
            }
            valorVenal = Double.parseDouble(vlVenal);
            
            //2. Não permite valor negativo
            while (valorVenal <= 0) {
                System.out.println("Valor não pode ser negativo ou igual a zero.\nDigite o valor venal do imóvel: ");
                valorVenal = input.nextFloat();
            }
            while (valorVenal < vlImovel){
                System.out.println("O valor venal não pode ser menor que o valor de compra. Digite novamente: ");
                valorVenal = input.nextFloat();
            }

            System.out.printf("O Valor Venal digitado é: R$ %,.2f.\nEstá correto e deseja continuar? Digite:\n1 Para continuar\n2 Para refazer\n", valorVenal);
            valorConfirmado = input.next();
            
            while (!(valorConfirmado.equals("1") || valorConfirmado.equals("2"))){
                System.out.printf("Opção inválida! Digite:\n1 - Para continuar\n2 - Para refazer\n");
                valorConfirmado = input.next();
            }
            vlConfirmado = Integer.parseInt(valorConfirmado);
            
        } while (vlConfirmado != 1);
        
        calculoEscritura escritura = new calculoEscritura();
        calculoJuros juros = new calculoJuros(); 
        calculoITBI itbi = new calculoITBI();
        calculoTabeliao tabeliao = new calculoTabeliao();
        calculoCorretagem corretagem = new calculoCorretagem();
        calculoIPTU iptu = new calculoIPTU();      
        calculoRegistros registro = new calculoRegistros();
        calculoFinal total = new calculoFinal();
    
        double financiamento = 0;
        String escolher;
        int escolha;
        
        System.out.println("*---------- CALCULO FINANCIAMENTO ----------*");
        do {
            
           System.out.printf("O imóvel possui financiamento?\n1 - Sim\n2 - Não\n");
            escolher = input.next();
                
           while (!(escolher.equals("1") || escolher.equals("2"))){
                System.out.printf("Opção inválida! Digite novamente: \n1 - Sim\n2 - Não\n");
                escolher = input.next();
            }
           escolha = Integer.parseInt(escolher);
            
            switch (escolha){
                case 1:
                    //Chamada para o calculo de Juros
                    double entrada = calculoJuros.quantiaEntrada(vlImovel);
                    int parcelas = calculoJuros.qntdParcelas();
                    
                    double calculoCaixa = juros.calculoCaixa(0.0999, 0, 0, vlImovel, entrada, parcelas, 0);
                    double calculoItau = juros.calculoItau(0.1049, 0, 0, vlImovel, entrada, parcelas, 0);
                    double calculoSantander = juros.calculoSantander(0.1099, 0, 0, vlImovel, entrada, parcelas, 0);
                    double calculoBradesco = juros.calculoBradesco(0.1149, 0, 0, vlImovel, entrada, parcelas, 0);
                    double calculoBdB = juros.calculoBdB(0.12, 0, 0, vlImovel, entrada, parcelas, 0);
                    juros.imprimirBancos (calculoCaixa, calculoItau, calculoSantander, calculoBradesco, calculoBdB);
                    financiamento = juros.escolherBanco(calculoCaixa, calculoItau, calculoSantander, calculoBradesco, calculoBdB, parcelas);
                    System.out.printf("O valor do financiamento é de R$ %,.2f\n", financiamento);
                    break;
             
                case 2:
                    financiamento = financiamento;
                    System.out.printf("O imóvel não possui financiamento.\n");
                    break;
                default:
                    System.out.printf("Opção inválida!");
            }
            
        } while (escolha != 1 && escolha != 2);
           
        System.out.println("*---------- CALCULO REGISTROS ----------*");
        //Chamada para o calculo de Registros
        double vlRegistros = calculoRegistros.calculoRegistro(vlImovel, financiamento);
        
        System.out.println("*---------- CALCULO ITBI ----------*");
        //Chamada para o calculo do ITBI;;
        double baseDeCalculo = (calculoITBI.verificarMaior(valorVenal, financiamento));
        double salvarITBI = calculoITBI.verificarLimite(baseDeCalculo);
        
        //Chamada para o calculo do Tabelião
        double vlTabeliao = calculoTabeliao.calculoTabeliao(vlImovel, financiamento);
        
        //Chamada para o calculo do Escritura
        double vlEscritura = calculoEscritura.calculoEscritura(vlImovel, financiamento);
        
        System.out.println("\n*---------- CALCULO CORRETAGEM ----------*");
        //Chamada para o calculo do Corretagem
        double taxaCorretagem = calculoCorretagem.calculoCorretagem(vlImovel);
        System.out.printf("O valor da taxa de corretagem será de R$ %,.2f\n", taxaCorretagem);
        
        System.out.println("*---------- CALCULO IPTU ----------*");
        //Chamada para o calculo do IPTU
        double vlIPTU = calculoIPTU.calculoIPTU(valorVenal);
        System.out.printf("O valor de tributo que deverá ser pago é de: R$ %,.2f\n", vlIPTU);
        
        calculoFinal.calculoFinal(vlImovel, financiamento, vlRegistros, salvarITBI, vlIPTU, taxaCorretagem, vlTabeliao, vlEscritura);        
    }   
 }
