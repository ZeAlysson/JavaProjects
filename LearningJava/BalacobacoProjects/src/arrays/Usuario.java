package arrays;

public class Usuario {
    
    String nome;
    String email;

    public boolean equals(Object objeto) {

        Usuario outro = (Usuario)objeto;

        if ((outro.nome.equals(this.nome)) && (outro.email.equals(this.email))) {
            return true;
        } else {
            return false;
        }
    }
}
