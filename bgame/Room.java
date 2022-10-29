package bgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	public ArrayList<Integer> roomList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void readAll() {
		while (true) {
			System.out.print("���ϴ� �� ��ȣ�� �Է��ϼ���: ");
			int room = sc.nextInt();
			if (roomList.contains(room)) {
				System.out.println("�̹� ������� ���Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				roomList.add(room);
				break;
			}
		}
	}

	public void pop() {
		while (true) {
			System.out.print("�ݳ��Ͻ÷��� �� ��ȣ�� �Է����ּ���: ");
			int room = sc.nextInt();
			if (roomList.contains(room)) {
				roomList.remove(Integer.valueOf(room));
				break;
			} else {
				System.out.println("�����Ͻ� ���� ������� ���� �ƴմϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

}
