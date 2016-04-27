package quan;
/*
 * Sharon Quan
 * 26/04/2016
 * ArrayTwo 
 * This program prints out the lyrics for a song  
 */
public class ArrayTwo {

	public static void main(String[] args) {
		
		//array
		String [] lyrics = new String[]{"clap your hands", "clap your finger","and you really really want to show it.", "clap your feet", "stomp your feet", "snap your fingers", "and you really wanna show it", "stomp on one feet", "tap your head", "tap your nose"};
		
		for (int i = 0; i !=10; i++) //loop for the lyrics 
		{
			System.out.println("If you're happy & you know it " + lyrics[i]);
		}
		
	}

}

