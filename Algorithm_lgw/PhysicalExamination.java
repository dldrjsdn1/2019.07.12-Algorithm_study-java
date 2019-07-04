import java.util.Arrays;

public class PhysicalExamination {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;

		Physical[] py = { new Physical("박현규", 162, 0.3), new Physical("함진아", 173, 0.7), new Physical("박현규", 175, 2.0) };
		int[] visionCnt = new int[21];
		Arrays.fill(visionCnt, 0);
		

		for (int i = 0; i < py.length; i++) {
			sum += py[i].getTall();
		}
		avg = sum / py.length;

		for (int i = 0; i < py.length; i++) {
			System.out.println(py[i]);
		}

		System.out.println("평균 키 : " + avg + "cm");
		System.out.println("시력 분포");

		for (int i = 0; i < py.length; i++) {
				visionCnt[(int)(py[i].getVision()*10)]++;
		}

		for (int i = 0; i < visionCnt.length; i++) {
			System.out.println(((int)(i*10))/100.0 + "~ :" + visionCnt[i] + "명");
		}

	}

}
