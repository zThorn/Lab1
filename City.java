
public class City extends AtomicRegion 
{
	private String mayor= "Mervyn";

	public City(String s, int pop, double a, String m) {
		super(s, pop, a);
		if(m!=null)
			mayor=m;
	}
	
	public String getMayor()
	{
		return mayor;
	}
	
	public void changeMayor(String m)
	{
		this.mayor=m;
	}
}
