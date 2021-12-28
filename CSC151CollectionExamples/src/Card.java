public class Card {

	private String suits;
	private String kind;

	public Card(String suits, String kind) {
		this.suits = suits;
		this.kind = kind;

	}

	public String getSuits() {
		return suits;
	}

	public void setSuits(String suits) {
		this.suits = suits;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public boolean isFaceCard() {
		if (kind.equals("J") || kind.equals("Q") || kind.equals("K"))
			return true;
		return false;
	}

	public boolean isAce() {
		if (kind.equals("A"))
			return true;
		return false;
	}

	public String value() {
		if (isAce())
			return "11";
		else if (isFaceCard())
			return "10";
		else
			return kind;
	}

	public String toSuits() {
		if (suits.equals("H"))
			return "Heart";
		else if (suits.equals("D"))
			return "Diamond";
		else if (suits.equals("S"))
			return "Spade";
		else
			return "Club";

	}

	public String toKind() {
		if (kind.equals("A"))
			return "Ace";
		else if (kind.equals("J"))
			return "Jack";
		else if (kind.equals("Q"))
			return "Queen";
		else if (kind.equals("K"))
			return "King";
		else
			return kind;

	}

	public String toString() {
		return toKind() + " of " + toSuits();
	}

	public static void main(String[] args) {

	}

}