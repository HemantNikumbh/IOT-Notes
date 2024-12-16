package OBSERVER;

public class ObserverMainDemo 
{
	public static void main(String args[])
			{
				WeatherData wd = new WeatherData();
				wd.setMeasurements(80, 65, 30.4f);
				System.out.println(wd.getTemperature());
				System.out.println(wd.getHumidity());
				System.out.println(wd.getPressure());
			}

}