
public class Temperatura {
   double converterParaCelsius(double farenheit){
       double resultado;
       resultado = (farenheit - 32) * (5.0/9);
       
       return resultado;
   } 
   
   double converterParaFarenheit(double celsius){
       double resultado;
       resultado = (celsius*9/5) + 32;
       
       return resultado;
   }
}
