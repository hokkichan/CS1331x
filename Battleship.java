import java.util.Scanner;

	public class Battleship {
		public static void main(String[] args) {
			System.out.println("Welcome to Battleship!\n");
			System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
			System.out.println("Enter ship 1 location:");
			char[][] playerOneShotsBoard = {
					{'-', '-', '-', '-', '-'},
        			{'-', '-', '-', '-', '-'},
        			{'-', '-', '-', '-', '-'},
        			{'-', '-', '-', '-', '-'},
        			{'-', '-', '-', '-', '-'}};
			Scanner input = new Scanner(System.in);
			//boolean validity = false;
			//int ship1a = 0;
			//while(!validity) {
			//	ship1a = Integer.parseInt(input.next());
				
			//	if (ship1a != 0 || ship1a != 1) {
			//		System.out.println("Invalid!");
			//	}
			//	else {
			//		validity = true;
			//	}
			//}
			int ship1a = Integer.parseInt(input.next());
			int ship1b = Integer.parseInt(input.next());
			System.out.println("Enter ship 2 location:");
			int ship2a = Integer.parseInt(input.next());
			int ship2b = Integer.parseInt(input.next());
			playerOneShotsBoard[ship1a][ship1b] = '@';
			playerOneShotsBoard[ship2a][ship2b] = '@';
			printBattleShip(playerOneShotsBoard);
		}

		// Use this method to print game boards to the console.
		private static void printBattleShip(char[][] player) {
			System.out.print("  ");
			for (int row = -1; row < 5; row++) {
				if (row > -1) {
					System.out.print(row + " ");
				}
				for (int column = 0; column < 5; column++) {
					if (row == -1) {
						System.out.print(column + " ");
					} else {
						System.out.print(player[row][column] + " ");
					}
				}
				System.out.println("");
			}
		}
	}


