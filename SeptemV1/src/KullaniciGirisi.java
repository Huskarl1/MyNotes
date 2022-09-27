import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String k_adi,parola;
	System.out.println("Kullanıcı adınızı giriniz!:");
	k_adi = scan.nextLine();
	System.out.println("Parolanızı giriniz!:");
	parola = scan.nextLine();
	if(k_adi.equals("huskarl") && parola.equals("alevliok")) {
		System.out.println("Başarılı bir giriş yaptınız!");
	}else { 
		System.out.println("Yanlış bir kullanıcı veya parola yazdınız!");
	}
	

	}

}
