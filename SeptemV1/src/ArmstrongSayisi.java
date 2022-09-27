

public class ArmstrongSayisi {

	public static void main(String[] args) {
		
				
		int temp,birler,onlar,yuzler,toplam=0;
		//153/10=15 153%10=3 15/10=1 15%10=5
		
		for(int i=100;i<=999;i++) {
			temp=i;
			birler=temp%10;
			temp/=10;
			
			onlar=temp%10;
			temp/=10;
			yuzler=temp%10;
			temp/=10;
			toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);
			if(toplam==i) {
				System.out.println(i);
			}
					/*
			  k=input%10;
			input=input/10;
			t=k*k*k;
			toplam+=t;
			*/
		}
		

		
		
	}

}
