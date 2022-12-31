package Calisma11;

import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int yeniArr=arr[0].length;



        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<yeniArr){
                yeniArr=arr[i].length;

            }

        }int[] toplamlarArrayi=new int[yeniArr];
        int toplam=0;
        for (int i = 0; i < toplamlarArrayi.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam+=arr[j][i];

            }toplamlarArrayi[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}
