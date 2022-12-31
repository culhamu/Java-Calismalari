package Calisma22;

import java.util.Scanner;

public class YedininKatalri {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            int sayi2=i;
            if (sayi2%7==0){
                System.out.print(sayi2+" ");
            }


        }
    }
}
