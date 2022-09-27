import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.print("Sayi giriniz:");
		sayi1 = scan.nextInt();
		System.out.print("sayi giriniz:");
		sayi2 = scan.nextInt();
		
		System.out.println("Bir işlem seçiniz!\n1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme");
		secim = scan.nextInt();
		
		if(secim==1) {
			System.out.println("Toplam:"+ (sayi1+sayi2));
			
		}else if(secim==2) {
			System.out.println("Çıkarma:" + (sayi1 - sayi2));
		}
		else if(secim==3) {
			System.out.println("Çarpma:" + (sayi1*sayi2));
		}
		else if(secim==4) {
			System.out.println("Bölme:"+ (sayi1/sayi2));
		}else {
			System.out.println("Gçersiz bir işlem seçtiniz");
		}
		
		
	}

}
