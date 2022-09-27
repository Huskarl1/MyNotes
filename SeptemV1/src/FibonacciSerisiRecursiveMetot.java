
public class FibonacciSerisiRecursiveMetot {

	public static void main(String[] args) {
		
	System.out.println(fibo(8));
	//0,1,2,3,4,5,6,7,8,9
	//1,1,2,3,5,8,13,21,34
	
	}
	static int fibo(int n) {
		
		if(n==1 || n==2)
			return 1;
		
		return fibo(n-1)+fibo(n-2);
		
		
		
	}

}
