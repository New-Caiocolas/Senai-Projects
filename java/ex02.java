import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Qual é a força:");
        double f = s.nextDouble();
        System.out.print("Qual é a distancia:");
        double d = s.nextDouble();

        System.out.print("O trabalho realizado é: "+(f*d));
        s.close();


    }
}
