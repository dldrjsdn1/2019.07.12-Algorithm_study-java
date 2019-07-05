
public class Car {
	private String name;
	private int speed;
	private String color;

	Car() {
		this.name = "Çö´ë";
		this.speed = 70;
		this.color = "red";
	}

	public Car(String name, int speed, String color) {
		this.name = name;
		this.speed = speed;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if(this.name!=other.name)
			return false;
		if(this.speed!=other.speed)
			return false;
		if(this.color!=other.color)
			return false;
		
		return true;
	}

}
