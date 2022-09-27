
public class PolindromSayisi {

	public static void main(String[] args) {
		//123321 tersten okunduğunda kendisine eşit olan sayılara polindrom sayı denir.

		System.out.println(isPolindrom(121));
	}
	
	static boolean isPolindrom(int input) {
		int temp,terssayi=0,kalan;
		temp=input;
		while(temp!=0) {
				kalan=temp%10;
				terssayi=(temp*10)+kalan;
				temp=temp/10;
				
			}
		if(input==terssayi)
		return true;
		else
		return false;
	}
	
	
	
	
}
