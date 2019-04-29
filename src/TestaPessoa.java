
public class TestaPessoa {
    
    public static void main (String [] args){
    
    Pessoa P1 = new Pessoa();
    
    P1.nome = "Elvis";
    P1.idade = 21;
    
    P1.FazerAniversário();
    P1.FazerAniversário();
    P1.FazerAniversário();
    
    System.out.println (P1.idade);
    
    }
}