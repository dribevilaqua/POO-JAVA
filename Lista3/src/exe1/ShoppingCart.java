package exe1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    //Associação com Vetor
    private List<CarItem> itens;

    public ShoppingCart() {
        //Aloca espaço na memória para o vetor
        this.itens = new ArrayList<>();
    }

    public ShoppingCart(int id) {
        this.id = id;
        //Aloca espaço na memória do vetor
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getItems() {
        return itens;
    }

    public void addCarItem(int quantity, Product product){
        //adiciona item no ArrayList
        this.itens.add( new CarItem(quantity, product));
        System.out.println("Item do carrinho adicionado com sucesso");
    }

    @Override
    public String toString() {
        return "\nShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                '}';
    }
    //Criar método que calcula o valor total do carrinho de compras
    public void valorTotal(){
        float total = 0;
        // para cada CarItem do vetor
        // a variável item representa um item do vetor
        for(CarItem item : itens){
           total += item.getQuantity() * item.getProduct().getPrice();
        }
        System.out.println("Total do carrinho: " + total);
    }
    // remove um item do carrinho
    public void removeCarItem(int quantity, Product product) {
        boolean resposta = this.itens.remove(new CarItem(quantity, product));
        if (resposta){
            System.out.println("Item Removido com sucesso");
        }
        else System.out.println("Item do carrinho não foi removido");
    }

}


