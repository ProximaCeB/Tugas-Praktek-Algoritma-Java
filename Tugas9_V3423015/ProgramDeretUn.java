import java.util.Scanner;

public class ProgramDeretUn {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int a, n, b, p = 0, Un, t = 0;
            System.out.print("Masukan nilai angka awal : ");
            a = data.nextInt();
            System.out.print("Masukan n bilangan : ");
            n = data.nextInt();
            System.out.print("Masukan beda pada deret : ");
            b = data.nextInt();
            while (p <= n) {
                Un = a + (p - 1) * b;
                t = t + Un;
                p++;
            }
            System.out.println("Jumlah deret tersebut adalah : " + t);
        }
    }
}
