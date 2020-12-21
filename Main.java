/*
* The Main program implements an application that
* can find info on a triangle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2020-12-20
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {
      
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
                          + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("");
    System.out.println("                 Angle A                "
                          + '\n' + "                    /\\                  "
                          + '\n' + "                   /  \\                "
                          + '\n' + "                  /    \\                "
                          + '\n' + "          side c /      \\ side b        "
                          + '\n' + "                /        \\              "
                          + '\n' + "               /          \\             "
                          + '\n' + "              /            \\            "
                          + '\n' + "     Angle B /______________\\ Angle C   "
                          + '\n' + "                  side a                 "
                          + '\n');
    System.out.println("");

    // Variables for later.
    final int maxInputs = 3;
    String whichSide;
    int error = 0;

    whichSide = "a";
    
    // Creating Triangle.
    Triangle someTriangle = new Triangle();

    // Creating a scanner.
    Scanner scanSideLength = new Scanner(System.in);

    // Getting side length.
    System.out.println("");
    System.out.println("Input the length of side " + whichSide + ":");
    String sideLength = scanSideLength.nextLine();

    String returnValue = someTriangle.setSideLength(sideLength, whichSide);

    if (returnValue.equals("-1")) {
      error = 1;
      System.out.println("");
      System.out.println("ERROR: Failed to set side length");
      System.out.println("");
    }

    whichSide = "b";
    // Getting side length.
    System.out.println("");
    System.out.println("Input the length of side " + whichSide + ":");
    sideLength = scanSideLength.nextLine();

    returnValue = someTriangle.setSideLength(sideLength, whichSide);
    
    if (returnValue.equals("-1")) {
      error = 1;
      System.out.println("");
      System.out.println("ERROR: Failed to set side length");
      System.out.println("");
    }

    whichSide = "c";
    // Getting side length.
    System.out.println("");
    System.out.println("Input the length of side " + whichSide + ":");
    sideLength = scanSideLength.nextLine();

    returnValue = someTriangle.setSideLength(sideLength, whichSide);

    if (returnValue.equals("-1")) {
      error = 1;
      System.out.println("");
      System.out.println("ERROR: Failed to set side length");
      System.out.println("");
    }

    if (error != 1) {
      String type = someTriangle.getName();
      double peremeter = someTriangle.getPeremeter();
      double area = someTriangle.getArea();
      if (type.equals("-1")) {
        System.out.println("");
        System.out.println("ERROR: INVALID TRIANGLE");
      } else {
        System.out.println("");
        System.out.println("The triangle is a: " + type + " triangle");
        System.out.println("The peremeter is: " + peremeter);
        System.out.println("The area is: " + area);
      }
      
    }
  }
}
