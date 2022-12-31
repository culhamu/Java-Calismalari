package Calisma17;

public class C01_GenelTekrar {
    public static void main(String[] args) {
        /*
        Provided that you have a given number of small rice bags (1 kilo each)
        and big rice bags (5 kilos each),
        write a method that returns true if it is possible to make a package with goal kilos of rice.
         */
        System.out.println(pirincCuvali(25, 10, 100));

    }public static Boolean pirincCuvali(int buyuk, int kucuk, int hedef){
       boolean sonuc=false;
       if (buyuk*5>=hedef){
           if (kucuk<=hedef%5){
               sonuc=true;
           }
       }else {
           if (kucuk>=hedef-buyuk*5){
               sonuc=true;
           }
       }

        return sonuc;
    }
}
