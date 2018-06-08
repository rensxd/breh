
public class RaceCar {

	int acc;
	int speed;
	int maxSpeed;
	int location;
	String name;
	
	
	public int getAcceleration() {
		return acc;
	}
	public void setAcceleration(int acc) {
		this.acc = acc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void race() {
	
		
		if (this.speed < this.maxSpeed) {
			this.speed = this.speed + this.acc;
		}
		
		this.location = this.location + this.speed;
	}
	
	void brake() {
		speed = 0;
	}
	
}
