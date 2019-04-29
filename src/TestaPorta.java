
public class TestaPorta {
    
    public static void main (String[] args){
    
        Porta P1 = new Porta();
        
        P1.abre();
        P1.fecha();
        P1.pinta("azul");
        P1.abre();
        P1.pinta("verde");
        P1.fecha();
        P1.pinta("vermelho");
        P1.dimensaoX = 5.00;
        P1.dimensaoY = 5.00;
        P1.dimensaoZ = 5.00;
        P1.estaAberta();
    }
    
}
