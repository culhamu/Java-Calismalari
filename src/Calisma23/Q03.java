package Calisma23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q03 {
    public static void main(String[] args) {


        System.out.println(fibonacciNumbers(10));

    }public  static List<Integer> fibonacciNumbers(int n) {
        // Baslangic degerlerini ayarlayalim
        List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0, 1));

        // ilk iki Fibonacci sayisi zaten bilindigi icin,
        // sadece n-2 adet sayi bulmamiz gerekiyor
        for (int i = 0; i < n - 2; i++) {
            // Son iki sayiyi toplayarak
            // bir sonraki Fibonacci sayisini bulalim
            int nextNumber = fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2);
            fibonacciNumbers.add(nextNumber);
        }
        return fibonacciNumbers;
    }
}
