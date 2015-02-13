import java.util.Scanner;

public class Project
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				System.out.println("what is your name?");
				String name = userInput.nextLine();
				System.out.println("welcome to the game, " + name + "!");

				System.out.println("You find yourself inside a locked room with 2 small boxes on the floor. What do you do?");
				System.out.println("  (1) open the one on the left.");
				System.out.println("  (2) open the one of the right.");

				int choice = userInput.nextInt();

				if (choice == 1)
					{
						System.out.println("You find a key and some matches.");

						System.out
								.println("You use the key on the locked door.");

						System.out
								.println("You find two hallways. Do you go down the first one or the second one?");

					} else if (choice == 2)
					{
						System.out.println("You find nothing");

					}
			}
	}
	