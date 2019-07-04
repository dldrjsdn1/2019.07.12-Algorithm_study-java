
public class Physical {
	private String name;
	private int tall;
	private double vision;
	
	Physical(){
		this.name = "이름";
		this.tall = 0;
		this.vision = 0.0;
	}
	
	Physical(String name, int tall, double vision){
		this.name = name;
		this.tall = tall;
		this.vision = vision;
	}
	
	public String getName() {
		return name;
	}
	public int getTall() {
		return tall;
	}
	public double getVision() {
		return vision;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public void setVision(double vision) {
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "Physical [name=" + name + ", tall=" + tall + ", vision=" + vision + "]";
	}
	
	
	
}
