public class Main {
    public static void main(String[] args) {
        // Criando instâncias de imóveis novos e velhos
        Novo imovelNovo1 = new Novo("Avenida das Rosas, 123", 450000, 30000);
        Novo imovelNovo2 = new Novo("Rua das Palmeiras, 456", 520000, 25000);
        Velho imovelVelho1 = new Velho("Rua dos Girassóis, 789", 200000, 15000);
        Velho imovelVelho2 = new Velho("Alameda das Orquídeas, 101", 180000, 12000);

        // Exibindo os detalhes dos imóveis novos
        System.out.println("Detalhes do Imóvel Novo 1:");
        imovelNovo1.imprimeDetalhes();

        System.out.println("\nDetalhes do Imóvel Novo 2:");
        imovelNovo2.imprimeDetalhes();

        // Exibindo os detalhes dos imóveis velhos
        System.out.println("\nDetalhes do Imóvel Velho 1:");
        imovelVelho1.imprimeDetalhes();

        System.out.println("\nDetalhes do Imóvel Velho 2:");
        imovelVelho2.imprimeDetalhes();
    }
}