
public class TestaFuncionarioV2 {
    
    public static void main (String[] args){
    
        FuncionarioV2 F2 = new FuncionarioV2();
        
        F2.nome = "Elvis";
        F2.rg = "19537686";
        F2.lotacao = "Desenvolvimento";
        F2.admissao = "04/09/2017";
        F2.salario = 2000.00;
       
                
        F2.bonifica(1.10);
        F2.demite();
        F2.mostrar();
    }
    
    
}
