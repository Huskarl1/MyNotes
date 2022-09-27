
public class RecursiveMetot {

	public static void main(String[] args) {
		
		System.out.println(f(10));
		//F(1)=1
		//F(10)=10+f(9)
		//F(10)=10+9+f(8)
		//F(10)=10+9+8+f(7)
		//F(10)=10+9+8+7+f(6)
		//....
		//F(10)=10+9+8+7+6+5+4+3+2+f(1)
		//
		
		
		
	}
	static int f(int x) {
		if(x==1) {
			return 1;
		}
		return x+f(x-1);
		
	}


}
