package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Time;
import java.util.Calendar;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void smokeTest1() {
		Greeting greeting = new Greeting();
		Calendar cal = mock(Calendar.class);
		Message msg = new Message();
		assertEquals("Good morning", greeting.getGreeting(null,cal,msg));
	}
	@Test
	public void smokeTest4() {
		Greeting greeting = new Greeting();
		Calendar cal = mock(Calendar.class);
		Message msg = mock(Message.class);
		when(msg.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		when(msg.getMessage(any(TimeOfTheDay.class),any(Language.class))).thenReturn("Good morning");

		greeting.getGreeting(null,cal,msg);
		
		verify(msg).getDefaultLanguage();
		verify(msg).getMessage(any(TimeOfTheDay.class),any(Language.class));
	}
	
	
	@Test
	public void smokeTest2() {
		Greeting greeting = new Greeting();
		Message msg = mock(Message.class);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH,Calendar.getInstance(),msg));
	}
	
	@Test
	public void smokeTest5() {
		Greeting greeting = new Greeting();
		Calendar cal = mock(Calendar.class);
		Message msg = mock(Message.class);
		when(msg.getDefaultLanguage()).thenReturn(Language.ENGLISH);
		when(msg.getMessage(any(TimeOfTheDay.class),any(Language.class))).thenReturn("Good morning");

		greeting.getGreeting(Language.ENGLISH,Calendar.getInstance(),msg);
		
		verify(msg, never()).getDefaultLanguage();
		verify(msg).getMessage(any(TimeOfTheDay.class),any(Language.class));
	}
	
	@Test
	public void smokeTest3() {
		Greeting greeting = new Greeting();
		Message msg = mock(Message.class);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH,Calendar.getInstance(),msg));
	}

}
