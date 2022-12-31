package Calisma18;

public class Variables2 {
    public static void main(String[] args) {

        /*
        3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
         */
        long ktp=5461L;
        long dftr=264846L;
        long laptp=5168431L;

        long tplfiyat=(2*ktp)+(4*dftr)+(3*laptp);

        System.out.println(tplfiyat);

        System.out.println("=============================");

        /*
        İki tamsayıyı değiştirmek için bir kod yazınız.
         */

        int sayi1=125;
        int sayi2=564;

        int temp;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("sayıların yeri değişti:"+"\n"+sayi1+"\n"+sayi2);

        System.out.println("================================");

        /*
        Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
         */
        short shrt=12;
        int sayi=shrt;
        System.out.println(sayi);
        System.out.println("=====================================");

        /*
        Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
         */

        long lng=132155L;
        int  int1=(int) lng;
        System.out.println(int1);
        System.out.println("==============================");

        /*
        Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
         */

        double dbl=120.63;
        float flt=(float) dbl;
        System.out.println(flt);
        System.out.println("============================");
        /*
        Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
         */
        double dbl1=12.65;
        short shrt1=(short) dbl1;
        System.out.println((short)shrt1);
        System.out.println("=================================");

        /*
        Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
         */
        byte byt=12;
        double dbl3=byt;
        System.out.println((int) dbl3);



    }
}
