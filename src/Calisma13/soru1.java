package Calisma13;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*
        Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();


        for (int i =sayi ; i>0; i=i/10) {

            int tersSayi=i%10;
            System.out.print(tersSayi);

        }


    }
}
