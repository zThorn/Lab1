
public class test {
	public static void main(String[] args)
	{
		State testState = new State("California","Arnold");
		City LA = new City("Los Angeles", 15000,1200,null);
		City Sacremento = new City("Sacremento",15000, 2400,null);
		testState.getRegion().add(LA);
		testState.getRegion().add(Sacremento);
		
		
		
		System.out.println("Initial State's population: "+testState.getPopulation());
		System.out.println("Initial State's area: "+testState.getArea());
		
		State testState2 = new State("Connecticut", "Martha");
		City newHaven = new City("New Haven", 30000, 1000,"George");
		City northHaven = new City("North Haven", 40000, 2000, "Steve");
		testState2.getRegion().add(newHaven);
		testState2.getRegion().add(northHaven);
		
		Country america = new Country("America");
		america.addRegion(testState);
		america.addRegion(testState2);
		
		System.out.println("Initial Country's population: "+america.getPopulation());
		System.out.println("Initial Country's Area: "+america.getArea());
	}

}
