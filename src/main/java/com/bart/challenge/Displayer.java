package com.bart.challenge;

import java.util.HashMap;
import java.util.Map;

public class Displayer {

	
	public String display(Number source) {
		String source_str = String.valueOf(source);
		Map<Character, Symbol> hashMap = new HashMap<Character, Symbol>();
		for(Symbol s : Digit.values()) {
			hashMap.put(s.getKey(), s);
		}
		char[] charArray = source_str.toCharArray();
		StringBuilder top = new StringBuilder();
		StringBuilder middle = new StringBuilder();
		StringBuilder botton = new StringBuilder();		
		for (char c : charArray) {
			Symbol symbol = hashMap.get(c);
			top.append(symbol.getTop());
			middle.append(symbol.getMiddle());
			botton.append(symbol.getBottom());
		}
		String result = top.toString()+"\n"+middle.toString()+"\n"+botton.toString()+"\n";
		System.out.println(result);
		return result;
		
	}
}
