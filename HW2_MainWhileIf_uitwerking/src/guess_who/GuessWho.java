package guess_who;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Bob van der Putten
 * @version 1
 */
public class GuessWho
{
	/**
	 * our main method
	 * 
	 * @param args			arguments
	 */
	public static void main(String[] args)
	{
		// You may ignore the three lines of code below this one:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			// Here you'll find some examples of how to do stuff. You can leave them in your program:
			// Putting text in the console:
			System.out.println("Welcome to 'Guess Who'! Let me guess your guy. Type 'yes' or 'no', followed by ENTER.");
			// Reading text from the console (click in the console and type one character, press enter):
			String s = br.readLine();
			// Putting text in the console, use '+' to concatenate Strings (stick them together):
			System.out.println("OK great! You typed: " + s + ". Now we can start for real!");
			
			////////////////// YOUR CODE - START ///////////////////////
			String answer;
			
			System.out.println("Is it a man?");
			answer = br.readLine();
			
			if (answer.equals("yes"))
			{
				System.out.println("Is he wearing something on his head?");
				answer = br.readLine();
				if (answer.equals("yes"))
				{
					System.out.println("Is it a cap he is wearing?");
					answer = br.readLine();
					if (answer.equals("yes"))
					{
						System.out.println("IT IS JAKE!");
					}
					else
					{
						System.out.println("Does he have a mustache?");
						answer = br.readLine();
						if (answer.equals("yes"))
						{
							System.out.println("IT IS CHRIS!");
						}
						else
						{
							System.out.println("IT IS JAC!");
						}
					}
				}
				else	// He isn't wearing anything on his head
				{
					System.out.println("Is his skin white?");
					answer = br.readLine();
					if (answer.equals("yes"))
					{
						System.out.println("Is he bold?");
						answer = br.readLine();
						if (answer.equals("yes"))
						{
							System.out.println("Does he have a beard?");
							answer = br.readLine();
							if (answer.equals("yes"))
							{
								System.out.println("IT IS JOSH!");
							}
							else
							{
								System.out.println("Does he have glasses?");
								answer = br.readLine();
								if (answer.equals("yes"))
								{
									System.out.println("IT IS LARRY!");
								}
								else
								{
									System.out.println("IT IS ART!");
								}
							}
						}
						else	// not bold
						{
							System.out.println("Is his hair blond?");
							answer = br.readLine();
							if (answer.equals("yes"))
							{
								System.out.println("Does he have a beard?");
								answer = br.readLine();
								if (answer.equals("yes"))
								{
									System.out.println("IT IS NICK!");
								}
								else
								{
									System.out.println("IT IS WILL!");
								}
							}
							else	// not blond
							{
								System.out.println("Does he have a beard?");
								answer = br.readLine();
								if (answer.equals("yes"))
								{
									System.out.println("IT IS HARRY!");
								}
								else
								{
									System.out.println("IT IS KEVIN!");
								}
							}
						}
					}
					else	// not white
					{
						System.out.println("Does he have a beard?");
						answer = br.readLine();
						if (answer.equals("yes"))
						{
							System.out.println("Is his hair white?");
							answer = br.readLine();
							if (answer.equals("yes"))
							{
								System.out.println("IT IS MARK!");
							}
							else
							{
								System.out.println("IT IS BOB!");
							}
						}
						else	// no beard
						{
							System.out.println("Is he bold?");
							answer = br.readLine();
							if (answer.equals("yes"))
							{
								System.out.println("IT IS SAM!");
							}
							else	// not bold
							{
								System.out.println("Is his har black?");
								answer = br.readLine();
								if (answer.equals("yes"))
								{
									System.out.println("IT IS TUPP!");
								}
								else
								{
									System.out.println("IT IS JOE!");
								}
							}
						}
					}
				}
			}
			else
			{
				System.out.println("For this assignment I only need to guess the men. Restart and choose a man please.");
			}

			/////////////////// YOUR CODE - END ////////////////////////
			
		//You may ignore everything below this line
		}
		catch(Exception e)		
		{
			System.out.println("AII - Something went wrong: " + e.getMessage());
		}

	}
}
