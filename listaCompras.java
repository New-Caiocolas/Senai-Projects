import java.util.*;

public class listaCompras {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> produtos = new ArrayList<String>();  
    

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

}
}
