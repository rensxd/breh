package prog1_week6b_basis;

public class RaceCar {
	public int acceleration;
	public int speed;
	public int maxSpeed;
	public int location;
	public String name;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAcceleration(int acc){
		acceleration = acc;
	}
	
	public void setMaxSpeed(int max){
		maxSpeed = max;
	}
	
	public int getLocation(){
		return location;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void race(){
		speed = speed + acceleration;
		location = location + speed;
	}
	
	public void brake(){
		speed = 0;
	}
}
