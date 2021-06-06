package com.bart.challenge;

public enum Digit implements Symbol{
	D_0( "  _ ",
		 " | |",
		 " |_|",'0'),
	D_1( "  ",
		 " |",
		 " |",'1'),
	D_2( "  _ ",
		 "  _|",
		 " |_ ",'2'),
	D_3( " _ ",
		 " _|",
		 " _|",'3'),
	D_4( "    ",
		 " |_|",
		 "   |",'4'),
	D_5( "  _ ",
		 " |_ ",
		 "  _|",'5'),
	D_6( "  _ ",
		 " |_ ",
		 " |_|",'6'),
	D_7( " _ ",
		 "  |",
		 "  |",'7'),
	D_8( "  _ ",
		 " |_|",
		 " |_|",'8'),
	D_9( "  _ ",
		 " |_|",
		 "   |",'9'),
	DOT( " ",
		 " ",
		 ".",'.'),
	NEG( "  ",
		 " _",
		 "  ",'-'),
	;
	
	String top;
	String bottom;
	String middle;
	char key;
	
	private Digit(String top, String middle, String bottom, char key) {
		this.top = top;
		this.bottom = bottom;
		this.middle = middle;
		this.key = key;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public String getBottom() {
		return bottom;
	}
	public void setBottom(String bottom) {
		this.bottom = bottom;
	}
	public String getMiddle() {
		return this.middle;
	}
	@Override
	public Character getKey() {
		return this.key;
	}
}
