import java.util.Scanner;

public class BüyüktenKücügeSiralama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int a,b,c;
		System.out.print("A Sayısını giriniz:");
		a = scan.nextInt();
		System.out.print("B Sayısını giriniz");
		b = scan.nextInt();
		System.out.print("C Sayısını giriniz:");
		c = scan.nextInt();
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("A>B>c");
			}else {
				System.out.println("A>C>B");
			}	
		}else if(b>a && b>c) {
			if(a>c) {
				System.out.println("B>A>C");
			}else {
				System.out.println("B>C>A");
			}
		}else{
			if(a>b) {
				System.out.println("C>A>B");
			}else {
				System.out.println("C>B>A");
			}
		}
		
		
	}

}
