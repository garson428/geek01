package BlackJack;

import java.util.ArrayList;

public class User extends Human {

	public int open() {
		int total = 0;
		for (int i = 0; i < myCards.size(); i++) {
			if (myCards.get(i) > 10) {
				total += 10;
			} else {
				total += myCards.get(i);
			}
		} return total;
	}


	public void setCard(ArrayList<Integer> drawCards) {
		myCards.addAll(drawCards);
	}


	public boolean checkSum() {
		int total = open();
		if (total < 17) {
			return true;
		} else {
			return false;
		}
	}
}