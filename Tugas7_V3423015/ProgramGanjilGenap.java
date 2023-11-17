import java.util.Scanner;

public class ProgramGanjilGenap {

    public static void main(String[]agrs){
        try (Scanner data = new Scanner(System.in)){
            int bil;
            System.out.print("Masukan bilangan : ");
            bil = data.nextInt();
            if(bil >= 0){
                if (bil % 2 == 0) {
                    System.out.println(" Bilangan genap");
                } else {
                    System.out.println("Bilangan ganjil");
                }
            } else {
                System.out.println("Nilai negatif");
                }    
        }   
    }
}