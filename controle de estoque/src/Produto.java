public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(){}

    public Produto(int id, String nome, double preco, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionar(int quantidade){
        quantidadeEstoque += quantidade;
    }

    public void remover(int quantidade){
        quantidadeEstoque -= quantidade;
    }

    public void exibirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString(){
        return "ID: " + id + " | Nome: " + nome + " | Preço: R$" + preco + " | Quantidade em estoque: " + quantidadeEstoque;
    }
}
