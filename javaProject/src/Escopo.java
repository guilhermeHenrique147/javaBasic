public class Escopo {
    //Autor: Guilherme Henrique
    private static void exibirPrecoFinal(float paramPreco) {
        System.out.println("Preço final: " + paramPreco);
    }

    public static void main(String[] args) {

        int idade = 70;
        float preco = 200;

        if(idade >= 60 || preco < 30) {
            float precoComDesconto = preco / 100 * 90;
            System.out.println("Desconto de " + (preco - precoComDesconto));
            preco = precoComDesconto;
        }

        exibirPrecoFinal(preco);

    }
}
