package ExtendsEx;

public class ex7_SnowTireExample {
	public static void main(String[] args) {
		ex7_SnowTire SnowTire = new ex7_SnowTire();
		
		ex7_Tire tire = SnowTire;
		ex7_SnowTire sotire = (ex7_SnowTire) tire;
		
		SnowTire.run();
		tire.run();
	}

}

//강제 형변환 시 new는 사용할 수 없다.
