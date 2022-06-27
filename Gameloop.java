

		
		import java.util.Scanner;

		import static java.lang.System.out;

	class Game {
		Scanner scan=new Scanner(System.in);
		    
		    public boolean Start() {
		        

		        boolean playingGame = true;
		        do {
		            Promt();
		            int num1 =scan.nextInt();
		            numPromt(num1);
		            
		        }
		        while (playingGame);
		        return false;
		    }
		    //code for promt
		    private void Promt() {

		        String promt = String.format("You are in a land full of dragons.\n" +
		                "In front of you, you see two caves.\n" +
		                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
		                "The other dragon is greedy and hungry and will eat you on sight.\n" +
		                "Which cave will you go into? ( 1 or 2)");

		        out.println(promt);
		    }
		    	//code for number response
		    private void numPromt(int num1) {

		        if (num1 == 1) {
		            out.println(
		            "You approach the cave.... \n" +
		            "It is dark and spooky.... \n" +
		            "A large dragon jumps out in front of you! He opens his jaws and... \n" +
		            "gobbles you down in one bite!"+"press 0 to exit");     
		            
		            
		           
		           } 
		        if (num1==2){
		        	System.out.println(
		                    "You approach the cave.... \n" +
		                            "It is dark and spooky.... \n" +
		                            "A large dragon jumps out in front of you! He opens his jaws and... \n" +
		                            "gives you a pot of gold! "
		                            + "press 0 to exit");
		        	
		        }
		    }
		          
		          

		 
	}


