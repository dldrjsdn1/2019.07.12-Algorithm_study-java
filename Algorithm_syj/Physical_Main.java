
public class Physical_Main {

	public static void main(String[] args) {
		
		double sum = 0;
		
		
		//1.h�� �÷¿� �´� ������� ī��Ʈ �����ܾƿ�?
		
		Physical [] p = {
				new Physical("������", 162, 0.3),
				new Physical("������", 173, 0.7),
				new Physical("������", 175, 2.0),
				new Physical("ȫ����", 171, 1.5),
				new Physical("�̼���", 168, 0.4),
				new Physical("�迵��", 174, 1.2),
				new Physical("�ڿ��", 169, 0.8)}; 
				
		int [] h = new int[21];
		
		
		for (int i = 0; i < p.length; i++) 
			 sum += p[i].getHeight();
		
		
		System.out.printf("��� Ű: %.1f\n", sum/p.length);
		
		System.out.println("�÷º���");
		
		for (int i = 0; i < p.length; i++) {
		 h[(int) (p[i].getVisual()*10)]++;
		}
		
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i] + "��");
		}
		
		
	}

}
