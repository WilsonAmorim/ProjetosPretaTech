package aplicativos;

import java.util.ArrayList;
import java.util.List;

public class AppList02 {
    public static void main(String[] args) {
        // Lista de pessoas
        List<String> nomes = new ArrayList<>();
        nomes.add("wilson"); // 0
        nomes.add("Jaciara"); //1
        nomes.add("Daiana"); // 2
        nomes.add("Danilo"); // 3
        nomes.add("Pedro"); // 4
        nomes.add("Maria"); // 5
        nomes.add("Caê");  // 6

        // adicionar um item no inicio da lista

        nomes.forEach( s -> System.out.println(s));

        System.out.println("adicionar um item no inicio da lista");
        nomes.add(0, "Miau");

        nomes.forEach( s -> System.out.println(s));
        System.out.println("Remover elemento 1 pelo indice ");
        nomes.remove(1);
        nomes.forEach( s -> System.out.println(s));
        System.out.println("Remover elemento pelo nome ");
        nomes.remove("Jaciara");
        nomes.forEach( s -> System.out.println(s));
        System.out.println("Remover um elemento com uma condição ");
        nomes.removeIf(s -> s.contains("ê") || s.contains("e"));
        nomes.forEach( s -> System.out.println(s));
    }

}
