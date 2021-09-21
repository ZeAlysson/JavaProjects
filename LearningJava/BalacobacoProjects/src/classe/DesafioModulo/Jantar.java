package classe.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {
        
        Comida c1 = new Comida("Arroz", 0.120);
        Comida c2 = new Comida("Macarrao", 0.210);

        Pessoa p1 = new Pessoa("Carlos", 80);

        System.out.println(p1.apresentar());
    
        p1.comer(c1);
        System.out.println(p1.apresentar());
        
        p1.comer(c2);
        System.out.println(p1.apresentar());

    }
}
