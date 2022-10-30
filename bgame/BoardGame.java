package bgame;

import java.util.Scanner;

import mgr.Manageable;

public class BoardGame implements Manageable {
	String name;
	String level;
	String genre;
	String explain;
	
	@Override
	public void read(Scanner sc) {
		String temp1 = null;
		String temp2 = null;
		name = sc.next();
		level = sc.next();
		while (true) {
			temp1 = sc.next();
			if (temp1.equals("0"))
				break;
			genre = genre + " " + temp1;
		}
		while (true) {
			temp2 = sc.next();
			if (temp2.equals("0"))
				break;
			explain = explain + " " + temp2;
		}
	}

	@Override
	public void print() {
		System.out.format("������� �̸� : %s (���̵� : %s, �帣 : %s)\n", name, level, genre);
		System.out.format("[���� ���] - %s\n",explain);
	}

	@Override
	public boolean matches(String kwd) {
		if(name.contains(kwd) || level.equals(kwd) || genre.contains(kwd)) return true;
		return false;
	}
	
}