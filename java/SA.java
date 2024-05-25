import java.util.Scanner;

public class SA {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        String valor = s.nextLine();

        System.out.printf("Sua idade é : "+valor);
    }
}