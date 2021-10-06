package qwertyu;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        while (i < n - 2){
            int fib_sum = a + b;
            a = b;
            b =fib_sum;
            i = i+1;
        }
        System.out.println(b);
    }
}