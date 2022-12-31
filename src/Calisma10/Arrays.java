package Calisma10;

public class Arrays {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {1, 5, 6, 4, 8, 9, 6};
       int [] yeniArr=arrArtirma(arr);

        }


    public static int[] arrArtirma(int[] arr) {
        int[] yeniArr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i] + 2;
            arr=yeniArr;
        }
        return yeniArr;
    }
}