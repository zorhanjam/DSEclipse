
public class Item1 {
	private String name;
	private int price;
	/**
	 * 
	 */
	public Item1() {
		this("NO NAME", 0);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @param name
	 * @param price
	 */
	public Item1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
;