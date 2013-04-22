
public abstract class Region 
{
	private String name = "";
	public Region(String s) {
		name=s;
	}
	abstract int getPopulation();
	abstract double getArea();
}
