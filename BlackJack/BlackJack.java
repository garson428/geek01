package BlackJack;

public class BlackJack {

	public static void main(String[] args) {

		System.out.println("ゲームを開始します\r\n");

		Dealer d = new Dealer();
		User u = new User();

////////ディーラー/////////
		d.setCard(d.deal());                       //Dealerインスタンス"d"のdealメソッド(戻り値:drawCards)を引数に
									               //"d"のsetCardメソッド(drawCardsをmyCardsにセット)を使う
		System.out.println(
				"ディーラーの手札は" + d.open() + "です");

		while (d.checkSum() == true) {          //ディーラーのHitの判断
				d.setCard(d.hit());
				System.out.println("ディーラーはHit!!\r\nディーラーの手札が" + d.open() + "になりました");

		}
////////ユーザー//////////
		u.setCard(d.deal());                       //Userインスタンス"u"のdealメソッド(戻り値:drawCards)を引数に
								                   //"u"のsetCardメソッド(drawCardsをmyCardsにセット)を使う
		System.out.println(
				"ユーザーの手札は" + u.open() + "です");

		while (u.checkSum() == true) {    //ユーザーのHitの判断
				u.setCard(d.hit());
				System.out.println("ユーザーはHit!!\r\nユーザーの手札が" + u.open() + "になりました\r\n");

		}
////////勝敗結果//////////
		if (d.open() > 21 && u.open() <= 21) {
			System.out.println("！！ユーザーの勝利！！");
		} else if (d.open() <= 21 && u.open() > 21) {
			System.out.println("ディーラーの勝利");
		} else if (d.open() > u.open()) {
			System.out.println("ディーラーの勝利");
		} else if (d.open() < u.open()) {
			System.out.println("！！ユーザーの勝利！！");
		} else {
			System.out.println("引き分け");
		}

		System.out.println("\r\nゲームを終了します");
	}
}