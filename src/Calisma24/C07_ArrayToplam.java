package Calisma24;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_ArrayToplam {
    public static void main(String[] args) {
        /*
        You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
        The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

        A row i is weaker than a row j if one of the following is true:

        The number of soldiers in row i is less than the number of soldiers in row j.
        Both rows have the same number of soldiers and i < j.
        Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
         */

        int[][] arr={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int toplam=0;
        int[] arrList=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];

            }arrList[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(arrList));

    }
}
