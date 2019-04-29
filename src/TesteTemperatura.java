public class TesteTemperatura {
    public static void main(String[] args){
        Temperatura t = new Temperatura();
        
        double resultado;
        resultado = t.converterParaFarenheit(23.5);
        System.out.println(resultado);
        resultado = t.converterParaCelsius(102.0);
        System.out.println(resultado);
    }
}
