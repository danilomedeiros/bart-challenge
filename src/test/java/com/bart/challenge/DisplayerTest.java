package com.bart.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bart.challenge.Displayer;

public class DisplayerTest {
	
	private Displayer displayer;
	
	@BeforeEach
	public void setup() {
		this.displayer = new Displayer();
	}
	
	@Test
	public void shouldReturn0OnDisplayFormmat() {
		
		String displayed = this.displayer.display(0);
		
		String expected = "  _ \n"
				        + " | |\n"
				        + " |_|\n";
		
		assertThat(displayed).isEqualTo(expected);
	}
	
	@Test
	public void shouldReturn123OnDisplayFormmat() {
		
		String displayed = this.displayer.display(0);
		
		String expected = "    _  _ \n"
				        + " |  _| _|\n"
				        + " | |_  _|\n";
		
		assertThat(displayed).isEqualTo(expected);
	}
}
