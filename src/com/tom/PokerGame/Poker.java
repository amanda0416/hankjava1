package com.tom.PokerGame;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
	//int[] cards = new int [52];
	//Card [] cards = new Card[52];
	ArrayList bag = new ArrayList();
	public Poker(){
		for (int i = 0 ; i < 52 ; i++ ){
			// cards[i] = i ;
			//cards[i] =  new Card(i) ;
			Card c = new Card(i);
			bag.add(c);
		}
		System.out.println(bag.size());
	}
	
	/*public void shuffle() {
		for (int i = 0 ; i < 52 ; i++ ){
			int r = new Random().nextInt(52);
			// a = cards[i];
			// b = cards[r];
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] =tmp ;
		}
	}*/
	
	public void print(){
		for (int i = 0 ; i < 52 ; i++ ){
			/*char a = 0x2660;
			char b = 0x2665;
			char c = 0x2666;
			char d = 0x2663;
			int pokerF = cards[i]/13;
			char f =0;
			switch(pokerF){
			case 0:
				f = a;
				break;
			case 1:
				f = b;
				break;
			case 2:
				f = c;
				break;
			case 3:
				f = d;
				break;
			}*/
			Card c = (Card)bag.get(i);
			System.out.print(c.get() +" ");
			if (i%13==12)
				System.out.println();
		}
	}
}
