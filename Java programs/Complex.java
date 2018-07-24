
public class Complex {
	private float real;
	private float imaginary;
	
	
	
	void set(float real,float imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	void disp()
	{
		System.out.println("Real part = "+real+" Imaginary part = "+imaginary);
	}
	
	Complex sum(Complex first,Complex second)
	{
		Complex temp=new Complex();
		temp.real=first.real+second.real;
		temp.imaginary=first.imaginary+second.imaginary;
		return temp;
		
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
	
}
