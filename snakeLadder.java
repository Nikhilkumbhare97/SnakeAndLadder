
public class snakeLadder {

	public static final int START_POSITION = 0;
	public static final int END_POSITION = 100;
	public static final int LADDER = 0;
	public static final int SNAKE = 1;

	public static void main (String[] args) {

		//Variables
		int currentPosition = 0;
		int dieTimes = 0;
		int player = 1;

		System.out.println( "Player" + player + " is at Starting Position :" +START_POSITION );

		//Computation
		while (currentPosition != END_POSITION)
		{

			int rollDice, rollDice1;
			rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			currentPosition += rollDice;
			dieTimes = dieTimes + 1;

			if (currentPosition > END_POSITION) {
				currentPosition -= rollDice;
				System.out.println("Current Position : "+currentPosition);
			}else if (currentPosition == END_POSITION){
				//Game over
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
						System.out.println("Ladder is there");
						System.out.println("Current Position : "+currentPosition);
						break;
					case SNAKE:
						rollDice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
						dieTimes = dieTimes + 1;
						if (currentPosition <= rollDice1) {
							currentPosition = START_POSITION;
							System.out.println("Game Restart");
						}else {
							currentPosition -= rollDice1;
						}
						System.out.println("Sanke is there");
						System.out.println("Current Position : "+currentPosition);
						break;
					default:
						//No Play
						System.out.println("No Play is there");
						currentPosition += 0;
				}
			}
		}
		System.out.println("Number of Times Die Played : "+dieTimes);
		System.out.println("Player" + player + " Win the Game");
	}
}
