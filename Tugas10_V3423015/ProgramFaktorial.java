package Tugas10_V3423015;

import java.util.Scanner;

public class ProgramFaktorial {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int F, l = 1, t = 1;
            System.out.print("Masukan nilai faktorial : ");
            F = data.nextInt();
            while (F >= l) {
                if (F > l) {
                    System.out.print(F + " x ");
                } else {
                    System.out.print(F + " = ");
                }
                t = t * F;
                F--;
            }
            System.out.println(t);
        }
    }
}
