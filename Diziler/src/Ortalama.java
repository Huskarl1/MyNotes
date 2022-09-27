import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		int [] notlar=new int[7];
		double toplam=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen notlarınızı giriniz!");
		System.out.print("Türkçe:");
		notlar[0]=scan.nextInt();
		System.out.print("Matematik:");
		notlar[1]=scan.nextInt();
		System.out.print("Fizik:");
		notlar[2]=scan.nextInt();
		System.out.print("Kimya:");
		notlar[3]=scan.nextInt();
		System.out.print("Biyoloji:");
		notlar[4]=scan.nextInt();
		System.out.print("Tarih:");
		notlar[5]=scan.nextInt();
		System.out.print("Coğrafya:");
		notlar[6]=scan.nextInt();
		
		for(int not : notlar) {
			toplam+=not;
		}
		System.out.println("Ortalamanız:"+toplam/notlar.length);
	}

}
