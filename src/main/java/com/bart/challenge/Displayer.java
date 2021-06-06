package com.bart.challenge;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Displayer implements DisplayerFacade {
	
	
	Map<Class<?>, TypeDisplayer<?>> strategies;

	private synchronized void init() {
		if(strategies == null) {
			strategies = new HashMap<Class<?>,TypeDisplayer<?>>();
		}
		strategies.put(Number.class, new NumberDisplay());
		strategies.put(Date.class, new DateDisplay());
		strategies.put(Calendar.class, new CalendarDisplay());
	}
	
	@Override
	public String display(Number s) {
		init();
		NumberDisplay typeDisplayer = (NumberDisplay) this.strategies.get(Number.class);
		return typeDisplayer.display(s);
	}

	@Override
	public String display(Calendar s) {
		init();
		CalendarDisplay displayer = (CalendarDisplay) this.strategies.get(Calendar.class);
		return displayer.display(s);
	}

	@Override
	public String display(Date s) {
		init();
		DateDisplay typeDisplayer = (DateDisplay) this.strategies.get(Date.class);
		return typeDisplayer.display(s);
	}

	
}
