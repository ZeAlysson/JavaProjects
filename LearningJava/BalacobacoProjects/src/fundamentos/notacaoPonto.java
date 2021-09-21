package fundamentos;

import javax.swing.JButton;
import java.util.Date;

public class notacaoPonto {

    public static void main(String[] args) {

        String frase = "Bom dia, Fulano";
        frase = frase.replace("Fulano","Ciclano");
        frase = frase.toUpperCase();
        frase = frase.concat("!!!");

        System.out.println(frase);

        String frase2 = "Ola mundo";

        System.out.println(frase2.toUpperCase());

        Date date = new Date();

        JButton botao = new JButton();


    }
}
