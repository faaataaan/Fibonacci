package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("jumlah deret Fibonacci yang diinginkan: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = cari(i);
            System.out.print(x + " ");
        }

    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
}
