import java.util.Scanner;

public class DaireninAlaniVeCevresi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int  r;
		double cevre,alan,pi=3.14;
		System.out.print("Dairenin yarı çapını giriniz:");
		r = input.nextInt();
		cevre=2*pi*r;
		alan=2*pi*(r*r);
		System.out.println("Çevre:"+cevre);
		System.out.println("Alan:"+alan);
		
		
		
		
		

	}

}
