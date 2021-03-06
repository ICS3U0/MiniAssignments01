/*
*User: 657921
*Teacher: Mr.King
*Class: ICS3UO - Room 123, Period: 3 - 4
*/

/*This is a MiniProject, There are about 3 MiniProjects all contained in one*/

import java.util.Scanner;
import java.lang.Math.*;

class Main {
  public static void main(String[] args) {
    // ---------------------------------START---------------------------------
    /*
     * This code is for printing out the area of a rectangle given lenght and width
     * by the user.
     */
    Scanner ScanThis = new Scanner(System.in); //Takes in the date from the user
    System.out.println("Please provide both lenght and width:"); //Print statement that asks the user to provide lenght and width

    System.out.print("Lenght: "); //User inputs lenght here
    int Lenght = ScanThis.nextInt(); //Takes user input and sets it to variable int Lenght

    System.out.print("Witdh: "); //User inputs width here
    int Width = ScanThis.nextInt(); //Takes user input and sets it to variable int Width

    System.out.printf("The rectangles area is: %d and perimeter is %d", Lenght * Width, (2 * Lenght) + (2 * Width)); /*Prints out the user 
    result using the formula provided to solve for the area*/
    // ----------------------------------END---------------------------------

    // ---------------------------------START---------------------------------
    /*
     * This code is for printing out the radious of a circle given input by the user
     */
    Scanner RadiousScan = new Scanner(System.in);
    System.out.println();
    System.out.println("Please provide the Circumference of the Circle:");

    System.out.print("Circumference: ");
    double Radious = RadiousScan.nextDouble();
    int Value = (int) Radious;

    System.out.printf("The Area of the Circle is : %.15f ", Math.PI * Math.pow(Value, 2));
    // ----------------------------------END---------------------------------

    // ---------------------------------START---------------------------------
    /*
     * This is the code that is used in order to solve the Volume for a cylinder
     * given height and Radious by the user
     */
    Scanner RadiousHeight = new Scanner(System.in);
    System.out.println();
    System.out.println("Please provide the values height and radious in order to solve for cylinder.");

    System.out.print("Radious: ");
    double CylinderRadious = RadiousHeight.nextDouble();

    System.out.print("Height: ");
    double CylinderHeight = RadiousHeight.nextDouble();

    System.out.printf("The volume of the Cylinder is: %f", Math.PI * (Math.pow(CylinderRadious, 2) * CylinderHeight));
    // ----------------------------------END---------------------------------
  }
}
