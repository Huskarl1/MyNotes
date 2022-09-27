
public class ReturnMetot {

	public static void main(String[] args) {
		power(2,4);
		int r2 =power(2,5);
		System.out.println(r2);

	}
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result*=a;
			
		}
		System.out.println(result);
		return result;
		
	}

}
