import java.util.*;

public class listaCompras {

public static void main(String[] args) {
    ArrayList<String> produtos = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);  
    

    while (true) {
        System.out.print("Digite um produto: ");
        produtos.add(sc.nextLine());
        System.out.print("deseja continuar(S/N): ");
        String cont = sc.nextLine();
        if ("Nn".contains(cont)){
        break;
    }
    }

    for (int i = 0; i < produtos.size(); i++){
        System.out.println(i+" - "+produtos.get(i));
    }

    System.out.print("Deseja remover algum número(S/N):");
    String cont = sc.nextLine();

    while ("Ss".contains(cont)){
        System.out.print("Qual você deseja remover (digite o número): ");
        int removeIndex = sc.nextInt();
        sc.nextLine();

        if (removeIndex >= 0 && removeIndex < produtos.size()) {
            produtos.remove(removeIndex);
        } else {
            System.out.println("Índice inválido, por favor, digite um número válido.");
        }


        System.out.print("Deseja continuar (S/N): ");
        cont = sc.nextLine();

        for (int i = 0; i < produtos.size(); i++){
            System.out.println(i+" - "+produtos.get(i));
        }
    }
        
       
    }


}

