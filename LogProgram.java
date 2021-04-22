/*
* This program tells the user how many logs of a
* specific length a truck can carry.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-04-22
*/

import java.util.Scanner;  // Import the Scanner class

public final class LogProgram {
    private LogProgram() {

    }
   /**
   * lengths of logs for company 1.
   */
  public static final int OPTION1 = 0.25;
  /**
   * lengths of logs for company 2.
   */
  public static final int OPTION2 = 0.5;
  /**
   * lengths of logs for company 3.
   */
  public static final int OPTION3 = 1;
  /**
   * Total weight of truck.
   */
  public static final int WEIGHTTOTAL = 1000;
  /**
   * total weight of log per meter.
   */
  public static final int LOGWEIGHT = 20;
    /**
   * This function tells the user the number of logs a truck can carry
   * based on the number the user inputs.
   * @param args
   */
  public static void main(final String[] args) {

    // Input
    Scanner logInput = new Scanner(System.in);
    boolean inputValid = false;
    float lengthOfLogs = 0;
    do {
        System.out.println("Enter the length of logs needed"
            + " in meters: 0.25, 0.5, 1");
        if (logInput.hasNextFloat()) {
            lengthOfLogs = logInput.nextFloat();
            if (lengthOfLogs == OPTION1 || lengthOfLogs == OPTION2
                || lengthOfLogs == OPTION3) {
                inputValid = true;
            } else {
                System.out.println("Not Valid");
            }
        } else {
            System.out.println("Invalid length, please enter one"
            + " of the correct lengths: 0.25, 0.5, 1");
            logInput.next();
        }
    }
    while (!inputValid);

    // Process
    float numberOfLogs = WEIGHTTOTAL / (lengthOfLogs * LOGWEIGHT);

    // Output
    System.out.println("The truck can carry " + numberOfLogs + " "
    + lengthOfLogs + "m" + " logs.");
  }
}
