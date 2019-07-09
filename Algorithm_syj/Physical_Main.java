
public class Physical_Main {

	public static void main(String[] args) {
		
		double sum = 0;
		
		
		//1.h가 시력에 맞는 사람들을 카운트 해주잔아요?
		
		Physical [] p = {
				new Physical("박현규", 162, 0.3),
				new Physical("함진아", 173, 0.7),
				new Physical("최윤미", 175, 2.0),
				new Physical("홍연의", 171, 1.5),
				new Physical("이수진", 168, 0.4),
				new Physical("김영준", 174, 1.2),
				new Physical("박용규", 169, 0.8)}; 
				
		int [] h = new int[21];
		
		
		for (int i = 0; i < p.length; i++) 
			 sum += p[i].getHeight();
		
		
		System.out.printf("평균 키: %.1f\n", sum/p.length);
		
		System.out.println("시력분포");
		
		for (int i = 0; i < p.length; i++) {
		 h[(int) (p[i].getVisual()*10)]++;
		}
		
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i] + "명");
		}
		
		
	}

}
