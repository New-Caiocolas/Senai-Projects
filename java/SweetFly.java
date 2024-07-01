import java.util.Scanner;

public class SweetFly{

    public static void main(String[] args){
        // Escaner para leitura de dados.
        Scanner s = new Scanner (System.in);
        int opcoes = 0;
        // Vetor com registro do número de cada avião.
        int[] aviaoNum = new int[4];

        // Loop para quando for digitado o número 6 encerre.
        while (opcoes != 6){
            System.out.print("\n[1] Registrar o número de cada avião.\n[2] Registrar o quantitativo de assentos disponíveis em cada avião.\n[3] Reservar passagem aérea.\n[4] Realizar consulta por avião.\n[5] Realizar consulta por passageiro.\n[6] Encerrar.\nO que deseja fazer:");
            opcoes = s.nextInt();

            // Opção de registrar o número do avião.
            if (opcoes == 1){
                for (int i = 0; i < aviaoNum.length; i++){
                    System.out.print("Digite o número do avião:"); 
                    aviaoNum[i] = s.nextInt();
                }
            }

            // Registrar a quantidade de assentos disponíveis em cada avião.
            if (opcoes == 2){
                for (int i = 0; i < aviaoNum.length; i++){
                    System.out.println(i+" - "+aviaoNum[i]);
                }
                
                System.out.println("Qual avião deseja registrar os assentos:");
                int assentosNum = s.nextInt();
                
            
            }

        }
    }
}