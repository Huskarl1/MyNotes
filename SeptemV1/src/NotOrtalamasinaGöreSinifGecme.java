import java.util.Scanner;

public class NotOrtalamasinaGöreSinifGecme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int turkce1,turkce2,matematik1,matematik2,fen1,fen2,sosyal1,sosyal2,beden1,beden2;
		System.out.print("Türkçe 1. notunuzu giriniz:");
		turkce1 = scan.nextInt();
		System.out.print("Türkçe 2. notunuzu giriniz");
		turkce2= scan.nextInt();
		System.out.print("Matematik 1. sınav puanınızı giriniz:");
		matematik1 = scan.nextInt();
		System.out.print("Matematik 2. sınav puanınızı giriniz:");
		matematik2 = scan.nextInt();
		System.out.print("Fen bilgisi 1. sınav puanınızı giriniz:");
		fen1 = scan.nextInt();
		System.out.print("Fen bilgisi 2. sınav puanınızı giriniz:");
		fen2 = scan.nextInt();
		System.out.print("Sosyal bilgiler 1. sınav puanınızı giriniz:");
		sosyal1 = scan.nextInt();
		System.out.print("Sosyal bilgiler 2. sınav puanınızı giriniz:");
		sosyal2 = scan.nextInt();
		System.out.print("Beden eğitimi 1. sınav puanınızı giriniz:");
		beden1 = scan.nextInt();
		System.out.print("Beden eğitimi 2. sınav puanınızı giriniz:");
		beden2= scan.nextInt();
		
		System.out.println("Türkçe ortalamanız:"+((turkce1+turkce2)/2));
		System.out.println("Matematik ortalamanız:"+((matematik1+matematik2)/2));
		System.out.println("Fen Bilgisi ortalamanız:"+((fen1+fen2)/2));
		System.out.println("Sosyal Bilgiler ortalamanız:"+((sosyal1+sosyal2)/2));
		System.out.println("Beden Eğitimi ortalamanız:"+((beden1+beden2)/2));
		float ortalama = (((turkce1+turkce2)/2) + ((matematik1+matematik2)/2) + ((fen1+fen2)/2) + ((sosyal1+sosyal2)/2) + ((beden1+beden2)/2))/5;
		System.out.println("Genel not ortalamanız:"+ortalama);
		if(ortalama>=50) {
			System.out.println("Sınıfı geçtiniz! Başarılarınızın devamını dileriz!");
			
		}else {
			System.out.println("Sınıfta kaldınız! Daha çok çalışıp önümüzdeki yıl geçmeniz dileğiyle!");
		}
		
	}

}
