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
	    System.out.println("Awsk a yes ow no quwestion.");
	    String response = input.nextLine();
	    System.out.println("Pick a nuwmber 0-7");
	    int number = input.nextInt();
		                    
//       \`*-.                    
//        )  _`-.                 
//       .  : `. .                
//       : _   '  \               
//       ; *` _.   `*-._          
//       `-.-'          `-.       
//         ;       `       `.     
//         :.       .        \    
//         . \  .   :   .-'   .   
//         '  `+.;  ;  '      :   
//         :  '  |    ;       ;-. 
//         ; '   : :`-:     _.`* ;
//      .*' /  .*' ; .*`- +'  `*' 
//      `*-*   `*-*  `*-*'
		
        
        String[] theyArray = {"Its nowt worth it-Pwankton",
        "Yes! Yes! It's twue!UwU It's all twue! - Spongebowb", 
        "Juwst do what I do when I hawve pwoblems... SCREAM!OwO - Patrick Star", 
        "That's an ewasy one! You juwst... juwst...let's see. If it's Janwuary with... with vaniwwa puwdding...you uh... Pawss? -Mr.Krabs",
        "A mawn's gowtta do what a man's gowta do! - Spongebob Squarepants", 
        "We used to beawt peowple up for sawying tings like that. O~oEverything's all Towpsy Turwvey - Mr. Krabs", 
        "Youw had youwr chanwce and youw fayled. Yowu have to stop liwving in the pawst! - Patrick Star",
        "You miwsed youwr chanwce! You've gottwa be aggwessive to get the tings you want!>;3-Plankton "
        };

		System.out.println(theyArray[number]); 
		}
} 

