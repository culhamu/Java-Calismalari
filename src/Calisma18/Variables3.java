package Calisma18;

public class Variables3 {
    public static void main(String[] args) {
        /*
        Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        bulmak için bir kod yazınız.
         */
     byte  byt=Byte.MIN_VALUE;
     short shrt=Short.MAX_VALUE;
        System.out.println("Sayilarin toplami:"+" "+(byt+shrt));
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("===================================");
        /*
        Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        değişken arasındaki farkı yazdırınız.
         */
        String str="103";
        byte byt3=Byte.parseByte(str);
        String str2="2351";
        short shrt3=Short.parseShort(str2);
        System.out.println(byt3+shrt3);
        System.out.println("==============================");

        byte sayi4=Byte.valueOf("103");
        short sayi5=Short.valueOf("2351");
        System.out.println(sayi5+sayi4);
        System.out.println("===========================");


    }
}
