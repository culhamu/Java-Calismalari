package Calisma17;

import java.util.Arrays;

public class Soru01 {
    public static void main(String[] args) {
        /*
        Seyfullah Merdan
Soru-39)
Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
 verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
         */
        int[] input = {3,2,5,4,1,6};

        minMaxYazdir(input);

    }public static void minMaxYazdir(int[] arr){
        int min=0;
        int max=0;

        Arrays.sort(arr);
        min=arr[0];
        max=arr[arr.length-1];

        System.out.println("array in min değeri : "+min +" ve max değeri : " +max);

    }
}
