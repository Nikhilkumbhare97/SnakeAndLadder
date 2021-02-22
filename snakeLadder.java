public class snakeLadder {

	public static final int START_POSITION = 0;
	public static final int END_POSITION = 100;
	public static final int LADDER = 0;
	public static final int SNAKE = 1;

	public static void main (String[] args) {
		//Variables
		int currentPosition = 0;

		//Computation
		while (currentPosition != END_POSITION && currentPosition < END_POSITION)
		{
			int rollDice;
			rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			currentPosition += rollDice;

			int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
			switch (checkPlay)
			{
				case LADDER:
					rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
					currentPosition += rollDice;
					break;
				case SNAKE:
					rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
					if (currentPosition < rollDice) {
						currentPosition = START_POSITION;
					}else {
						currentPosition -= rollDice;
					}
					break;
				default:
					//No Play
					currentPosition += 0;
			}
			System.out.println("Current Position : "+currentPosition);
		}
	}
}
