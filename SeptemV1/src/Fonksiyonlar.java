import java.util.DoubleSummaryStatistics;

public class Fonksiyonlar {

	public static void main(String[] args) {
		
		f(5);
		power(3,5);
		power(2,3);
		power(3,2);
		
	}
	static void f(int x) {
		int result = (x+2)*6;
		System.out.println("Cevap:"+result);
		
		
	}
	static void power(int number1,int number2) {
		int result=1;
		for(int i=1;i<=number2;i++) {
			result*=number1;
			
		}
		System.out.println("Cevap:"+result);
		
	}
	
	
	
	
}
