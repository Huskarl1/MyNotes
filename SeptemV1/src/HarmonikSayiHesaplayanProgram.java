import java.util.Scanner;

public class HarmonikSayiHesaplayanProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x;
		double harmonic=0.0;
		System.out.print("Bir sayi giriniz:");
		x = scan.nextDouble();
			while(x > 0) {
			harmonic+=(1/x);
			x--;
			
		}
		System.out.println(harmonic);
		
		
	}

}
