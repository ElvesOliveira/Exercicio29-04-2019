public class Produto {

    String nome;
    double preco;
    
    void diminuir10(){
        preco = preco - (preco*0.1);
        System.out.println ("O novo preço é: "+preco);
    }
    void aumenta25(){
        preco = preco + (preco*0.25);
        System.out.println ("O novo preço é: "+preco);
    }
}
