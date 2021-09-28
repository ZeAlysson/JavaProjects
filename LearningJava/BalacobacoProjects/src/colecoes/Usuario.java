package colecoes;

public class Usuario {
    
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ola me chamo " + this.nome;
    }

}
