
public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    void abre(){   
        aberta = true;  
    }
    void fecha(){
        aberta = false;
    }
    void pinta(String S){
        cor = S;
    }
    boolean estaAberta(){
        if(aberta==true){
            System.out.println("Está aberta!");
            return true;
        }
            System.out.println("Está fechada!");
            return false;
    }
    
}
