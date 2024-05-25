import java.util.Scanner;

public class ex01{

    public static void main(String[] args){
        // Scanner para entrada de dados
        Scanner s = new Scanner(System.in);
        int[] num = new int[3];
        int soma = 0;

        for (int i = 0; i < 3; ++i){
            System.out.println("Digite o "+(i+1)+"o número:");
            num[i] = s.nextInt();
            soma += num[i];

        }

        System.out.print("A média do aluno é "+soma/3);
        s.close();
    }
}