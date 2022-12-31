package Calisma24;

public class C02_RomanRakami {
    public static void main(String[] args) {
        /*
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Roman numerals are usually written largest to smallest from left to right. However,
        the numeral for four is not IIII.
         Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
          The same principle applies to the number nine, which is written as IX.
          There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer.
        For example, 2 is written as II in Roman numeral, just two ones added together.
         12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
         */
        int I = 1, IV = 4, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        System.out.println(convertToInt("MCMIV"));


    }

    public static int convertToInt(String romanNumber) {
        int result = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            char ch = romanNumber.charAt(i);
            int value = getIntValue(ch);

            if (i + 1 < romanNumber.length()) {
                char nextCh = romanNumber.charAt(i + 1);
                int nextValue = getIntValue(nextCh);

                if (value < nextValue) {
                    result -= value;
                } else {
                    result += value;
                }
            } else {
                result += value;
            }
        }
        return result;


    }

    public static int getIntValue(char ch) {
        // burada verilen roman rakamı karakterine karşılık gelen tamsayı değerini döndüreceğiz

        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


}




