import java.util.Scanner;

public class SweetFly{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int opcoes = 0;
        while (opcoes != 6){
            System.out.print("\n[1] Registrar o número de cada avião.\n[2] Registrar o quantitativo de assentos disponíveis em cada avião.\n[3] Reservar passagem aérea.\n[4] Realizar consulta por avião.\n[5] Realizar consulta por passageiro.\n[6] Encerrar.\nO que deseja fazer:");
            opcoes = s.nextInt();

            if (opcoes == 1){
                System.out.print("Digite o número do avião:");
            }

        }

    }
}