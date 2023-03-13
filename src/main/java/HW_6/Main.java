package HW_6;

public class Main {
    public static void main(String[] args) {
        int a = 24;
        int b = 10;

        int resultSum = a + b;
        System.out.println("Результат сложение: " + resultSum);
        int resultSub = a - b;
        System.out.println("Результат вычитание: " + resultSub);
        int resultMul = a * b;
        System.out.println("Результат умножение: " + resultMul);
        int resultDiv = a / b;
        System.out.println("Результат деление: " + resultDiv);


        boolean equal = a == b;
        System.out.println(equal);
        boolean equalN = a != b;
        System.out.println(equalN);
        boolean more = a > b;
        System.out.println(more);
        boolean less = a < b;
        System.out.println(less);


        boolean result = equal && equalN;
        boolean result1 = equalN || more;

        int max = Integer.MAX_VALUE;
        int overflow = max + 2;
        System.out.println(overflow);


        double dbl = 10.123;
        int i = 12;

        System.out.println(dbl + i);
        System.out.println(dbl - i);
        System.out.println(dbl * i);
        System.out.println(dbl / i);


    }
}
