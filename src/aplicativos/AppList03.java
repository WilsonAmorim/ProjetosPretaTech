package aplicativos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList03 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        while (true) {
            String nome = JOptionPane.showInputDialog("Insira um Nome? ");
            nomes.add(nome);
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
            if(opcao == JOptionPane.NO_OPTION){
                break;
            }
        }

        Collections.sort(nomes);

        nomes.forEach( nome -> System.out.println(nome));



    }

}
