import java.util.Scanner;

public class UssuSayiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int x,y,t=1;
		System.out.print("İki sayi Giriniz");
		x=scan.nextInt();
		y=scan.nextInt();
		while(y>0) {
			
			t*=x;
			y--;
			
		}
		
		System.out.println(t);
		
		

	}

}
