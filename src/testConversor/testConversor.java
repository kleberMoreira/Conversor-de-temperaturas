package testConversor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Conversor.Conversor;

public class testConversor {
	
	Conversor converter;
	
	@Before
	public void setUp() throws Exception
	{
	 converter = new Conversor();
	}
	
	//Testando para numeros pequenos, grandes, zero, negativos
	
	@Test
	public void celsiusParaFahrenheit()
	{
		assertEquals(35.6, converter.celsiusParaFahrenheit(2), 0.01);
		assertEquals(212, converter.celsiusParaFahrenheit(100), 0.01);
		assertEquals(32, converter.celsiusParaFahrenheit(0), 0.01);
		assertEquals(-4, converter.celsiusParaFahrenheit(-20), 0.01);
	}
	
	@Test
	public void fahrenheitParaCelsius()
	{
		assertEquals(0, converter.fahrenheitParaCelsius(32), 0.01);
		assertEquals(100, converter.fahrenheitParaCelsius(212), 0.01);
		assertEquals(-17.77, converter.fahrenheitParaCelsius(0), 0.01);
		assertEquals(-23.33, converter.fahrenheitParaCelsius(-10), 0.01);
	}

	@Test
	public void kelvinParaCelsius()
	{
		assertEquals(-246, converter.kelvinParaCelsius(27), 0.01);
		assertEquals(603, converter.kelvinParaCelsius(876), 0.01);
		assertEquals(-273, converter.kelvinParaCelsius(0), 0.01);
		assertEquals(-278, converter.kelvinParaCelsius(-5), 0.01);
	}
	
	@Test
	public void celsiusParaKelvin()
	{
		assertEquals(307, converter.celsiusParaKelvin(34), 0.01);
		assertEquals(616, converter.celsiusParaKelvin(343), 0.01);
		assertEquals(273, converter.celsiusParaKelvin(0), 0.01);
		assertEquals(0, converter.celsiusParaKelvin(-273), 0.01);
	}
	@Test
	public void kelvinParaFahrenheit()
	{
		assertEquals(-317.2, converter.kelvinParaFahrenheit(79), 0.01);
		assertEquals(1142.6, converter.kelvinParaFahrenheit(890), 0.01);
		assertEquals(-459.4, converter.kelvinParaFahrenheit(0), 0.01);
		assertEquals(-585.4, converter.kelvinParaFahrenheit(-70), 0.01);
	}
	
	@Test
	public void fahrenheitParaKelvin()
	{
		assertEquals(257.44, converter.fahrenheitParaKelvin(4), 0.01);
		assertEquals(433, converter.fahrenheitParaKelvin(320), 0.01);
		assertEquals(255.22, converter.fahrenheitParaKelvin(0), 0.01);
		assertEquals(237.44, converter.fahrenheitParaKelvin(-32), 0.01);
	}

}
