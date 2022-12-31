package Calisma22;

import java.util.Scanner;

public class BaslangicBitis {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir başlangıç degeri giriniz");
        int baslangic=scan.nextInt();
        System.out.println("Lütfen pozitif bir bitis degeri giriniz");
        int Bitis=scan.nextInt();
        int toplam=0;
        if (baslangic>Bitis){
            System.out.println("Uyari baslangic degeri bitis degerinden büyük olamaz");
        }else

            for (int i = baslangic; i <=Bitis ; i++) {
                toplam+=i;



        } System.out.print(toplam+" ");
    }
}
