package com.tom.PokerGame;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Card [] cards = new Card[52];
		cards [0] = new Card(22);
		System.out.println(cards[0].get());
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
		/*int[]nums = new int[5];
		nums[0] = 77;
		nums[4] = 98;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for(int i = 0;i<nums.length;i++){
			System.out.println(nums[i]);
		}*/
		
		/*char a = 0x2660;
		char b = 0x2665;
		char c = 0x2666;
		char d = 0x2663;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		/*int i;
		for(i=0 ; i<3 ; i++){
			System.out.println(i);
		}*/
		
		/*Random random = new Random();
		int pokerN = random.nextInt(13)+1;
		System.out.print(pokerN);
		int pokerF = random.nextInt(4);
		char f =0;
		switch(pokerF){
		case 0:
			f ='S';
			break;
		case 1:
			f ='H';
			break;
		case 2:
			f ='D';
			break;
		case 3:
			f ='C';
			break;
		}
		System.out.print(f);*/
		
		/*char p =0;
		if (pokerF==0 ){
			p = 'S';
		}else if(pokerF==1 ){
			p = 'H';
		}else if(pokerF==2 ){
			p = 'D';
		}else if(pokerF==3 ){
			p = 'C';
		}
		System.out.print(p);*/
	}

}
