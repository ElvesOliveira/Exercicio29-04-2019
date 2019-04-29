
public class FuncionarioV2 {
    
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
    
    void mostrar(){
    System.out.println(nome);
    System.out.println(lotacao);
    System.out.println(salario);
    System.out.println(admissao);
    System.out.println(rg);
    System.out.println(ativo);
    }
        
}

