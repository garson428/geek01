package BlackJack;

import java.util.ArrayList;

public abstract class Human {
	protected ArrayList<Integer> myCards = new ArrayList<Integer>();

	abstract public int open();

	abstract public void setCard(ArrayList<Integer> drawCards);

	abstract public boolean checkSum();

}