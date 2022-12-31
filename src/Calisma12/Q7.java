package Calisma12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        sayisini bir list olarak donduren bir method olusturun.
         */
        System.out.println(fibonacciSayisiGetir(1));


    }public static List<Integer> fibonacciSayisiGetir(int adet){
        List<Integer> fibonacciSayisi=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac tane fibonacci sayisi istediginizi giriniz");
        adet= scan.nextInt();

        if (adet<=0){
            System.out.println("Gecersiz sayi");
        } fibonacciSayisi.add(0);
        if (adet==1) {
            return fibonacciSayisi;
        }
        fibonacciSayisi.add(1);

        for (int i = 2; i <=adet ; i++) {

            int onceki = fibonacciSayisi.get(i - 1);
            int dahaOnceki = fibonacciSayisi.get(i - 2);

            fibonacciSayisi.add(onceki + dahaOnceki);

        }

        return fibonacciSayisi;
    }
}
