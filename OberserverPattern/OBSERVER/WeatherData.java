package OBSERVER;

import java.util.ArrayList;

public class WeatherData implements Subject
{
	private ArrayList<Observer> a1;
	private float temp;
	private float humidity;
	private float pressure;
	
	
	public WeatherData()
	{
		a1 = new ArrayList<>();
	}

	@Override
	public void RegisterObserver(Observer obs) 
	{
		a1.add(obs);
		
	}
    @Override
	public void RemoveObserver(Observer obs)
	{
		int i=a1.indexOf(obs);
		
		if(i>=0)
		{
			a1.remove(i);
		}
		
	}

	@Override
	public void NotifyObserver() 
	{
		for(int i=0;i<a1.size();i++)
		{
			Observer o1 = (Observer)a1.get(i);
			o1.update(temp, humidity, pressure);
		}
		
	}
    public void MeasurementsChanged()
	{
		NotifyObserver();
	}
	
	
	public void setMeasurements(float temp,float humidity,float pressure)
	{
		this.temp = temp;
		this.humidity=humidity;
		this.pressure=pressure;
		
		MeasurementsChanged();
	}
	
	
	
	public float getTemperature()
	{
		return temp;
	}public float getHumidity()
	{
		return humidity;
	}

	public float getPressure()
	{
		return pressure;
	}

}

