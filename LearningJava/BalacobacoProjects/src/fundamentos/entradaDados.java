package fundamentos;

import java.util.Scanner;

public class entradaDados {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Seu nome e: " + nome);

        dados.close();
    }

}
