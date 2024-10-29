public class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void imprimeDetalhes() {
        super.imprimeDetalhes();
        System.out.println("Desconto: " + desconto);
        System.out.println("Preço Total: " + (getPreco() - desconto));
    }
}
