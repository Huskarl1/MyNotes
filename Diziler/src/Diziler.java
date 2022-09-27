
public class Diziler {

	public static void main(String[] args) {
		//VeriTipi diziAdi[] = new VeriTipi[elemanSayisi];
		//VeriTipi[] diziAdi = new VeriTipi[elemanSayisi];
		//VeriTipi[] diziAdi ={v1,v2,v3};

		//multidimentionalArray
		int[] []  tablo = new int [] []  {
			{1,10,17,180},{2,12,19,178},{3,15,21,185},{4,17,24,182}	};
			
			//1. Kullanım******************
			
			for(int i=0;i< tablo.length;i++) {
				for(int j=0;j<tablo[0].length;j++) {
					System.out.print(tablo[i] [j]+" ");
				}
			
				
				
				
				System.out.println();
			
			
				
				}
			System.out.println("-------------------------------------------");
			
			//2. Kullanım************** (Foreach Kullanımı)
			
			for(int[] sutun : tablo){
				for(int value :sutun) {
					System.out.print(value +" ");
			}
			System.out.println();
			
			}
	
	}

}
