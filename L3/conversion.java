/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
********************************************************************* */
// Import Java Libraries

import java.lang.*;
import java.util.*;

// conversion class
//
// CONSTRUCTOR: no constructor specified (default)
//
// ****************  PUBLIC OPERATIONS  **********************************
// void  doGet()      --> Uses PrintHead() and PrintForm() to print the screen
// void  PrintHead()  --> Generates the head of the web page
// void  PrintForm()  --> Generates the form of the web page
// void  doPost()     --> Handles the conversions
// float convertX2Y() --> One for each conversion pair
//*************************************************************************
//
// The possible IOException on the PrintWriter is thrown up.

public class conversion 
{
    // Refactoring duplicate code:
    private float roundToTwoDecimals(String strNum) {
        float num = Float.parseFloat(strNum);
        int n = Math.round(num * 100.0f);
        return n / 100.0f;
    }

    private float backToTwoDecimals(float num) {
        int n = Math.round(num * 100.0f);
        return n / 100.0f;
    }

    private float convertF2C (String FAsStr)
    {  // Convert farenheit to celsius
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(FAsStr);
        // Convert
        num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return (num2);
    }

    private float convertC2F (String CAsStr)
    {  // Convert celsius to farenheit
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(CAsStr);
        // Convert
        num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return (num2);
    }

    // small distance
    private float convertIn2Cm (String inAsStr)
    {  // Convert inches to centimeters
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(inAsStr);
        // Convert
        num2 = (float) (num1 * 2.54);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertCm2In (String cmAsStr)
    {  // Convert centimeters to inches
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(cmAsStr);
        // Convert
        num2 = (float) (num1 * 0.3937);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    // medium distance
    private float convertF2M (String ftAsStr)
    {  // Convert feet to meters
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(ftAsStr);
        // Convert
        num2 = (float) (num1 * 0.3048);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertM2F (String mAsStr)
    {  // Convert meters to feet
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(mAsStr);
        // Convert
        num2 = (float) (num1 / 0.3048);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    // large distance
    private float convertM2K (String miAsStr)
    {  // Convert miles to kilometers
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(miAsStr);
        // Convert
        num2 = (float) (num1 * 1.609);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertK2M (String kmAsStr)
    {  // Convert kilometers to miles
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(kmAsStr);
        // Convert
        num2 = (float) (num1 * 0.6214);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    // volume
    private float convertG2L (String galAsStr)
    {  // Convert gallons to liters
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(galAsStr);
        // Convert
        num2 = (float) (num1 * 3.785);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertL2G (String LAsStr)
    {  // Convert liters to gallons
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(LAsStr);
        // Convert
        num2 = (float) (num1 / 3.785);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    // small weight
    private float convertOz2G (String ozAsStr)
    {  // Convert ounces to grams
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(ozAsStr);
        // Convert
        num2 = (float) (num1 * 28.35);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertG2Oz (String gAsStr)
    {  // Convert grams to ounces
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(gAsStr);
        // Convert
        num2 = (float) (num1 / 28.35);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    // medium weight
    private float convertLb2K (String lbAsStr)
    {  // Convert pounds to kilograms
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(lbAsStr);
        // Convert
        num2 = (float) (num1 * 0.4536);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertK2Lb (String kgAsStr)
    {  // Convert kilograms to pounds
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(kgAsStr);
        // Convert
        num2 = (float) (num1 * 2.205);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }

    private float convertH2s (String hAsStr)
    {  // Convert hours to seconds
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundToTwoDecimals(hAsStr);
        // Convert
        num2 = (float) (num1 * 3600.0);
        // Back to 2 digits
        num2 = backToTwoDecimals(num2);
        return(num2);
    }
    public static void main(String []args)
    {
        // Create a Scanner for user input and an instance of the conversion class
        Scanner sc = new Scanner(System.in);
        // Create an instance of the conversion class to call the (currently private) convert methods
        // Must have due to main being static and the convert methods being non-static (and private)
        conversion app = new conversion();

        while (true) {
            printMenu();
            System.out.print("Choose an option (or q to quit): ");
            String choice = sc.nextLine().trim();

            // Check for quit option
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Goodbye.");
                break;
            }

            // Validate that the choice is a number and corresponds to a menu option
            try {
                int number = Integer.parseInt(choice);
                if (number < 1 || number > 15) {
                    System.out.println("Error: please choose a valid option from the menu.");
                    System.out.println();
                    continue;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Error: please enter a number corresponding to the menu options (or q to quit).");
                System.out.println();
                continue;
            }

            // Validate menu choice
            System.out.print("Enter value: ");
            String valueStr = sc.nextLine().trim();

            // Attempt to perform the conversion and handle any exceptions that may arise from invalid input
            try {
                float result = app.dispatch(choice, valueStr);
                System.out.println("Result: " + result);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: please enter a valid number (e.g., 12.5).");
            } catch (IllegalArgumentException iae) {
                System.out.println("Error: " + iae.getMessage());
            }

            System.out.println();
        }

        sc.close();
    }

    // Prints the conversion menu to the console
    private static void printMenu() 
    {    
        System.out.println("======================================================================================");

        System.out.println("=== Unit Conversion (CLI) ===");
        System.out.println("Temperature:");
        System.out.println("1) Fahrenheit (F) -> Celsius    (C)");
        System.out.println("2) Celsius    (C) -> Fahrenheit (F)");

        System.out.println();
        System.out.println("Small distance:");
        System.out.println("3) Inch       (in) -> Centimeter (cm)");
        System.out.println("4) Centimeter (cm) -> Inch       (in)");

        System.out.println();
        System.out.println("Medium distance:");
        System.out.println("5) Meter (m)  -> Feet  (ft)");
        System.out.println("6) Feet  (ft) -> Meter (m)");

        System.out.println();
        System.out.println("Large distance:");
        System.out.println("7) Meter     (m)  -> Kilometer (km)");
        System.out.println("8) Kilometer (km) -> Meter     (m)");

        System.out.println();
        System.out.println("Volume:");
        System.out.println("9)  Gallon (gal) -> Litre  (L)");
        System.out.println("10) Litre  (L)   -> Gallon (gal)");

        System.out.println();
        System.out.println("Small weight:");
        System.out.println("11) Ounce (oz) -> gram  (g)");
        System.out.println("12) gram  (g)  -> Ounce (oz)");

        System.out.println();
        System.out.println("Medium weight:");
        System.out.println("13) pound    (lb) -> kilogram (kg)");
        System.out.println("14) kilogram (kg) -> pound    (lb)");

        System.out.println();
        System.out.println("Time:");
        System.out.println("15) Hours (h) -> Seconds (s)");

        System.out.println();
        System.out.println("q) Quit\n");
    }

    // Dispatches the conversion based on user choice
    private float dispatch(String choice, String valueStr) 
    {
        switch (choice) {
            case "1": return convertF2C(valueStr);
            case "2": return convertC2F(valueStr);

            case "3": return convertIn2Cm(valueStr);
            case "4": return convertCm2In(valueStr);

            case "5": return convertM2F(valueStr);
            case "6": return convertF2M(valueStr);

            case "7": return convertM2K(valueStr);
            case "8": return convertK2M(valueStr);

            case "9": return convertG2L(valueStr);
            case "10": return convertL2G(valueStr);

            case "11": return convertOz2G(valueStr);
            case "12": return convertG2Oz(valueStr);

            case "13": return convertLb2K(valueStr);
            case "14": return convertK2Lb(valueStr);

            case "15": return convertH2s(valueStr);

        default:
            throw new IllegalArgumentException("Unknown option '" + choice + "'.");
        }
    }
}