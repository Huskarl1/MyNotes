import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km=1,yas,tip;
		double fiyat,yas_indirimi,tip_indirimi;
		
		System.out.print("Gidilecek yerin km değerini giriniz:");
		km = scan.nextInt();
		System.out.print("Lütfen yaşınızı giriniz:");
		yas = scan.nextInt();
		System.out.println("Lütfen yolculuk şeklinizi seçiniz");
		System.out.println("Tip1:gidiş\nTip2:gidiş-dönüş");
		tip = scan.nextInt();
		
		
		if(km>0 && yas>0 &&(tip==1 || tip==2)) {
			fiyat = km*0.10;
			if(yas<12) {
				yas_indirimi=fiyat*0.50;
			
			}else if(yas>=12 && yas<65) {
				yas_indirimi=fiyat*0.10;
				
			}else if(yas>=65) {
				yas_indirimi=fiyat*0.30;
				
			}else {
				yas_indirimi=0;
			}
			fiyat=fiyat-yas_indirimi;
			
			if(tip==2) {
				tip_indirimi=fiyat*0.20;
				fiyat=(fiyat-tip_indirimi)*2;
			}
			System.out.println("Bilet tutarınız:"+fiyat+"$");
		}else {
			System.out.println("Girilen değerler yanlıştır! Tekrar giriniz!");
		}
		
		
		
		
	/*	switch(tip) {
		
		case 1:
			if(yas>0 && yas<=12) {
				fiyat=fiyat-fiyat*0.15;
				
			}else if(yas>12 || yas<65) {
				
			}else {
				fiyat=fiyat-fiyat*0.30;
				
			}
		case 2:
			fiyat*=2;
			if(yas<=12) {
				
				fiyat=fiyat-fiyat*0.20;
				fiyat=fiyat-fiyat*0.15;
				
				
			}else if(yas>12 || yas<65) {
				fiyat=fiyat-fiyat*0.20;
				
			}else {
				fiyat=fiyat-fiyat*0.20;
				fiyat=fiyat-fiyat*0.30;
				
			
			}
			default:
				System.out.println("Lütfen doğru yolculuk tipinizi seçiniz!");
		}
		System.out.println("Bilet fiyatınız:"+fiyat);*/
		
		
		
	}

}
