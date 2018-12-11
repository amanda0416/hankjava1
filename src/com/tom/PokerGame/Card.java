package com.tom.PokerGame;

public class Card {
	String suits = "\u2660\u2665\u2666\u2663";
	/*char [] suits = {'\u2660' ,'\u2665', '\u2666' ,'\u2663'};*/
	int suit;
	int value;
	int symbol;
	public Card (int value){
		this.value = value;
	}
	
	public String get(){
		int type = value/13;
		int num = value %13+1;
		return num + "" + suits.charAt(type);
		/*String v = value %13+1 + "" +suits[value/13];
		return v;*/
	}
}
