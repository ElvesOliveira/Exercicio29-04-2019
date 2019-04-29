public class TestaFuncionarioV4 {
    
    public static void main (String[] args){
    
        FuncionarioV4 F3 = new FuncionarioV4();
     
        F3.nome = "Elvis";
        F3.rg = "19537686";
        F3.lotacao = "Desenvolvimento";
        F3.salario = 2000.00;
       
        Data d1 = new Data();
        
        d1.dia = 04;
        d1.mes = 9;
        d1.ano = 2017;
        
        F3.admissao = d1;
        
        FuncionarioV4 F2 = new FuncionarioV4();
        
        F2.nome = "Elvis";
        F2.rg = "19537686";
        F2.lotacao = "Desenvolvimento";
        F2.salario = 2000.00;
       
        Data d2 = new Data();
        
        d2.dia = 04;
        d2.mes = 9;
        d2.ano = 2017;
        
        F2.admissao = d2;
        
        F3.bonifica(1.10);
        F3.demite();
        F3.mostrar();
        F3.equals(F2);
    }
    
    
}
