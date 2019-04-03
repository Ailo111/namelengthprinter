/*
Aileen Torres 
Mikayla Doering
User asks a 'yes or no' question and it will answer with spongebob quotes 
1/25/19
*/ 

import java.util.*;
public class Oracle
{

	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Ask a yes or no question.");
	    String response = input.nextLine();
	    System.out.println("Pick a number 0-7");
	    int number = input.nextInt();
	
        
        String[] theyArray = {"Its not worth it-Plankton",
        "Yes! Yes! It's true! It's all true! - Spongebob", 
        "Just do what I do when I have problems... SCREAM! - Patrick Star", 
        "That's an easy one! You just... just...let's see. If it's January with... with vanilla pudding...you uh... Pass? -Mr.Krabs",
        "A man's gotta do what a man's gotta do! - Spongebob Squarepants", 
        "We used to beat people up for saying things like that. Everything's all Topsy Turvey - Mr. Krabs", 
        "You had your chance and you failed. You have to stop living in the past! - Patrick Star",
        "You missed your chance! You've gotta be aggressive to get the things you want!-Plankton "
        };

		System.out.println(theyArray[number]); 
		}
} 

