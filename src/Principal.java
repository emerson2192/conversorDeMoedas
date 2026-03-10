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
                1 - Dollar ==> Peso argentino
                2 - Peso argentino ==> Dollar
                3 - Dollar ==> Real brasileiro
                4 - Real brasileiro ==> Dollar
                5 - Dollar ==> Peso colombiano
                6 - Peso colombiano ==> Dollar
                0 - Sair
                =========================
                """);

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = leitor.nextDouble();

            String base = null;
            String target = null;

            switch (opcao) {

                case 1 -> {
                    base = "USD";
                    target = "ARS";
                }

                case 2 -> {
                    base = "ARS";
                    target = "USD";
                }

                case 3 -> {
                    base = "USD";
                    target = "BRL";
                }

                case 4 -> {
                    base = "BRL";
                    target = "USD";
                }

                case 5 -> {
                    base = "USD";
                    target = "COP";
                }

                case 6 -> {
                    base = "COP";
                    target = "USD";
                }

                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            Dadosmoedas dados = api.buscarCotacao(base, target);

            if (dados == null || !"success".equals(dados.result())) {
                System.out.println("Erro ao obter cotação.");
                continue;
            }

            double taxa = dados.conversion_rate();
            double convertido = valor * taxa;

            System.out.println(
                    "Resultado: " + valor + " " + base +
                            " = " + convertido + " " + target
            );

        } while (true);

        System.out.println("Programa finalizado.");
    }
}