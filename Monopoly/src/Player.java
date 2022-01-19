import java.util.ArrayList;

public class Player {

	private String name;
	private int money;
	private int location;
	private ArrayList <String[]> inventory = new ArrayList <String[]> ();
	
	public Player (String n, int m, int l, ArrayList <String[]> i) {
		
		name = n;
		money = m;
		location = l;
		inventory = i;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;

	}
	
	public void addProperty(String[] s)
	{
		inventory.add(s);
	}
	
}
