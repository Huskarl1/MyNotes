import java.util.Scanner;

public class WhileKullanimi {

	public static void main(String[] args) {
		//Örnek1:Girilen değere kadar çift sayilari ekrana yazan program!!
		int i=1,g;
		Scanner scan = new Scanner(System.in);
		System.out.print("sayi giriniz:");
		g=scan.nextInt();
		
		while(i<g) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		//Örnek2:Negatif bir değer girilene kadar girilen değerleri kabul eden ve negatif değer girilince tek ve çift sayıları toplayan program
		
		int toplam1=0,toplam2=0;
		while(true)
			{System.out.print("sayi giriniz:");
		int sayi=scan.nextInt();
			if(sayi<0) {
			System.out.println("Negatif sayi");
			break;
		}
			if(sayi%2==1) {
				toplam1+=sayi;
				System.out.println("Tek sayilar toplamı:"+toplam1);
			}
			if(sayi%2==0){
				toplam2+=sayi;
				System.out.println("Çift sayılar toplamı:"+toplam2);
			}
			}
		
		//Örnek3: Girilen sayiya kadar 2 nin kuvvetleri
		System.out.println("Sayi giriniz:");
		int sayi2=scan.nextInt();
		int k=1;
		while(k<=sayi2) {
			System.out.println(k);
			k=k*2;
			
		}
		
		
	}

}
