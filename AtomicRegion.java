//@Zach Thornton
//Lab1
public class AtomicRegion extends Region 
{
	
	private int population;
	private double area;
	
	public AtomicRegion(String s, int pop, double a)
	{
		super(s);
		population=pop;
		area=a;
	}

	@Override
	int getPopulation() {return population;	}
	@Override
	double getArea() { return area;}


}
