import java.util.Scanner;

public class ProgramDeretBilangan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int a = 1;
            int b;
            double Sn;
            System.out.print("Masukan angka : ");
            b = data.nextInt();
            if (b >= a) {
                Sn = (double)b / 2 * (2 * a + (b - 1) * 1);
                while (a <= b) {
                    System.out.print(a);
                    if (a < b) {
                        System.out.print(" + ");
                    }
                    a++;
                } System.out.print(" = " + (int)Sn);
            } else {
                System.out.println("Tidak valid");
            }
        }
    }
}
