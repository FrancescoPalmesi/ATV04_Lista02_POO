public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimeDetalhes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: " + preco);
    }
}
