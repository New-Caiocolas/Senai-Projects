import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu peso:");
        double p = s.nextDouble();
        System.out.print("Digite sua altura:");
        double a = s.nextDouble();

        System.out.print("Seu IMC é: "+p / (a*a));

    }

}
