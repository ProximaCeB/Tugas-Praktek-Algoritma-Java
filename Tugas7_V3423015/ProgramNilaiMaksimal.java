import java.util.Scanner;
public class ProgramNilaiMaksimal {
	public static void main( String[] args )
	{
		try (Scanner data = new Scanner(System.in)) {
			int bil1,bil2,bil3;
			System.out.print("Masukan bilangan 1 : ");
			bil1=data.nextInt();
			System.out.print("Masukan bilangan 2 : ");
			bil2=data.nextInt();
			System.out.print("Masukan bilangan 3 : ");
			bil3=data.nextInt();
			if(bil1 > bil2 && bil1 > bil3){
				System.out.println("nilai maksimal : bilangan 1 (" + bil1 + ")");
			} else if(bil2 > bil1 && bil2 > bil3){
				System.out.println("nilai maksimal : bilangan 2 (" + bil2 + ")");
			}else{
				System.out.println("nilai maksimal : bilangan 3 (" + bil3 + ")");
			}
		}
	}
}