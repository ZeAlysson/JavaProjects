package classe;

public class produtoTeste {

    public static void main(String[] args) {

        produto p1 = new produto("Arroz", 5.00f);
        // p1.nome = "Arroz";
        // p1.preco = 5.00f;
        //p1.desconto = 0.15f;

        produto p2 = new produto("Feijão", 10f);
        // p2.nome = "Feijão";
        // p2.preco = 10f;
        //p2.desconto = 0.20f;

        produto.desconto = 0.50f;

        float precoComDesconto1 = p1.aplicarDesconto();
        float precoComDesconto2 = p2.aplicarDesconto();

        System.out.printf("Preço do %s com desconto: %.2f\n", p1.nome, precoComDesconto1);
        System.out.printf("Preço do %s com desconto: %.2f\n", p2.nome, precoComDesconto2);

    }
}
