import java.util.Scanner;

public class Lab2AreaPerimeterApp {

	/* 
	 * This code takes measurements of a room and calculates the area, perimeter 
	 * volume of a room, and continues on a loop until user is done.
	 * 
	 * Name: Mariah Hall
	 * Date: 10/8/2018
	 */
	
	public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       char continueInputs;   // variable to see if user wants to continue
       double roomLength;     // user's input for length
       double roomWidth;      // user's input for width
       double roomHeight;     // user's input for height
       double roomArea;       // computed area of user's room
       double roomPerimeter;  // computed perimeter of user's room
       double roomVolume;     // computed volume of user's room
       
       continueInputs = 'y';
                   
       while (continueInputs == 'y') {
    	  System.out.println("Enter room length in feet: ");
          roomLength = scnr.nextDouble();
          
          // verify that room's length is a valid measurement
          if (roomLength > 0) {
             System.out.println("Enter room width in feet: ");
             roomWidth = scnr.nextDouble();
             
             // verify that room's width is a valid measurement
             if (roomWidth > 0) {
                System.out.println("Enter room height in feet: ");
                roomHeight = scnr.nextDouble();
            
                // verify that room's height is a valid measurement
                if (roomHeight > 0) {
                   // formula of room's area a = l * w
                   roomArea = roomLength * roomWidth;
                   // formula of room's perimeter p = 2l + 2w
                   roomPerimeter = (2 * roomLength) + (2 * roomWidth);
                   // formula of room's volume v = l * w * h
                   roomVolume = roomLength * roomWidth * roomHeight; 
       
                   System.out.println("Area: " + roomArea + " feet.");
       
                   System.out.println("Perimeter: " + roomPerimeter + " feet.");
       
                   System.out.println("Volume: " + roomVolume + " cubic feet.");
       
                   System.out.print("Continue? (y/n): ");
                   continueInputs = scnr.next().charAt(0);
                }
                else {
                 	System.out.println("Measurements must be greater than zero. Try again.");
                 }
             }
             else {
             	System.out.println("Measurements must be greater than zero. Try again.");
             }
          }
       else {
          System.out.println("Measurements must be greater than zero. Try again.");
       }
       }
       
    scnr.close();
       
	}

}
