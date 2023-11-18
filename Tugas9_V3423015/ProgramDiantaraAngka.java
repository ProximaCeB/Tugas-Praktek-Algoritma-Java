import java.util.Scanner;
public class ProgramDiantaraAngka{
	public static void main(String[]args){
		try (Scanner data = new Scanner(System.in)) {
			int a, b, temp;
			System.out.println("=== Program Mencari Bilangan Diantara Dua Bilangan ===" + "\n");
			System.out.print("Masukan angka pertama : ");
			a = data.nextInt();
			System.out.print("Masukan angka kedua : ");
			b = data.nextInt();
			if(a > b){
				temp = a;
				a = b;
				b = temp;
			} for(;a <= b; a++){
				System.out.print(a);
				if (a < b) {
					System.out.print(", ");
				}
			}
		}
	}
}
