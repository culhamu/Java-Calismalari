package Calisma12;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        method olusturun.
         */
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        System.out.println(Arrays.toString(arrCarpim(arr)));

    }public static int[] arrCarpim(int[][] arr){
        int[] carrimArr=new int[arr.length];
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpim*=arr[i][j];

            }carrimArr[i]=carpim;
            carpim=1;

        }

        return carrimArr;
    }
}
