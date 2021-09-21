package classe;

public class produto {

    String nome;
    float preco;
    static float desconto = 0.25f;

    produto(String nomeInicial, float precoInicial)
    {
        nome = nomeInicial;
        preco = precoInicial;
    }

    float aplicarDesconto()
    {
        return (1 - desconto) * preco;
    }

}
