package Calisma13;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen arrayin uzunluğunu giriniz");
        int arr= scan.nextInt();
        System.out.println("Lütfen arrayin elemanlarını sayı olarak giriniz");
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr ; i++) {
         int   arr2=scan.nextInt();
            list.add(arr2);

        }
        System.out.println(list);
    }
}
