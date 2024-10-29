public class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void imprimeDetalhes() {
        super.imprimeDetalhes();
        System.out.println("Adicional: " + adicional);
        System.out.println("Preço Total: " + (getPreco() + adicional));
    }
}
