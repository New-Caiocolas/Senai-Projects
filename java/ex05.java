import java.util.ArrayList;

public class ex05 {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("caio");
        lista.add("bob");
        lista.add("Maurício");

        System.out.println("primeiros nomes: "+lista);

        for (String nome: lista){
            System.out.println(nome);
        }
    }
}
