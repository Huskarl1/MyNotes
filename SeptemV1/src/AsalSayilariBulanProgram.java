import java.util.Scanner;

public class AsalSayilariBulanProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,input;
		boolean asal =true;
		
		
		do {
			System.out.print("Lütfen bir sayi giriniz:");
			input=scan.nextInt();
		} while (input<2); 
		
			for(i=2;i<input;i++) {
				if(input%i==0) {
					asal = false;
					break;
					
					
				}
				
				
			}
			if(asal) {
				System.out.println("girilen sayi "+input+" asaldır");
			}else {
				System.out.println("girilen sayi "+input+" asal değildir");
			}
			
		}
		
		
	
		

	}


