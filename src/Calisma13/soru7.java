package Calisma13;

import java.util.Arrays;

public class soru7 {
    public static void main(String[] args) {
        String str="\"java cok harika.\"";
        String [] arr=str.split("");
        String [] tersStr=new String[1];
        tersStr[0]="";
        for (int i = 0; i <arr.length ; i++) {
            tersStr[0]+=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(tersStr));
    }
}
