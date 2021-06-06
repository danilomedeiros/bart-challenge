package com.bart.challenge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDisplay extends TypeDisplayer<Date> {

	@Override
	public String getRawDate(Date t) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatted = fmt.format(t);
		return dateFormatted;
	}
}