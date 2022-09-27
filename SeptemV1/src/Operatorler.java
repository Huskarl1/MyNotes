
public class Operatorler {

	public static void main(String[] args) {
		int a = 50;
		int b = 25;
		int toplam = a+b;
		int cikarma = a-b;
		int carpma = a*b;
		int bolme=a/b;
		int mod = a%b;
		System.out.println("toplama: "+toplam);
		System.out.println("cikarma: "+cikarma);
		System.out.println("çarpma"+carpma);
		System.out.println("bölme"+bolme);
		System.out.println("bölümünden kalan:"+mod);
		toplam++;
		System.out.println(toplam);
		cikarma--;
		System.out.println(cikarma);
		int sonuc= --a + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(sonuc);
		int sonuc2=--a - --b;
		System.out.println(sonuc2);
		
		int sayi1 = 10;
		int sayi2 = 5;
		boolean kosul1 = (sayi1 == sayi2);
		boolean kosul2 = (sayi1 / sayi2)==2;
		boolean kosul3 = (sayi1 < sayi2);
		boolean kosul4 = (sayi1 > sayi2);
		boolean sonuc3 = kosul1 && kosul2;
		sonuc3 = kosul1 || kosul2;
		System.out.println("10 eşit mi 5'e :" +kosul1);
		System.out.println("10'nun 5'e bölümü 2'ye eşitmi :" +kosul2);
		System.out.println("sayi1(10) sayi2(5)den küçük mü:" +kosul3);
		System.out.println("sayi1(10) sayi2(5)den büyük mü" +kosul4);
		System.out.println("kosul1 ve kosul2 :" +sonuc3);
		System.out.println("kosul1 veya kosul2:" +sonuc3);
		
	
		String test1 = (kosul1) ? "Dogru" : "Yanlış";
		System.out.println(test1);
		
		sayi1 = sayi1 + 2; //sayi1 +=2; kullanımları aynı!!!!
		
		
		
	}

}
