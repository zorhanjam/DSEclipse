
public class Coin {
	private int value;
	private String name;
	private int year;
	
	public Coin() {
		// TODO Auto-generated constructor stub
		this(0, 0000);
		
	}

	
	/**
	 * @param value
	 * @param year
	 */
	public Coin(int value, int year) {
		super();
		this.value = value;
		this.year = year;
		this.setName();
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getCoinName() {
		
		return name;
	}


	public void setCoinName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void setName() {
		if(value == 1)
			name = "PENNY";
		else if(value == 5)
			name = "NICKEL";
		else if(value == 10)
			name = "DIME";
		else if(value == 25)
			name = "QUARTER";
		else
			name = "NONAME";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
