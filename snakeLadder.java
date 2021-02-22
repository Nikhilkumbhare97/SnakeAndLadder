public class snakeLadder {

	public static final int START_POSITION = 0;
	public static final int END_POSITION = 100;
	public static final int LADDER = 0;
	public static final int SNAKE = 1;

	public static void main (String[] args) {
		//Variables
		int currentPosition = 0;
		int dieTimes = 0;

		//Computation
		while (currentPosition != END_POSITION)
		{
			int rollDice, rollDice1;
			rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			currentPosition += rollDice;
			dieTimes = dieTimes + 1;

			System.out.println("Die Number : "+dieTimes);

			if (currentPosition > END_POSITION) {
				currentPosition -= rollDice;
				System.out.println("Current Position : "+currentPosition);
			}else {
				System.out.println("Current Position : "+currentPosition);
				int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
				switch (checkPlay)
				{
					case LADDER:
						rollDice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
						dieTimes = dieTimes + 1;
						if ((END_POSITION - currentPosition) < rollDice1) {
							currentPosition += 0;
						}else {
							currentPosition += rollDice1;
						}
						System.out.println("Die Number : "+dieTimes);
						System.out.println("Current Position : "+currentPosition);
						break;
					case SNAKE:
						rollDice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
						dieTimes = dieTimes + 1;
						if (currentPosition < rollDice1) {
							currentPosition = START_POSITION;
						}else {
							currentPosition -= rollDice1;
						}
						System.out.println("Die Number : "+dieTimes);
						System.out.println("Current Position : "+currentPosition);
						break;
					default:
						//No Play
							currentPosition += 0;
				}
			}
		}
		System.out.println("Number of Times Die Played : "+dieTimes);
	}
}
