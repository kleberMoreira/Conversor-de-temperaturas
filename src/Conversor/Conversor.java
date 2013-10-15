package Conversor;

public class Conversor {
	
	public double celsiusParaFahrenheit(double valor)
	{
		return 9*valor/5 + 32.0;
	}

	public double fahrenheitParaCelsius(double valor)
	{
		return 5 * (valor - 32)/ 9; 
	}

	public double kelvinParaCelsius(double valor)
	{
		return valor - 273.0;
	}
	
	public double celsiusParaKelvin(double valor)
	{
		return valor + 273.0;
	}
	
	public double kelvinParaFahrenheit(double valor)
	{
		return (9.0*((valor-273.0)/5.0))+32.0;
	}
	
	public double fahrenheitParaKelvin(double valor)
	{
		return (5.0*((valor-32.0)/9.0))+273.0;
	}
}

