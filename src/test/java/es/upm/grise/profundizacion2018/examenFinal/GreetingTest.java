package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import java.util.Calendar;
import org.mockito.Mock;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting();
		Calendar cal = mock(Calendar.class);
		assertEquals("Good morning", greeting.getGreeting(null,cal));
	}
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH,Calendar.getInstance()));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH,Calendar.getInstance()));
	}

}
