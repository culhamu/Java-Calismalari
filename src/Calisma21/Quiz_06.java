package Calisma21;

import java.util.Scanner;

public class Quiz_06 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi % 5 == 0 ? "5' in tam kati" : " 5'in tam katı degil");


    }
}
