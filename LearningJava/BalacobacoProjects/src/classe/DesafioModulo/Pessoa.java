package classe.DesafioModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer (Comida comida) {
        this.peso = this.peso + comida.peso;
    }

    String apresentar() {
        return "Ola eu sou " + nome + " e tenho " + peso + " Kg";
    }
}
