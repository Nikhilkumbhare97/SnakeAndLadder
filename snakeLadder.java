public class snakeLadder {

	public static final int START_POSITION = 0;

	public static void main (String[] args) {

		int rollDice;
		rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Dice Value : "+rollDice);

	}
}
