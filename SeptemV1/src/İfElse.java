import java.util.Scanner;

public class İfElse {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("a sayısını giriniz:");
		a = input.nextInt();
		System.out.println("b sayısını giriniz:");
		b = input.nextInt();
		System.out.println("c sayısını giriniz:");
		c = input.nextInt();
		
		if((a<b)&&(a<c)) {
			System.out.println("a en küçük sayıdır!");
		}else if((b < a) && (b < c)) {
			System.out.println("b en küçük sayıdır!");
		}
		else
		{System.out.println("c en küçük sayıdır!");}
			
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
