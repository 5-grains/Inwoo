package bgame;

import java.util.Scanner;

import mgr.Manageable;

public class Drink implements Manageable {
	String name;
	int price;
	
	@Override
	public void read(Scanner scan) {
		name = scan.next();
		price = scan.nextInt();
	}
	
	@Override
	public void print() {
		System.out.format("<%s>/t %d원", name, price);
	}
	
	@Override
	public boolean matches(String keyword) {
		return (name.contains(keyword) || (price + "").contains(keyword));
	}
}
