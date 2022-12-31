package Calisma10;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun.
         */
        System.out.println(Arrays.toString(createArray(5)));

    }public static int[] createArray(int size) {
        int[] array = new int[size];

        // Kullanıcıdan array elemanlarını alın
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Lütfen array'in " + (i+1) + ". elemanını girin: ");
            array[i] = input.nextInt();
        }

        return array;
    }



}
