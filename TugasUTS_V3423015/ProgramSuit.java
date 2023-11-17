import java.util.Random;
import java.util.Scanner;
public class ProgramSuit {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            Random pil = new Random();
        //Deklarasi
            int l = 3;
            int pk;
            String Pa;
            String Pk = " ";
        //Input
            System.out.println("         Program Suit");
            System.out.println("===============================");
            System.out.println("Gajah/Manusia/Semut");
            System.out.print("Masukan pilihan anda : ");
            Pa = data.nextLine();
        //Program
            System.out.println("-------------------------------");
        //Validasi inputan
            if (Pa.equals("Gajah")  || Pa.equals("Manusia") || Pa.equals("Semut")) {
            //Pengacak pilihan komputer
                pk = pil.nextInt(l);
                if (pk == 0) {
                    Pk = "Gajah";
                } else if (pk == 1) {
                    Pk = "Manusia";
                } else {
                    Pk = "Semut";
                }
            //Menampilkan pilihan lawan
                System.out.println("Lawan anda memilih " + Pk);
            //Penentuan menang kalah
                if (Pa.equals(Pk)) {
                    System.out.println("Seri");
                } else if (Pa.equals("Gajah") && Pk.equals("Manusia") || Pa.equals("Manusia")  && Pk.equals("Semut") || Pa.equals("Semut") && Pk.equals("Gajah")) {
                    System.out.println("Anda menang");
                } else {
                    System.out.println("Anda kalah");
                } 
            } else {
                System.out.println("Tidak valid");
                }
        }
    }
}
