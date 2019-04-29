
public class FuncionarioV1 {
    
    String nome;
    String lotacao;
    double salario;
    String admissao;
    String rg;
    boolean ativo = true;
    double aumento;
    
    void bonifica( double aumento){
    
    salario = salario*aumento;
    
    }
    
    void demite(){
    
        if (ativo == true){
        
            ativo = false;
        }
        
    }
        
}

