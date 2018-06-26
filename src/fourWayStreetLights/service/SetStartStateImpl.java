package fourWayStreetLights.service;

public class SetStartStateImpl implements StreetLightsStateI
{
	@Override
	public void insertNewCar(String filename) 
	{
		if(filename.contains(", North"))
		{
			StretLightsContext.NorthCars.add(filename.split(",")[0]);
			System.out.println("Adding North"+StretLightsContext.NorthCars.size());
			
		}
		if(filename.contains(", South"))
		{
			StretLightsContext.SouthCars.add(filename.split(",")[0]);
			System.out.println("Adding South");
		}
		if(filename.contains(", East"))
		{
			StretLightsContext.EastCars.add(filename.split(",")[0]);
			System.out.println("Adding East");
		}
		if(filename.contains(", West"))
		{
			StretLightsContext.WestCars.add(filename.split(",")[0]);
			System.out.println("Adding West");
		}
	}
	@Override
	public void carStopState(String filename) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCars(String filename) {
		// TODO Auto-generated method stub
		
	}
	
}
