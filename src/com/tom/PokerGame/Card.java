package com.tom.PokerGame;

public class Card {
	char [] suits = {'\u2660' ,'\u2665', '\u2666' ,'\u2663'};
	int suit;
	int value;
	int symbol;
	public Card (int value){
		this.value = value;
	}
	
	public String get(){
		String v = value %13+1 + "" +suits[value/13];
		return v;
	}
}
