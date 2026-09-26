import java.util.Locale;

public class Produto {
    private final int id;
    private final String nome;
    private final double preco;
    private int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        if (id <= 0) {
            throw new IllegalArgumentException("O ID deve ser maior que zero.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
        if (preco < 0 || Double.isNaN(preco) || Double.isInfinite(preco)) {
            throw new IllegalArgumentException("O preço deve ser um valor válido e não negativo.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }

        this.id = id;
        this.nome = nome.trim();
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionar(int quantidade) {
        if (quantidade <= 0 || this.quantidade > Integer.MAX_VALUE - quantidade) {
            return false;
        }
        this.quantidade += quantidade;
        return true;
    }

    public boolean remover(int quantidade) {
        if (quantidade <= 0 || quantidade > this.quantidade) {
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + formatarPreco());
        System.out.println("Quantidade: " + quantidade);
    }

    public String formatarPreco() {
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", preco);
    }
}
