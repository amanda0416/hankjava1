package com.tom.PokerGame;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random random = new Random();
		int pokerN = random.nextInt(13)+1;
		System.out.print(pokerN);
		int pokerF = random.nextInt(4)+1;
		char grading ='S';
		if (pokerF==1 ){
			grading = 'H';
		}else if(pokerF==2 ){
			grading = 'C';
		}else if(pokerF==3 ){
			grading = 'S';
		}else if(pokerF==4 ){
			grading = 'D';
		}
		System.out.print(grading);
	}

}
