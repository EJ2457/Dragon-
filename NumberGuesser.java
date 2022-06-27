
	import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

	 public class NumberGuesser {
		 
		    public static void main(String[] args) {
		        NumberGuesser();
		        exit(0);
		    }
		 	
		   public static void NumberGuesser() {
		  
	        Scanner sc = new Scanner(System.in);
	        int number = 1 + (int)(20 * Math.random());
	        String name;
	        int guesses = 6;
	        int i, guess;
	        //promt
	        System.out.println("Hello! What is your name?");
	        name=sc.next();
	        System.out.println("Well"+name+"I am thinking of a number between 1 and 20. Take a guess!");
	 
	    
	        for (i = 0; i < guesses; i++) {
	 
	           
	            // Take input for guessing
	            guess = sc.nextInt();
	 
	            // If the number is guessed
	            if (number == guess) { System.out.println("Congratulations!"+ " You guessed the number.");
	                break;
	            }
	            else if (number > guess && i != guesses - 1) { System.out.println("Your guess is too high take a guess");
	            }
	            else if (number < guess&& i != guesses - 1) {
	                System.out.println("Your guess is too low take a guess");
	            }
	        }
	 
	        if (i == guesses) {
	            System.out.println("You lose!");
	            System.out.println("The number was " + number);
	        }
	    }
	 
	  

	}

