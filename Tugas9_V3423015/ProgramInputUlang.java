import java.util.Scanner;
public class ProgramInputUlang{
	public static void main(String[]args){
		try (Scanner data = new Scanner(System.in)) {
			char p;
			do{
				System.out.print("Masukan karakter huruf : ");
				p = data.next().charAt(0);
			} while(p != 'x' && p != 'X');
		}
	}
}