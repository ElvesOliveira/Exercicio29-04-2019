
public class TestaFuncionarioV3 {
    
    public static void main (String[] args){
    
        FuncionarioV3 F3 = new FuncionarioV3();
     
        F3.nome = "Elvis";
        F3.rg = "19537686";
        F3.lotacao = "Desenvolvimento";
        F3.salario = 2000.00;
       
        Data d1 = new Data();
        
        d1.dia = 04;
        d1.mes = 9;
        d1.ano = 2017;
        
        F3.admissao = d1;
        
        F3.bonifica(1.10);
        F3.demite();
        F3.mostrar();
    }
    
    
}
