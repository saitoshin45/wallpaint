import java.awt.Color;
import java.util.Random;

public class Saitopaint {

	public static void main(String[] args) {
		// Set up the EZ grpahics

		// generate a window size of 1024x768
		EZ.initialize(1024, 768);

		// generate an interger variable called clickX and clickY
		int clickX = 0;
		int clickY = 0;
		
		Random randomarea;
		randomarea = new Random();
		int randomInt = randomarea.nextInt(40);
		
		int offsetX = clickX + randomInt;
		int offsetY = clickY + randomInt;
		
		// generate the background of the game by assiging a background picture called
		
		EZImage wallPaper = EZ.addImage("bwall1.png", 512, 384);

		// generate the spray can image by assigning it to a variable called sprayCan
		EZImage sprayCan = EZ.addImage("spraycana.png", 512, 384);

		// generate a EZImage variable called logo
		EZImage logo;
		EZImage logoA = null;
		EZImage logoB;
		
		//generate a sound variable called soundA and soundB
		EZSound SoundA = EZ.addSound("eevee.wav");
		EZSound SoundB = EZ.addSound("pika.wav");
		

		// create a integer variable fontsize for the game and set it equal to 50
		int fontsize = 100;

		// generate the color for the font

		// generate the text to notify the user to start the game
		EZText text = EZ.addText(512, 40, "Get Creative!!!", new Color(0, 0, 0), fontsize);
		text.setFont("Super Creative.ttf");
		int spraycolor = 1;
		// begin a loop statement
		while (true) 
		{
			// get the position of the mouse
			clickX = EZInteraction.getXMouse();
			clickY = EZInteraction.getYMouse();
			// move the picture of the spray can to the clicked coordinate
			sprayCan.translateTo(clickX, clickY);
			
			//generate a variables for the random system called the random area 
			randomarea = new Random();
			randomInt = randomarea.nextInt(40);
			//update the offset by adding the coordinates of the mouse with a random integer 
			offsetX = clickX + randomInt;
			offsetY = clickY + randomInt;

				///if the user presses the one key 
				 if (EZInteraction.wasKeyPressed('1'))
					{
					 //play the sound 
					 SoundB.play();
					 //set the spraycolor into 1
						spraycolor=1;
					}
				 
				 //otherwise the user presses the two key 
				 else if(EZInteraction.wasKeyPressed('2'))
					{
					 //set the spraycolor into 2
					 spraycolor =2;
					 //initiate the sound 
					 SoundA.play();
					}
				//when the user pressses the left side of the mouse
				 if(EZInteraction.isMouseLeftButtonDown())
				 {
				//if the spraycolor is one 
				 if (spraycolor==1)
					{
					if(EZInteraction.isMouseLeftButtonDown())
					//add the logo for the spray can 1 at the random location based off the mouse
					logoA =EZ.addImage("logoA.png", offsetX, offsetY);
					logoA.pushBackOneLayer();
					}
				//if the spraycolor is 2	
				else if(spraycolor==2)
					{	
					//add the logo for the spray can 2 
					logoB =EZ.addImage("logoB.png", offsetX, offsetY);
					logoB.pushBackOneLayer();
					}
				 }
				 //refresh the EZ screen 
				 EZ.refreshScreen();			
		}
				
				
				}
				
			
		
	

		
	
	





}


















	
	
