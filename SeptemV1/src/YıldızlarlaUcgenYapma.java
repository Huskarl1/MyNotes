import java.util.Scanner;

public class YıldızlarlaUcgenYapma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int star,i=1;
		System.out.print("Sayı giriniz:");
		star=scan.nextInt();
		while(star>=i) {
			int k=1;
			while(k<=i) {
			System.out.print("*");
			k++;
			}
		System.out.println();
		i++;
			
		}
		
	}

}
