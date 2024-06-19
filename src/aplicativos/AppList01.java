package aplicativos;

import java.util.ArrayList;
import java.util.List;

public class AppList01 {
    public static void main(String[] args) {
        // Lista de pessoas
        List<String> nomes = new ArrayList<>();
        nomes.add("wilson");
        nomes.add("Jaciara");
        nomes.add("Daiana");
        nomes.add("Danilo");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Caê");

        System.out.println(nomes);
        System.out.println("_____Usando o For______");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println("_____Usando o For aprimorado______");
        for (String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("_____Usando o For forEach______");
        nomes.forEach( s -> System.out.println(s));



    }

}
