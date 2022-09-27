import java.util.Scanner;

public class FaktoriyelHesaplamaProgrami {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int f,t=1;
		System.out.print("Bir sayi giriniz:");
		f=scan.nextInt();
		while(f>0) {
			 t*=f;//t=t*f;
			f--;
			
		}
		System.out.println(t);
		
		
	}

}
