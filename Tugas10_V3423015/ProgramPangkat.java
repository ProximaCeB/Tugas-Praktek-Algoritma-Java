package Tugas10_V3423015;

import java.util.Scanner;

public class ProgramPangkat {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int B, P, l = 1, t = 1;
            System.out.print("Masukan bilangan : ");
            B = data.nextInt();
            System.out.print("Masukan pangkat : ");
            P = data.nextInt();
            while (P >= l) {
                if (P > 1) {
                    System.out.print(B + " x ");
                } else {
                    System.out.print(B + " = ");
                }
                t = t * B;
                P--;
            }
            System.out.println(t);
        }
    }
}
