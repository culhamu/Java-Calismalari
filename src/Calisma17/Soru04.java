package Calisma17;

public class Soru04 {
    public static void main(String[] args) {
        /*
        Soru 42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve
        bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

     toplam(1,2,3) çıktı =6
	 toplam(1,2,3,4,5) çıktı =15
	 sum(1,2) output=3
     Ipucu:  varargs sorusu, varargs olusturalım
         */

        sayilariTopla(1,2,3,4,5);


    }public static void sayilariTopla(int ...sayi){

        int toplam=0;
        for (int w:sayi) {
            toplam+=w;
        }
        System.out.println(toplam);
    }
}
