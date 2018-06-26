package fourWayStreetLights.service;

public interface StreetLightsStateI 
{

	void carStopState(String filename);

	void insertNewCar(String filename);

	void removeCars(String filename);
}
