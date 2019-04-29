
public class TestaFuncionarioV1 {
    
    public static void main (String[] args){
    
        FuncionarioV1 F1 = new FuncionarioV1();
        
        F1.nome = "Elvis";
        F1.rg = "19537686";
        F1.lotacao = "Desenvolvimento";
        F1.admissao = "04/09/2017";
        F1.salario = 2000.00;
       
                
        F1.bonifica(1.10);
        F1.demite();
        
        System.out.println(F1.nome);
        System.out.println(F1.rg);
        System.out.println(F1.lotacao);
        System.out.println(F1.admissao);
        System.out.println(F1.salario);
        System.out.println(F1.ativo);
        
    }
    
    
}
