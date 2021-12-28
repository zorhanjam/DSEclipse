import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
	public static String k[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	public static String s[] = { "H", "D", "S", "C" };
	public List<String> ks = new ArrayList<>(Arrays.asList(k));
	public List<String> ss = new ArrayList<>(Arrays.asList(s));

	ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<>();
		for (String sc : ss) {
			for (String kc : ks) {
				Card c = new Card(sc, kc);
				deck.add(c);
			}

		}
	}

	public Card getCard() {
		Card ca = deck.remove(0);
		return ca;
	}

	public void shuffle() {
		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			int rand = r.nextInt(52);
			deck.add(deck.remove(rand));
		}
	}

	public String toString() {
		String d = "";
		for (int i = 0; i < deck.size(); i++) {
			d += deck.get(i) + "\n";
		}
		return d;
	}

	public void howMany() {
		System.out.println(deck.size() + " cards left.");
	}

	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		Random r = new Random();
		System.out.println(r.nextInt(52));
	}

}
