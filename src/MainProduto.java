public class MainProduto {
    public static void main (String[] args){
        Produto P1 = new Produto();
        
        P1.nome = "Café";
        P1.preco = 10;
        P1.diminuir10();
        P1.aumenta25();
    }
}
