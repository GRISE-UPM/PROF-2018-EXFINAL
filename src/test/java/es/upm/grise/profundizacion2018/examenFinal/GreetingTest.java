package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyZeroInteractions;


import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	MyCalendar calendar;// dependency
	Message message; // dependency
	Greeting greeting; //class to be tested
	String msg = null;
	
	@Before 
	public void setup() { 
		calendar = mock(MyCalendar.class);
		message = mock(Message.class);
		greeting = new Greeting();
	}
	
	//chequea mensaje con idioma default
	@Test
	public void smokeTest1() {
		/*MyCalendar calendar = mock(MyCalendar.class);*/
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		msg = greeting.getGreeting(null,calendar,message);
		assertEquals("Good morning", message);
	}
	
	//chequea mensaje con idioma ingles
	@Test
	public void smokeTest2() {
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		msg = greeting.getGreeting(Language.ENGLISH,calendar, message);
		assertEquals("Good morning", message );
	}
	
	//chequea mensaje con idioma español
	@Test
	public void smokeTest3() {
		//Greeting greeting = new Greeting();
		when(calendar.getHourOfTheDay()).thenReturn(10);
		msg = greeting.getGreeting(Language.SPANISH,calendar,message);		
		assertEquals("Buenos días", message);
	}
	
	//comprobar que se invoca una vez al método Message()getDefaultLanguage y una vez al metodo Message.getMessage()
	@Test
	public void smokeTest4() {
		//when(calendar.getHourOfTheDay()).thenReturn(10);
		greeting.getGreeting(null, calendar, message);
		verify(message,times(1)).getDefaultLanguage();
		verify(message,times(1)).getMessage(TimeOfTheDay.MORNING, null);
	}	
	
	//comprobar que llama una vez a getmessage y nunca a getdefaultmessage
	@Test
	public void smokeTest5() {
		greeting.getGreeting(Language.ENGLISH,calendar, message);
		verify(message,times(0)).getDefaultLanguage();
		verify(message,times(1)).getMessage(TimeOfTheDay.MORNING,Language.ENGLISH);
	}

}
