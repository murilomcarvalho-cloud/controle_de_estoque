import java.util.Scanner;

public class Main {

    public static Estoque estoque = new Estoque();

    public static void main(String[] args) {
        int opcao;

        while (true) {
            Scanner scanner = new Scanner(System.in);

            mostraMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    int id = getId(scanner);
                    int qt = scanner.nextInt();
                    estoque.entrada(id, qt);
                    break;
                case 4:
                    int idSaida = getId(scanner);
                    int qtSaida = scanner.nextInt();
                    estoque.saida(idSaida, qtSaida);
                    break;
                case 5:
                    System.out.println("Informe o ID do produto");
                    int idBusca = scanner.nextInt();
                    estoque.buscaProduto(idBusca);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static void mostraMenu() {
        System.out.println("===================");
        System.out.println("CONTROLE DE ESTOQUE");
        System.out.println("===================");

        System.out.println();

        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Entrada de produtos");
        System.out.println("4 - Saída de produtos");
        System.out.println("5 - Buscar produto");
        System.out.println("0 - Sair");
    }

    private static int getId(Scanner scanner) {
        System.out.println("Informe o ID do produto");
        int id = scanner.nextInt();
        System.out.println("Informe a quantidade");
        return id;
    }
}
