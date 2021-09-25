package come.qa.example;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.example.Temperature;

public class TemperatureTest {
	
	Temperature tc;
	
	@BeforeClass
	public static void setup() {
		System.out.println("Setup");
	}

	@Before
	public void init() {
		System.out.println("Before test");
	}
	
	@Test 	
	public void fahrenheit() {
		
		assertEquals(15.556, tc.convertFahrenheitToCelsius(60), 0.001);
	}
	
	@After
	public void after() {
		
	}
	
	@Before
	public void init1() {
		
	}
	
	@Test
	public void celcius() {
		assertEquals(32, tc.convertCelsiusToFahrenheit(0), 0);
	}

	@After
	public void after1() {
		
	}
	
	@Before
	public void init2() {
		
	}
	
	@Test
	public void kelvin() {
		assertEquals(10, tc.convertKelvinToCelsius(283), 5);
	}
	
	
}


