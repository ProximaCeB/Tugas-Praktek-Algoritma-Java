import java.util.Scanner;

public class ProgramNBilangan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int b, a, p = 1, t = 1;
            System.out.print("Masukan jumlah yang ingin dimasukan : ");
            b = data.nextInt();
            while (p <= b) {
                System.out.print("Masukan bilangan : ");
                a = data.nextInt();
                t = t * a;
                if (p == b) {
                    System.out.print(a);
                } else {
                    System.out.print(a + " * ");
                }
                p++;
            } 
            System.out.print(" = " + t);
        }
    }
}
