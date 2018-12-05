package lab15_enum;

public class CoinApp {

	public static void main(String[] args) {

		for(Coin el : Coin.values()) {
			System.out.println(el.toString());
		}
	}

}
 