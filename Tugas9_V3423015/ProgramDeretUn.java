import java.util.Scanner;

public class ProgramDeretUn {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int a, n, b, p = 1, Un, t = 0;
            System.out.println("=== Program Menentukan Jumlah Deret Aritmatika dengan Rumus Un ===" + "\n");
            System.out.print("Masukan nilai angka pertama : ");
            a = data.nextInt();
            System.out.print("Masukan banyaknya bilangan : ");
            n = data.nextInt();
            System.out.print("Masukan beda pada deret : ");
            b = data.nextInt();
            if (n > 0 && b > 0) {
                if (a < 0) {
                    n++;
                }
                while (p <= n) {
                    Un = a + (p - 1) * b;
                    t = t + Un;
                    p++;
                    }
            System.out.println("Jumlah deret tersebut adalah : " + t);
            } else {
                System.out.println("Tidak Valid");
            }
        }
    }
}
