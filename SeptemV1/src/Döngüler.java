
public class Döngüler {

	public static void main(String[] args) {
		int i= 1,k;
		System.out.println("Döngü basşladı");
		while(i<=5) {
			System.out.println(i);
			i++;
		
		}
		System.out.println("Döngü bitti");

		int t=13;
		do {
			System.out.println(t);
			t++;
		}while(t<=5); {
			System.out.println("Döngü bitti");
		}
		
		for(i=1;i<=10;i++) {
			System.out.println("i:"+i);
		}
		
		for (i=1;i<=10;i++) {
			for(k=1;k<=10;k++) {
				System.out.println("i="+i+","+"k="+k);
			}
		}
		
		
		
	}

}
