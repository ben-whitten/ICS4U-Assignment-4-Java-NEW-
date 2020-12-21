/*
* The Triangle program implements an application that
* creates a triangle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2020-12-20
*/

///////////////////////////////////////////////////////////////////////////////

public class Triangle {

  // variables for later.
  private int intSideLength;
  private double sideA;
  private double sideB;
  private double sideC;
  private String returnValue;
  private String type;
  private double temp;
  private double temp2;
  private double peremeter;

  /**
   * THE SIDE LENGTHS.
   */
  /////////////////////////////////////////////////////////////////////////////
  public String setSideLength(String sideLength, String whichSide) {
    if (whichSide.equals("a")) {
      returnValue = setSideA(sideLength);

    } else if (whichSide.equals("b")) {
      returnValue = setSideB(sideLength);

    } else if (whichSide.equals("c")) {
      returnValue = setSideC(sideLength);

    } else {
      returnValue = "-1";
    }

    return returnValue;
  }

  protected String setSideA(String sideLength) {
    try {
      intSideLength = Integer.parseInt(sideLength);
      sideA = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setSideB(String sideLength) {
    try {
      intSideLength = Integer.parseInt(sideLength);
      sideB = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setSideC(String sideLength) {
    try {
      intSideLength = Integer.parseInt(sideLength);
      sideC = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  /////////////////////////////////////////////////////////////////////////////

  /**
   * Getperemeter function.
   */
  public double getPeremeter() {
    returnValue = isTriangleValid();
    if (returnValue.equals("-1")) {
      peremeter = 0;
    } else {
      peremeter = sideA + sideB + sideC;
    }
    return peremeter;
  }

  /**
   * Getarea function.
   */
  public double getArea() {
    returnValue = isTriangleValid();
    double area;
    if (returnValue.equals("-1")) {
      area = 0;
    } else {
      double semiperimeter = (peremeter / 2);
      area = Math.sqrt(semiperimeter * (semiperimeter - sideA)
                       * (semiperimeter - sideB)
                       * (semiperimeter - sideC));
    }
    return area;
  }

  /**
   * Getname fuction.
   */
  public String getName() {
    returnValue = isTriangleValid();

    if ((sideA > sideB) && (sideA > sideC)) {
      temp = Math.pow(sideA, 2);
      temp2 = Math.pow(sideB, 2) + Math.pow(sideC, 2);
      if (temp < temp2) {
        type = "Acute";
      } else if (temp > temp2) {
        type = "Obtuse";
      } else if (temp == temp2) {
        type = "Right angle";
      }

    } else if ((sideB > sideA) && (sideB > sideC)) {
      temp = Math.pow(sideB, 2);
      temp2 = Math.pow(sideA, 2) + Math.pow(sideC, 2);
      if (temp < temp2) {
        type = "Acute";
      } else if (temp > temp2) {
        type = "Obtuse";
      } else if (temp == temp2) {
        type = "Right angle";
      }

    } else if ((sideC > sideA) && (sideC > sideB)) {
      temp = Math.pow(sideC, 2);
      temp2 = Math.pow(sideA, 2) + Math.pow(sideB, 2);
      if (temp < temp2) {
        type = "Acute";
      } else if (temp > temp2) {
        type = "Obtuse";
      } else if (temp == temp2) {
        type = "Right angle";
      }
    } 

    if (returnValue.equals("-1")) {
      type = "-1";
    }
    return type;

  }

  protected String isTriangleValid() {
    if ((sideA > sideB) && (sideA > sideC)) {
      if (sideA > (sideB + sideC)) {
        returnValue = "-1";
      }
    } else if ((sideC > sideB) && (sideC > sideA)) {
      if (sideC > (sideB + sideA)) {
        returnValue = "-1";
      }
    } else if ((sideB > sideA) && (sideB > sideC)) {
      if (sideB > (sideA + sideC)) {
        returnValue = "-1";
      }
    } else if (sideA < 0) {
      returnValue = "-1";
    } else if (sideB < 0) {
      returnValue = "-1";
    } else if (sideC < 0) {
      returnValue = "-1";
    } else {
      returnValue = "1";
    }
    
    return returnValue;
    
  }
}
