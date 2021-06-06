package com.bart.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DisplayerTest {
	
	private Displayer displayer;
	
	@BeforeEach
	public void setup() {
		this.displayer = new Displayer();
	}

	@Test
	public void shouldReturn0OnDisplayInteger() {
		String expected = "  _ \n"
				        + " | |\n"
				        + " |_|\n";
		displayTestProcedure(0, expected);
	}

	@Test
	public void shouldReturn123OnDisplayInteger() {
		
		String expected = "    _  _ \n"
				        + " |  _| _|\n"
				        + " | |_  _|\n";
		displayTestProcedure(123, expected);
	}
	
	
	@Test
	public void shouldReturn12OnDisplayInteger() {
		String expected = "    _ \n"
				        + " |  _|\n"
				        + " | |_ \n";
		displayTestProcedure(12, expected);
	}
	@Test
	public void shouldReturn1234567890nDisplayInteger() {
//		String expected = "    _ \n"
//				        + " |  _|\n"
//				        + " | |_ \n";
	    String expected = 
	    "    _  _       _   _  _   _   _   _ \n"+
	    " |  _| _| |_| |_  |_   | |_| |_| | |\n"+
	    " | |_  _|   |  _| |_|  | |_|   | |_|\n";
		displayTestProcedure(1234567890, expected);
	}
	
	@Test
	public void shouldReturnMinus1234567890nDisplayInteger() {
//		String expected = "    _ \n"
//				        + " |  _|\n"
//				        + " | |_ \n";
	    String expected = 
	    "      _  _       _   _  _   _   _   _ \n"+
	    " _ |  _| _| |_| |_  |_   | |_| |_| | |\n"+
	    "   | |_  _|   |  _| |_|  | |_|   | |_|\n";
		displayTestProcedure(-1234567890, expected);
	}

	@Test
	public void shouldReturnMinus12345Dot67809nDisplayDuble() {
//		String expected = "    _ \n"
//				        + " |  _|\n"
//				        + " | |_ \n";
	    String expected = 
	    "      _  _       _    _  _   _   _   _ \n"+
	    " _ |  _| _| |_| |_   |_   | |_| | | |_|\n"+
	    "   | |_  _|   |  _|. |_|  | |_| |_|   |\n";
		displayTestProcedure(-12345.67809, expected);
	}
	
	@Test
	public void shouldReturn05052021_123456DisplayCalendar() {
		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 05, 12, 34, 56);
		
		String expected = 
				  "  _   _     _   _     _   _   _        _   _        _   _ \n"+
				  " | | |_  _ | | |_  _  _| | |  _| |  |  _|. _| |_|. |_  |_ \n"+
				  " |_|  _|   |_|  _|   |_  |_| |_  |  | |_ . _|   |.  _| |_|\n";				
		displayTestProcedure(calendar, expected);
	}
	
	@Test
	public void shouldReturn05052021_123456DisplayDate() {
		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 05, 12, 34, 56);
		
		String expected = 
				  "  _   _     _   _     _   _   _   \n"+
				  " | | |_  / | | |_  /  _| | |  _| |\n"+
				  " |_|  _|/  |_|  _|/  |_  |_| |_  |\n";				
		displayTestProcedure(calendar.getTime(), expected);
	}
	private void displayTestProcedure(Calendar number, String expected) {
		String displayed = this.displayer.display(number);
		System.out.println(expected);
		assertThat(displayed).isEqualTo(expected);
	}
	private void displayTestProcedure(Date number, String expected) {
		String displayed = this.displayer.display(number);
		System.out.println(expected);
		assertThat(displayed).isEqualTo(expected);
	}
	
	private void displayTestProcedure(Number number, String expected) {
		String displayed = this.displayer.display(number);
		System.out.println(expected);
		assertThat(displayed).isEqualTo(expected);
	}
	
}
