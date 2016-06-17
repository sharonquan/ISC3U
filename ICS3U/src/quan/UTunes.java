package quan;
/*
 * Sharon Quan  
 * Date Started: 01/06/2016
 * Due: 20/06/2016
 * UTunes.java
 * This program allows the user to preview music before checking out to purchase a song 
 */
import java.awt.Color;  
import java.awt.Image;
import java.awt.Toolkit;

//These lines have to be here. Cut and paste them into your code
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//MOUSE
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import hsa_new.Console;

public class UTunes 
{

	static int x = 0, y = 0;
	static Toolkit toolkit = Toolkit.getDefaultToolkit();

	static Console c = new Console(30, 80); 

	/**
	 * This is the main method (the entry point to the program)
	 * This allows the user to purchase music 
	 * @param args - unused
	 */
	
	public static void main(String[] args)  //PLEASE LET THE PROGRAM LOAD A MINUTE OR SO BEFORE CLICKING START
	{
		try{ 
		//Setting console size, colour and text colour
		c.setTextColor(Color.WHITE);
		c.setTextBackgroundColor(Color.BLACK);
		c.clear();
		c.setCursor(14,36);
		c.println("LOADING.. ");
		
		boolean [] checker = new boolean[6]; // to prevent songs being added more than once 
	
		//LOAD PICS
		Image twentyfive = toolkit.getImage("src/quan/25.jpg");
		
		//LAYOUT PICS
		Image utunes = toolkit.getImage("src/quan/utunes.jpg");
		Image start = toolkit.getImage(("src/quan/start2.jpg"));
		Image layout = toolkit.getImage(("src/quan/purchase page.jpg"));
		
		//Declaring and assigning images 
				Image bs = toolkit.getImage(("src/quan/blank space.jpg"));
				Image js = toolkit.getImage(("src/quan/jennys song.jpg"));
				Image ly = toolkit.getImage(("src/quan/Love yourself.jpg"));
				Image nd = toolkit.getImage(("src/quan/No distance.jpg"));
				Image sd= toolkit.getImage(("src/quan/sad song.jpg"));
				Image pg= toolkit.getImage(("src/quan/photograph.jpg"));

				//ARRAY FOR IMAGES 
				Image [] songPic = {bs, js, ly, nd, sd, pg}; 
				
				//Files for all the songs
				Clip blankSpace  = AudioSystem.getClip(); //create the clip object 
				Clip jennysSong = AudioSystem.getClip(); 
				Clip loveYourself = AudioSystem.getClip(); 
				Clip noDistance = AudioSystem.getClip(); 
				Clip sadSong = AudioSystem.getClip();
				Clip photograph = AudioSystem.getClip(); 

				//open the given file for the clip
				blankSpace.open(AudioSystem.getAudioInputStream(new File("src/quan/Blank_Space_converted.wav"))); 
				jennysSong.open(AudioSystem.getAudioInputStream(new File("src/quan/Jenny_39_s_Song_converted.wav"))); 
				loveYourself.open(AudioSystem.getAudioInputStream(new File("src/quan/Love_Yourself_converted.wav"))); 
				noDistance.open(AudioSystem.getAudioInputStream(new File("src/quan/No_Distance_converted.wav"))); 
				sadSong.open(AudioSystem.getAudioInputStream(new File("src/quan/Sad_Song_converted.wav"))); 
				photograph.open(AudioSystem.getAudioInputStream(new File("src/quan/Photograph_converted.wav"))); 
				
				//ARRAY FOR AUDIO 
				Clip [] songAudio = {blankSpace, jennysSong, loveYourself, noDistance, sadSong, photograph};
				
				String [] songNames = {"\t Blank Space - Taylor Swift \t $1.50", "\t Jenny's Song - We the Kings \t $1.50", "\t Love Youself - Justin Bieber \t $1.50", "\t No Distance - Jason Chen \t $1.50", "\t Sad Song - We the Kings \t $1.50", "\t Photograph - Ed Sheeran \t $1.50"};
				String [] checkOut= new String [songNames.length];
		
		
				c.drawImage(utunes, 0, 0, 610, 200, null); // zero, zero, x, y  
				c.drawImage(start, 225, 200, 160, 100, null);
		
		
		
		for(int count2 = 0; count2 < songNames.length; count2++) //so the checkOut array doesn't display "<null>"
		{
			checkOut[count2] = ("");
		}
	
		//Mouse 
				c.addMouseListener(new MouseAdapter() 
				{ 
					public void mousePressed(MouseEvent me) 
					{
						x = me.getX();
						y = me.getY();
					//	c.println(x + ", " + y); //used to see coordinates
					} 
				});
				
		startMethod(); //START METHOD
		
		int currentSong = 0; //"Counter" for the song
		
		c.drawImage(layout, 8, 10, 650, 550, null); // display the background for the actually music layout 

			c.setCursor(14, 27); //set 
			c.println(songNames[currentSong]);
			c.drawImage(songPic[currentSong], 0, 100, 199, 300, null);
			
			// PLEASE LET THE PROGRAM LOAD A COUPLE OF SECOND AFTER EACH INPUT 
			
			while (true) //checking to see if user has input 
			{
				Thread.sleep(10);
				if((549 <= x && x <= 609) && (552 <= y && y <= 600)) //When NEXT is clicked 
				{
					
					clearXY(); // Used to clear the 
					if(currentSong == songNames.length-1)
					{
						c.setCursor(16, 27);
						c.println("That's all the songs we've got! Sorry.");
					}
					else
					{
						currentSong++; //increase index by one 
						c.setCursor(14, 27);
					    c.println(songNames[currentSong]);
					    
					    //to cover the any text that's also displayed at 16,27
					    c.setCursor(16,27);
					    c.println("");
					    
						c.drawImage(songPic[currentSong], 0, 100, 199, 300, null);
						
						Thread.sleep(20000); //plays for 20 seconds 
						songAudio[currentSong].stop(); 
						
					}
				} 
				if((472 <= x && x <= 530) && (553 <= y && y <= 599)) //When BACK is clicked 
				{
					clearXY(); 
					if(currentSong == 0)
					{
						c.setCursor(16, 27);
						c.println("Can't go back anymore! Sorry.");
					}
					else
					{
						currentSong--; //increase the index by one 
						c.setCursor(14, 27);
						
						//to cover the any text that's also displayed at 16,27
					    c.setCursor(16,27);
					    c.println("");
					    
						//c.println(songNames[currentSong]);
						c.drawImage(songPic[currentSong], 0, 100, 199, 300, null);
						songAudio[currentSong].stop(); 
						
					}	
				}	
				if((453 <= x && x <= 532) && (485 <= y && y <= 530)) //When ADD TO CART IS CLICKED 
				{
					
					clearXY(); 
					
					if(!checker[currentSong]) //when the song hasn't been added to the cart yet 
					{
						checker[currentSong] = true; 
						checkOut[currentSong] = songNames[currentSong]; //adds the song in the songName array into the checkOut array 
						c.setCursor(16,27);
						c.println("Successfully Added!");
						
					}
					else 
					{	
						c.setCursor(16, 27);
						c.println("Already added.");
					}
					
				}
				if ((552 <= x && x <= 631) && (120 <= y && y <= 532)) //When CHECKOUT is clicked 
				{
					c.clear();
					c.drawImage(utunes, 0, 0, 610, 200, null);
					c.setCursor(12, 5);
				
					 
					for (int count = 0;count < checkOut.length; count++) //to list all the songs added to the cart
					{	
						c.println(checkOut[count]);	
					}
					
					double songPrice=0;
			
					DecimalFormat round = new DecimalFormat ("0.00"); //Formating rounding 
					
					for(int count3 = 0; count3 < songNames.length; count3++) //to list the total price 
					{
					
						if(!checkOut[count3].equals(""))
						{
							
							songPrice = songPrice+1.50; //declaring the prices 
						}
					}
					c.println(" \t Total: \t $" + round.format(songPrice * 1.13)); //total cost of the songs 			
					
					close();
				}
				if ((213 <= x && x <= 357) && (220  <= y && y <= 284)) //When PLAY PREVIEW 
				{
					clearXY();
					
						songAudio[currentSong].start(); //start song 
						Thread.sleep(15000); //plays for 15 seconds 
						songAudio[currentSong].stop(); //stop song 
			
				}
				
				if ((624 <= x && x <= 657) && (92 <= y && y <= 143)) //when QUIT is clicked 
				{
					c.close();
				}
			} 
			
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			}
	}
		
				
	/**
	 * This method sees if the user clicks the start button 
	 * @param y - int
	 * @param x - int
	 */
public static void startMethod() throws InterruptedException 
{
	while (true)
	{
		
		Thread.sleep(10);
		if((258 <= x && x <= 388) && (297 <= y && y <= 349))
		{
			c.clear(); 
			break; 
		}
		close();
	}
}
/**
 * This method clears the x and y values 
 * @param y - int
 * @param x - int
 */
public static void clearXY()
{
	x = 0;
	y = 0; 
	
}
/**
 * This method sees if the usered clicked the quit button 
 * @param y - int
 * @param x - int
 */
public static void close() 
{
	if((591  <= x && x <= 622 ) && (76 <= y && y <= 110))
	{
		c.close();
	}
}
}


	

