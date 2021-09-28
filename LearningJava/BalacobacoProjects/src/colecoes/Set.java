package colecoes;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    
    public static void main(String[] args) {
        
        //HashSet<String> listaAlunos = new HashSet<String>(); //Conjunto desordenado
        TreeSet<String> listaAlunos = new TreeSet<String>(); //Conjunto ordenado

        listaAlunos.add("Carlos");
        listaAlunos.add("Alex");
        listaAlunos.add("Bruno");
        listaAlunos.add("Davi");

        for (String candidato : listaAlunos) {
            System.out.println(candidato);
        }

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(43);
        numbers.add(31);
        numbers.add(12);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
