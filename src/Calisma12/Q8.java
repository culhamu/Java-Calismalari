package Calisma12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
      Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
      tamsayilari bir liste olarak bize donduren bir method olusturun.
         */
        System.out.println(pozitifBolenler(6));
    }public static List<Integer> pozitifBolenler(int sayi){
        List<Integer> pozitifBolenlerList=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bölenlerini öğrenmek istediğiniz sayıyı giriniz ");
        sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                pozitifBolenlerList.add(i);
            }

        }
        return pozitifBolenlerList;
    }
}
