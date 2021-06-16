package Latihan1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class prob_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int x1, y1, x2, y2, x3, y3, x4, y4;
        double xp, yp;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();

            // cek 2 titik pertama
            if((x1 == y1) && (x2 == y2)) {
                // cek 2 titik terakhir
                if((y3 == 1 - x3) && (y4 == 1 - x4)){
                    xp = (x1 + x2);
                    yp = (y1 + y2);
                    xp = xp/2;
                    yp = yp/2;
                    System.out.println(df.format(xp)+" "+(df.format(yp)));
                    //System.out.println(xp/2 +" "+yp/2);
                } else if ((y3 == x3 + 1) && (y4== x4+1)){
                    System.out.println("SEJAJAR");
                } else {
                    System.out.println("GARIS SAMA");
                }
            }
    }
}
