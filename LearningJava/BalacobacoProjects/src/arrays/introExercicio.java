package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class introExercicio {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Insira quantas notas deseja adicionar: ");
        int qtd_notas = entradaDados.nextInt();//ler a quantidade de notas do usuario

        double[] notas = new double[qtd_notas];// cria um array com a quantidade de notas
        
        //ler as notas do usuario
        for (int i = 0; i < notas.length; i++)
        {
            System.out.printf("Insira a nota[%d]: ", i+1);
            notas[i] = entradaDados.nextDouble();
        }

        System.out.println(Arrays.toString(notas));//mostra as notas lidas no for acima

        //calcula a soma das notas
        double somaTotal = 0;
        for (double nota : notas) 
        {
            somaTotal += nota;
        }

        //calcula e mostra a media das notas
        System.out.println("Media das notas = " + (somaTotal/notas.length));

        entradaDados.close();

    }

}
