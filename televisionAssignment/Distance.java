package televisionAssignment;

public class Distance {

	int feet;
	float inches;

	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	public int getFeet() {
		return feet;
	}

	public float getInches() {
		return inches;
	}

	public void disp() {
		System.out.println(feet + " feet " + inches +" inches");
	}

	Distance sum(Distance distance1, Distance distance2) {
		Distance distanceTemp = new Distance();

		distanceTemp.feet = distance1.feet + distance2.feet;
		distanceTemp.inches = distance1.inches + distance2.inches;
		
		if(distanceTemp.inches>12){
			distanceTemp.feet++;
			distanceTemp.inches -= 12;
		}
		return distanceTemp;
	}

}
