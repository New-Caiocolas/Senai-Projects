import java.util.Scanner;

public class calculadora {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o 1o número:");
        int pn = sc.nextInt();

        System.out.print("Digite  o 2o número:");
        int sn = sc.nextInt();

        System.out.print("Qual operação você deseja fazer( + , - , / , * ): ");
        char op = sc.next().charAt(0);
        sc.close();
        double r;

        switch(op) {
            case '+' -> r = pn + sn;
            case '-' -> r = pn - sn;
            case '/' -> r = pn / sn;
            case '*' -> r = pn * sn;
        default -> {
            System.out.println("Operação inválida");
            return;
            }

        }
        
        System.out.print("A operação "+pn+" "+op+" "+sn+" resulta no valor: "+r);

    }
}

