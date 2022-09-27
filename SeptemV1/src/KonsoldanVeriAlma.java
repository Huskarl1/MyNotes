import java.util.Scanner;

public class KonsoldanVeriAlma {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a ,b;
		double c;
		System.out.println("a sayisini giriniz: ");
		a = input.nextInt();
		System.out.println("b sayisini giriniz: ");
		b = input.nextInt();
		System.out.println("double türünde değer giriniz");
		c = input.nextDouble();
		System.out.println("A sayısı:"+a);
		System.out.println("B sayısı:"+b);
		System.out.println("C sayisi:"+c);
		
		/*String str;
		str = input.nextLine();	
		System.out.println(str);*/
		
	}

}
