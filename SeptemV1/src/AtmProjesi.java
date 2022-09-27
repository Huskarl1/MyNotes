import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		int bakiye=1907,miktar;
		Scanner scan = new Scanner(System.in);
		
		
		
		while(bakiye>0) {
			System.out.println("Güncel Bakiyeniz:"+bakiye+"$");
			System.out.println("1-Para Çekme");
			System.out.println("2-Para Yatırma");
			System.out.println("3-Bakiye Sorgulama");
			System.out.println("4-Çıkış");
			System.out.println("Yapmak istediğiniz işlemi seçiniz!");
			int input = scan.nextInt();
			if(input==1) {
				System.out.print("Çekmek istediğiniz miktarı giriniz:");
				miktar=scan.nextInt();
				bakiye-=miktar;
			}else if(input==2) {
				System.out.print("Yatırmak istediğiniz miktarı giriniz:");
				miktar=scan.nextInt();
				bakiye+=miktar;
				
			}else if(input==3) {
				System.out.println("Güncel Bakiyeniz:"+bakiye+"$");
			}else if(input==4) {
				System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz!");
				break;
			}else {
				System.out.println("Yanlış veya hatalı bir işlem seçtiniz. Lütfen tekrar deneyiniz!");
			}
			
			
			
			
		}
		System.out.print("Tekrar Bekleriz!");

	}

}
