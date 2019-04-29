public class TestaEsfera {
    public static void main (String[] args){
        Esfera e = new Esfera();
        e.raio = 150;
        System.out.println(e.volume);
        e.calculaVolume();
        System.out.println(e.volume);
    }
}
