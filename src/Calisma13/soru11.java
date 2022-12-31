package Calisma13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class soru11 {

    public static void main(String[] args) {
        /*
        Soru 37-)
--BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
(Eliminate duplicates)
ENG:
Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
Write a test program that reads in ten integers, invokes the method, and displays the result.
(Tekrarlananları çıkar)
TÜR:
Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen tam sayı giriniz");
        Integer[] arr=new Integer[10];
        for (int i = 0; i < arr.length; i++) {
           Integer sayi= scan.nextInt();
            arr[i]=sayi;
        }
        System.out.println(Arrays.toString(kopyalariCikar(arr)));


    }public static Integer[] kopyalariCikar(Integer[] arr){

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }


        } Integer[] kopyalariCikar=list.toArray(new Integer[0]);



        return kopyalariCikar;
    }












}