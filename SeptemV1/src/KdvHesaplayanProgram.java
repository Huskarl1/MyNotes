import java.util.Scanner;

public class KdvHesaplayanProgram {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		float fiyat,kdv,kdvlifiyat;
		System.out.println("Ürün alış fiyatını giriniz:");
		fiyat = input.nextFloat();
		kdv = fiyat*(0.18f);
		System.out.println("Ürününüzün KDV tutarı:"+kdv);
		kdvlifiyat=fiyat+kdv;
		System.out.println("Ürününüzün KDV 'li fiyatı:"+kdvlifiyat);
		
		
		
	

	}

}
