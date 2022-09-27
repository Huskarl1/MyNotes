import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		int vz , fnl ,quiz;
		double  ortalama;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quiz notunuzu giriniz:");
		quiz =  input.nextInt();
		System.out.println("Vize notunuzu giriniz:");
		vz = input.nextInt();
		System.out.println("Final notunuzu giriniz:");
		fnl=input.nextInt();	
		
		ortalama = (quiz*0.15)+(vz*0.35) + (fnl*0.5);
		
		System.out.println("Ders notunuz:"+ortalama);
		
		String sonuc = (ortalama>=50) ?"Geçtiniz" : "Kaldınız";
		System.out.println("Sonuc:"+sonuc);
	}

}
