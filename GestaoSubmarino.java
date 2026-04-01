import java.util.Scanner;

public class GestaoSubmarino {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double RepasseAnual = 0;

        System.out.println("--- SISTEMA DE COMANDO PROSUB 2026 ---");
        
        System.out.print("Informe o valor do repasse natural (ex: 1.0): ");
        Double respostaRDouble = sc.nextDouble();

        if (respostaRDouble < 0.5) {
            System.out.println("ALERTA: Risco de paralisação total. Data estimada: 2045.");
        }   if (respostaRDouble >= 0.5 && respostaRDouble <= 1.0) {
            System.out.println("Ritmo lento. Finalização prevista para 2037.");
        } if (respostaRDouble > 1.0) {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega.");
        }

        System.out.print("Informe o país de origem da solicitação: ");
        String pais = sc.next();

        if (pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Nível de acesso solicitado: TOTAL. \nAcesso autorizado ao Almirantado");
        } else {
            System.out.println("Status: ACESSO NEGADO \nSoberania Nacional preservada. Dados criptografados. ");
            return; // PARA AQUI
        }

        System.out.print("Informe a temperatura do reator nuclear: ");
        Double temperatura = sc.nextDouble();

        if (temperatura < 280) {
            System.out.println("Aumentar potência do reato.");
        } if (temperatura >= 280 && temperatura <= 350) {
           System.out.println("Operação Normal - Cruzeiro."); 
        }  else if (temperatura > 350) {
            System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência.");
        }
        }
    }

