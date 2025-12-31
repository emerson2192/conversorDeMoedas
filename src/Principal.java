import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ApiService api = new ApiService();

        int opcao;

        do {
            System.out.println("""
                =========================
                CONVERSOR DE MOEDAS
                1 - USD (Dólar)
                2 - EUR (Euro)
                3 - GBP (Libra)
                4 - ARS (Peso Argentino)
                5 - CLP (Peso Chileno)
                6 - COP (Peso Colombiano)
                0 - Sair
                =========================
                """);

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if (opcao == 0) break;

            System.out.print("Digite o valor: ");
            double valor = leitor.nextDouble();

            String moeda = switch (opcao) {
                case 1 -> "USD";
                case 2 -> "EUR";
                case 3 -> "GBP";
                case 4 -> "ARS";
                case 5 -> "CLP";
                case 6 -> "COP";
                default -> null;
            };

            if (moeda == null) {
                System.out.println("Opção inválida!");
                continue;
            }

            // 🔥 AGORA usa ExchangeResponse
            Dadosmoedas dados = api.buscarCotacao(moeda);

            if (dados == null || !"success".equals(dados.result())) {
                System.out.println("Erro ao obter cotação.");
                continue;
            }

            // 🔥 Acessa conversion_rates
            double taxa = dados.conversion_rates().BRL();
            double convertido = valor * taxa;

            System.out.println("Valor convertido: R$ " + convertido);

        } while (true);

        System.out.println("Programa finalizado.");
    }
}
