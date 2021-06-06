package com.bart.challenge;

public class NumberDisplay extends TypeDisplayer<Number>{

	@Override
	public String getRawDate(Number t) {
		return String.valueOf(t);
	}
}