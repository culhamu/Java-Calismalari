package Calisma20;

public class Quiz_02 {
    public static void main(String[] args) {
        /*Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim.
        */
        double sayi1=12.25;
        int sayi2=(int) sayi1;
        System.out.println(sayi2);
    }
}
