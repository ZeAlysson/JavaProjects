package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Miguel"));

        System.out.println(lista.get(2).nome);

        for (Usuario user : lista) {
            System.out.println(user.nome);
        }

    }
}
