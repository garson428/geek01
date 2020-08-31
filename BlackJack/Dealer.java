package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer extends Human {

	protected ArrayList<Integer> cards = new ArrayList<Integer>();          //山札

	public Dealer() {
	    for(int m = 1; m<=4; m++) {                //13個の要素をcardsにaddする処理を４回繰り返す
	        for (int i = 1; i <= 13; i++ ) {       //13個の要素をcardsにaddする処理
	        cards.add(i);
	        }
	    }

	    Collections.shuffle(cards);                //山札の要素をシャッフル
	}


	public ArrayList<Integer> deal() {
		ArrayList<Integer> dealCards = new ArrayList<Integer>();

		dealCards.clear();                          /*処理の初めにdrawCardsを初期化しないと、二回目にdeal()を
													  使用した際に一回目のdeal()の戻り値が残ったままになる*/
		dealCards.add(cards.get(0));                //山札の要素1番目をdrawCardsに追加
		cards.remove(0);                            //drawCardsに追加した要素を山札から削除
		dealCards.add(cards.get(0));
		cards.remove(0);

		return dealCards;                          //引いたカードを戻り値として返す
	}


	public ArrayList<Integer> hit() {
		ArrayList<Integer> hitCards = new ArrayList<Integer>();

		hitCards.add(cards.get(0));
		cards.remove(0);

		return hitCards;
	}


	public int open() {
		int total = 0;                                          //手札の合計値となる初期値
		for (int i = 0; i <myCards.size(); i++) {               //手札の要素数分繰り返し、
			if (myCards.get(i) > 10) {                           //手札の要素の数値が10より大きい場合、
				total += 10;                                     //手札の合計値に10を足す
			} else {
				total += myCards.get(i);
			}
		} return total;                                         //手札の合計値を戻り値として返す
	}


	public boolean checkSum() {
		int total = open();
		if (total < 17) {                                        //合計値が16以下であればtrueを返し、
			return true;                                        //それ以外はfalseを返す
		} else {
			return false;
		}
	}


	public void setCard(ArrayList<Integer> drawCards) {
		myCards.addAll(drawCards);
	}

}