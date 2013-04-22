import java.util.ArrayList;


public class ContainerRegion extends Region
{
	public ContainerRegion(String s) {
		super(s);
	}

	private ArrayList<Region> regions = new ArrayList<Region>();

	@Override
	public int getPopulation() {
		int tempPop=0;
		for(int i=0; i<regions.size();i++)
		{
			tempPop+=regions.get(i).getPopulation();
		}
		return tempPop;

	}

	@Override
	public double getArea() {
		int tempArea=0;
		for(int i=0; i<regions.size();i++)
		{
			tempArea+=regions.get(i).getArea();
		}
		return tempArea;
	}
	
	public void addRegion(Region r)
	{
		regions.add(r);
	}

	public ArrayList<Region> getRegion()
	{
		return regions;
	}
}
