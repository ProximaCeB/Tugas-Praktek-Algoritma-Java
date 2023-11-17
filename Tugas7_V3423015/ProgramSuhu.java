import java.util.Scanner;

public class ProgramSuhu {
    public static void main( String[] args )
	{
		 try (Scanner data = new Scanner(System.in)) {
            double SuhuC, SuhuK, SuhuF, SuhuR;
            	char opsi;
            	System.out.print("Masukan suhu (C) : ");
            	SuhuC=data.nextDouble();
            	System.out.print("Masukan suhu konversi (K/F/R) : ");
            	opsi=data.next().charAt(0);
            	if(opsi == 'K'){
            		SuhuK = SuhuC + 273;
            		System.out.println("Suhu Kelvin = " + SuhuK);
            	}else if (opsi == 'F'){
            		SuhuF = (double) 9 / 5 * SuhuC + 32;
            		System.out.println("Suhu Fahrenheit = " + SuhuF);
            	}else if (opsi == 'R'){
            		SuhuR = (double) 4 / 5 * SuhuC;
            		System.out.println("Suhu Reamur = " + SuhuR);
            	}
        }
    }
}
