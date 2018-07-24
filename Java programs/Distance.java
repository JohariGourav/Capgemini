
public class Distance {
	int feet;
	float inches;
	
	void set(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	
	void disp()
	{
		System.out.println("Distance is "+feet+ " feet "+inches+" inche");
	}
	
	Distance add(Distance distance1,Distance distance2)
	{
		Distance temp=new Distance();
		temp.feet=distance1.feet+distance2.feet;
		temp.inches=distance1.inches+distance2.inches;
		if(distance1.inches+distance2.inches>12)
		{
			temp.feet+=1;
			temp.inches-=12;
			
		}
		return temp;
	}

}
