package Latihan1;

import java.util.Scanner;

public class prob_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x1, y1, x2, y2; //deklarasi variable

        //input bilangan
        x1 = scanner.nextLong();
        y1 = scanner.nextLong();
        x2 = scanner.nextLong();
        y2 = scanner.nextLong();

        long hasil = (x2 + y2) - (x1 + y1);
        System.out.println(hasil);
    }
}
