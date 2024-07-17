import java.util.*;

public class listaCompras {

public static void main(String[] args) {
    ArrayList<String> produtos = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);  
    

    while (true) {
        System.out.print("Digite um produto:");
        produtos.add(sc.nextLine());
        System.out.println("deseja continuar(S/N):");
        String cont = sc.nextLine();
        if ("Nn".contains(cont)){
        break;
    }
    }

    for (int i = 0; i < produtos.size(); i++){
        System.out.println(i+" - "+produtos.get(i));
    }

    System.out.print("Deseja remover algum número:");
    String cont = sc.nextLine();

    while ("Ss".contains(cont)){
        System.out.print("Qual você deseja remover:");
        int remove = sc.nextInt();
        produtos.remove(remove);
        System.out.print("Deseja continuar(S/N):");
        String cont = sc.nextLine();
    }

    for (int i = 0; i < produtos.size(); i++){
        System.out.println(i+" - "+produtos.get(i));
    }


}
}
