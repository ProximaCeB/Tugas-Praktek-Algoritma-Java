import java.util.Scanner;
public class ProgramMenentukanSegitiga{
	public static void main(String[] args){
		try(Scanner data = new Scanner(System.in)){
		//Deklarasi
			int s1, s2, s3;
			float py;
		//Input
			System.out.println("Program Menentukan Segitiga");
			System.out.println("===========================");
			System.out.print("Masukan sisi 1 : ");
			s1 = data.nextInt();
			System.out.print("Masukan sisi 2 : ");
			s2 = data.nextInt();
			System.out.print("Masukan sisi 3 : ");
			s3 = data.nextInt();
		//Program
			//Bukan Segitiga
			System.out.println("---------------------");
			if(s1 > s2 + s3 || s2 > s1 + s3 || s3 > s1 + s2){
				System.out.println("Bukan segitiga");
			} else {
			//Segitiga sama sisi
				if(s1 == s2 && s2 == s3){
					System.out.println("Segitiga sama sisi");
			//Segitiga sama kaki
				} else if(s1 == s2 || s1 == s3 || s2 == s3){
					System.out.println("Segitiga sama kaki");
			//Segitiga siku-siku
				} else if(s2 > s1 && s2 > s3){
					py = (float) Math.sqrt ((s1 * s1) + (s3 * s3));
						if(py == s2){
							System.out.println("Segitiga siku-siku");
					//Segitiga sembarang
						} else {
							System.out.println("Segitiga sembarang");
						}
			//Segitiga siku-siku
				} else if(s1 > s2 && s1 > s3){
				py = (float) Math.sqrt ((s3 * s3) + (s2 * s2));
						if(py == s1){
							System.out.println("Segitiga siku-siku");
					//Segitiga sembarang
						} else {
							System.out.println("Segitiga sembarang");
						}
			//Segitiga siku-siku
				} else if(s3 > s1 && s3 > s2){
					py = (float) Math.sqrt ((s1 * s1) + (s2 * s2));
						if(py == s3){
							System.out.println("Segitiga siku-siku");
					//Segitiga sembarang
						} else {
							System.out.println("Segitiga sembarang");
						}
			//Segitiga sembarang
				} else {
					System.out.println("Segitiga sembarang");
				}
				
			}
		}
	}
}