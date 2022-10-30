package bgame;

import java.util.Scanner;

import mgr.Manageable;

public class Drink implements Manageable {
	String name;
	int price;
	
	@Override
	public void read(Scanner sc) {
		name = sc.next();
		price = sc.nextInt();
	}

	@Override
	public void print() {
		System.out.format("%s - %d¿ø\n", name, price);
	}

	@Override
	public boolean matches(String kwd) {
		if(name.contains(kwd)) return true;
		return false;
	}
}
