
public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    
    int cont = 0;
    
    void pinta(String S){
        cor = S;
    }
    int quantasPortasEstaoAbertas(){
        System.out.println("Quantidade de portas abertas: "+cont);   
        return 0;
    }
     void abrePorta1(){   
        porta1 = true; 
        cont = cont+1;
    }
    void fechaPorta1(){
        if(porta1==true){
        cont = cont-1;
        }
        porta1 = false;
    }
    void abrePorta2(){   
        porta2 = true; 
        cont = cont+1;
    }
    void fechaPorta2(){
        if(porta2==true){
        cont = cont-1;
        }
        porta2 = false;
    }
    void abrePorta3(){   
        porta3 = true; 
        cont = cont+1;
    }
    void fechaPorta3(){
        if(porta3==true){
        cont = cont-1;
        }
        porta3 = false;
    }
}
