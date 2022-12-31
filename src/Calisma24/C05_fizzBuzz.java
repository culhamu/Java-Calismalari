package Calisma24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_fizzBuzz {
    public static void main(String[] args) {
        /*
        Given an integer n, return a string array answer (1-indexed) where:

        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i (as a string) if none of the above conditions are true.
         */

        System.out.println(fizzBuzz(15));

    }public static List<String> fizzBuzz(int n){
        String[] arrList = new String[n];
        List<String> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (i%3==0&&i%5==0){
               arrList[i-1]="FizzBuzz";
            } else if (i%5==0) {
                arrList[i-1]="Buzz";

            } else if (i%3==0) {
                arrList[i-1]="Fizz";

            }else arrList[i-1]=Integer.toString(i);

        }list=Arrays.asList(arrList);
          return list;

    }
}
