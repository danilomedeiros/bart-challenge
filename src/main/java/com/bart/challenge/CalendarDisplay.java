package com.bart.challenge;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDisplay extends TypeDisplayer<Calendar>{

	@Override
	public String getRawDate(Calendar t) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	    String dateFormatted = fmt.format(t.getTime());
	    return dateFormatted;
	}

}