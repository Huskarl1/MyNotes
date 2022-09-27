
public class Overloading {

	public static void main(String[] args) {
		
		System.out.println(add(5,4));
		System.out.println(add(2,3,4));
		System.out.println(add(2,5,8.5));
	}
	
	static int add(int x,int y) {
		System.out.print("1. Metot:");
		return  x + y;
		
	}
	static int add(int x,int y,int z) {
		System.out.print("2. Metot:");
		return  x + y + z;
	}
	static double add(int x,int y,double z) {
		System.out.print("3. Metot:");
		return  x + y + z;
	}
	
	
	

}
