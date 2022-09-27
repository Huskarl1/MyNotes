
public class Siniflar {

	public static void main(String[] args) {
		//SinifAdi ObjeAdi = new SinifAdi();
		 HesapMakinesi  makine1;
		 makine1 = new HesapMakinesi(35,5); //constructor(yapıcı)
		 makine1.toplam();
		 makine1.cikarma();
		 makine1.carpma();
		 makine1.bolme();
		
		System.out.println(makine1.toplam());
		System.out.println(makine1.cikarma());
		System.out.println(makine1.carpma());
		System.out.println(makine1.bolme());
	
	
	}

}
