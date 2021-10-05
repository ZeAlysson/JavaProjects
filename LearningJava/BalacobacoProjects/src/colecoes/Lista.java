package colecoes;

import java.util.ArrayList;

public class Lista { 
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");
        
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));//Acessa um valor pelo indice

        System.out.println("Removido: "+ lista.remove(1));//Remove um valor pelo indice
        System.out.println("Removido: "+ lista.remove(new Usuario("Manu")));

        //Retorna um valor booleano se contem um tal valor na lista
        System.out.println("Tem? " + lista.contains(new Usuario("Manu"))); 
        System.out.println("Tem? " + lista.contains(u1));

        for (Usuario user : lista) {
            System.out.println(user);
        }

    }
}
