package televisionAssignment;

public class Complex {
	
	float real,imaginery;

	public float getReal() {
		return real;
	}

	public void set(float real, float imaginery) {
		this.real = real;
		this.imaginery = imaginery;
	}
	
	public void disp(){
		System.out.println( real +" + i" + imaginery );
	}
	

	public float getImaginery() {
		return imaginery;
	}
	
	Complex sum(Complex complex1, Complex complex2){
		Complex complexTemp = new Complex();
		
		complexTemp.real = complex1.real + complex2.real;
		complexTemp.imaginery = complex1.imaginery + complex2.imaginery;
		
		
		return complexTemp;
	}

	
	}

