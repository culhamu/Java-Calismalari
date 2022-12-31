package Calisma09;

public class Soru_10 {
    public static void main(String[] args) {
        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
        ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        örnek:
        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
         */
        System.out.print("Alfabenin Ascii değerleri : ");

        for (char i = 'a' ;i <='z' ; i++) {
            System.out.print((int) i+" ");

        }
    }
}
