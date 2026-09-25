import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> produtos = new ArrayList<>();

    public void listarProdutos(){
        if (!produtos.isEmpty()) {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        } else {
            System.out.println("Nenhum produto cadastrado.\n\n\n");
        }
    }

    public void buscaProduto(int id){
        for(Produto produto : produtos){
            if(produto.getId() == id){
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void entrada(int id, int quantidade) {
        for(Produto produto : produtos){
            if(produto.getId() == id){
                produto.adicionar(quantidade);
                System.out.println("Nova quantidade: " + produto.getQuantidadeEstoque());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void saida(int id, int quantidade) {
        for(Produto produto : produtos){
            if(produto.getId() == id){
                produto.remover(quantidade);
                System.out.println("Nova quantidade: " + produto.getQuantidadeEstoque());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
