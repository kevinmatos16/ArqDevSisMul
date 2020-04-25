package ex3_2;

import java.util.*;

enum Suit {
	SPADES,
	HEARTS,
	CLUBS,
	DIAMONDS
}
class Card {
	public Card(Suit s, int n) {
		suit = s;
		if((n < 2) || (n > 14)) {
			throw new IllegalArgumentException( );
		}

		number = n;
	}
	public void print( ) {
		switch(number) {
		case 11:
			System.out.print("Valete");
			break;
		case 12:
			System.out.print("Dama");
			break;
		case 13:
			System.out.print("Rei");
			break;
		case 14:
			System.out.print("Ás");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" de ");
		switch(suit) {
		case SPADES:
			System.out.println("Espadas.");
			break;
		case HEARTS:
			System.out.println("Copas.");
			break;
		case CLUBS:
			System.out.println("Paus.");
			break;
		case DIAMONDS:
			System.out.println("Ouros.");
			break;
		}
	}
	private Suit suit;
	private int number;
}