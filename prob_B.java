package Latihan1;

import java.util.Scanner;

public class prob_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c, jml=0;

        a = scanner.nextLong();
        b = scanner.nextLong();
        for (long i = a; i <= b; i++) {
            jml = jml + i;
        }
        long pangkat = (long)Math.pow(10, 9);
        c = jml % (pangkat+7);
        System.out.println(c);
    }
}
