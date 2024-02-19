package cardgame;


public class Card {

        public enum Suit { 
        HEARTS, CLUBS, SPADES, DIAMONDS
        }
        public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
            NINE, TEN, JACK, QUEEN, KING}
        

	private Suit suit;
	private Value value;

        public Card(Suit suit, Value value) { //might need to change order of these 2: int, v string
            this.suit = suit;
            this.value = value;
        }


	public Suit getSuit() {
		return this.suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Value getValue() {
		return this.value;
	}
	public void setValue(Value value) {
		this.value = value;
	}



	public Card(String suit, int value) {
		// TODO - implement Card.Card
		throw new UnsupportedOperationException();
	}

}