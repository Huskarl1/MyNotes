import java.util.Scanner;

public class Ebob {

	public static void main(String[] args) {
		int s1,s2,obeb=1,ekok;
		Scanner scan = new Scanner(System.in);
		System.out.print("1. Sayıyı giriniz:");
		s1=scan.nextInt();
		System.out.print("2. Sayıyı giriniz:");
		s2=scan.nextInt();
		int min=(s1>s2) ? s1 : s2;
		 
		for(int i=min;i>0;i--) {
			if((s1%i==0) && (s2%i==0)) {
				obeb=i;
				System.out.println(obeb);
				break;
			}
			}
		ekok=(s1*s2)/obeb;
		System.out.println(ekok);
			
		}
		

	}


