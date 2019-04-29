
public class TestaCasa {
    public static void main (String[] args){
        
        Casa C1 = new Casa();
        C1.pinta("Brano");
        Porta Porta1 = new Porta();
        Porta Porta2 = new Porta();
        Porta Porta3 = new Porta();
        C1.abrePorta1();
        C1.fechaPorta2();
        C1.abrePorta3();
        C1.quantasPortasEstaoAbertas();
        
    }
}
