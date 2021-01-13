package darbasklaseje;
                    /*apskritimo perimetras 2piR
                      Metodai */
public class DarbasKlaseje {

   public static double apskritimoPerimetras(double r) { //metodo aprasymas: reiksmes tipas kuria grazins metodas
       double perimetras = 2 * Math.PI * r;
       return perimetras;
   }
   
   public static double trikampioPlotas(double a, double b, double c) {
       if (a + b < c || b + c < a || a + c < b ) { //tikrinam ar tinkami skaciai
           return -1;
       }
       //pirma pusmetri skaiciuojam
       double p = (a + b + c) /2;
       double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
       return s;
   }
   
   public static int skaiciuSuma(int nuo, int iki) {
       int suma = 0;
       for (int i = nuo; i <= iki; i++) {
           suma += i;
       }
       return suma;
   }
   
   //metodas,kuris nieko negrazina, o tiesiog atspausdina skaicius
   public static void spausdinamSkaicius(int nuo, int iki) { //void reiskia, kad negrazins rezultato
       int suma = 0;
       for (int i = nuo; i <= iki; i++) {
           System.out.println(i);
       }
   }
   
   
    public static void main(String[] args) {
        spausdinamSkaicius(5, 10); //sito negaliu priskirti kintamajam. Void tipas negrazina jokio reiksmes, o kintamoji negali buti be reiskmes
        spausdinamSkaicius(1, 3);
        
//        System.out.println(skaiciuSuma(1, 100));
        
//        double t1Plotas = trikampioPlotas(3, 5, 5);
//        System.out.println(t1Plotas);
        
        /*
        double a1 = .5;   //apskritimo spindulis
        double a2 = 1.74;
        double a3 = 15.12;
        
        double p1 = apskritimoPerimetras(a1);
        double p2 = apskritimoPerimetras(a2);
        double p3 = apskritimoPerimetras(a3);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3)
        ;
*/
    }
    
}
