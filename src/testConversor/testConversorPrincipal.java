package testConversor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Conversor.Conversor;

public class testConversorPrincipal {
	
	Conversor meuConversor;
	
	@Before
	public void setUp() throws Exception
	{
		meuConversor = new Conversor();
	}
	
	@Test
	public void testCelsiusParaFahrenheit()
	{	//Testando valores
		assertEquals(1832.0, meuConversor.celsiusParaFahrenheit(1000.0), 0.01);
		assertEquals(32.018, meuConversor.celsiusParaFahrenheit(0.01), 0.01);
		assertEquals(-8.140, meuConversor.celsiusParaFahrenheit(-22.3), 0.01);
	}
	
	@Test
	public void testFahrenheitParaCelsius() {
		//Testando valores
		assertEquals(1000.0, meuConversor.fahrenheitParaCelsius(1832.0), 0.01);
		assertEquals(0.01, meuConversor.fahrenheitParaCelsius(32.018), 0.01);
		assertEquals(-22.3, meuConversor.fahrenheitParaCelsius(-8.14), 0.01);
	}
	
	@Test
	public void testCelsiusParaKelvin() {
		//Testando valores
		assertEquals(273, meuConversor.celsiusParaKelvin(0), 0.01);
		assertEquals(273.01, meuConversor.celsiusParaKelvin(0.01), 0.01);
		assertEquals(250.7, meuConversor.celsiusParaKelvin(-22.3), 0.01);
	}
	
	@Test
	public void testKelvinParaCelsius() {
		//Testando valores
		assertEquals(-273.0, meuConversor.kelvinParaCelsius(0.0), 0.01);
		assertEquals(-214, meuConversor.kelvinParaCelsius(59.0), 0.01);
		assertEquals(326, meuConversor.kelvinParaCelsius(599.00), 0.01);
	}
	
	@Test
	public void testFahrenheitParaKelvin() {
		//Testando valores
		assertEquals(255.22, meuConversor.fahrenheitParaKelvin(0.0), 0.01);
		assertEquals(421.88, meuConversor.fahrenheitParaKelvin(299.98), 0.01);
		assertEquals(31.85, meuConversor.fahrenheitParaKelvin(-402.07), 0.01);
	}
	
	@Test
	public void testKelvinParaFahrenheit() {
		//Testando valores
		assertEquals(0.0, meuConversor.kelvinParaFahrenheit(255.22), 0.01);
		assertEquals(299.98, meuConversor.kelvinParaFahrenheit(421.88), 0.01);
		assertEquals(-402.07, meuConversor.kelvinParaFahrenheit(31.85), 0.01);
	}

}
