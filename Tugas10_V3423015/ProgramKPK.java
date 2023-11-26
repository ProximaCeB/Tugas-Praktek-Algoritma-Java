package Tugas10_V3423015;

import java.util.Scanner;

public class ProgramKPK {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int b1, b2, temp, p = 1, t = 0;
            System.out.print("Masukan bilangan 1 : ");
            b1 = data.nextInt();
            System.out.print("Masukan bilangan 2 : ");
            b2 = data.nextInt();
            if (b1 > b2) {
                temp = b1;
                b1 = b2;
                b2 = temp;
            }
            while (p != 0) {
                t = t + b2;
                p = t % b1;
            }
            System.out.println("KPK = " + t);
        }
    }
}
