
public class CarInfo {
	private String carName;
	private String carColor;
	private int carMaxSpeed;
	
	CarInfo(){
		 this.carName = "건우의 차";
		 this.carColor = "green";
		 this.carMaxSpeed = 180;
	}
	
	public CarInfo(String carName, String carColor, int carMaxSpeed){
		 this.carName = carName;
		 this.carColor = carColor;
		 this.carMaxSpeed = carMaxSpeed;
	}
	
	public String getCarName() {
		return carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public int getCarMaxSpeed() {
		return carMaxSpeed;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setCarMaxSpeed(int carMaxSpeed) {
		this.carMaxSpeed = carMaxSpeed;
	}


	@Override
	public boolean equals(Object obj) {
		
		if (getClass() != obj.getClass())
			return false;
		CarInfo other = (CarInfo) obj;
		if (!carColor.equals(other.carColor))
			return false;
		if (carMaxSpeed != other.carMaxSpeed)
			return false;
		if (!carName.equals(other.carName))
			return false;
		return true;
	}

}
