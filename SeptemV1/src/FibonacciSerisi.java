import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int toplam=1,input,sayi1=0,sayi2=1;
		System.out.print("Sayı giriniz:");
		input=scan.nextInt();
		
		for(int i = 1;i<=input;i++) {
			System.out.print(toplam+"-");
			toplam=sayi1+sayi2;
			sayi1=sayi2;
			sayi2=toplam;
			
			
		}

	}

}
