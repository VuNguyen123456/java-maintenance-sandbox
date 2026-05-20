/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
        @version 3.0    February 2026  (Refactor + time conversions + configurable accuracy)
********************************************************************* */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class conversion
{
    // Digits past the decimal point (0-4)
    private int accuracy = 2; // default

    // Small functional interface (avoids needing Java 8+ functional packages)
    private interface Formula {
        double apply(double x);
    }

    // ---------- Refactored numeric helpers (shared by all conversions) ----------

    private double parseAndRoundInput(String valueAsStr) throws NumberFormatException {
        double raw = Double.parseDouble(valueAsStr.trim());
        return roundToAccuracy(raw);
    }

    private double roundToAccuracy(double value) {
        // BigDecimal is predictable for rounding (handles negative values, avoids Math.round quirks)
        return BigDecimal.valueOf(value)
                .setScale(accuracy, RoundingMode.HALF_UP)
                .doubleValue();
    }

    private String fmt(double value) {
        // Always show exactly "accuracy" digits so the user sees the effect of the setting
        return String.format(Locale.US, "%." + accuracy + "f", value);
    }

    private double convert(String inputAsStr, Formula f) {
        double in = parseAndRoundInput(inputAsStr);
        double out = f.apply(in);
        return roundToAccuracy(out);
    }

    // ---------- Conversions (thin wrappers; formulas only) ----------

    private double convertF2C(String FAsStr) {
        return convert(FAsStr, new Formula() {
            public double apply(double f) { return ((f - 32.0) * 5.0) / 9.0; }
        });
    }

    private double convertC2F(String CAsStr) {
        return convert(CAsStr, new Formula() {
            public double apply(double c) { return (c * 9.0 / 5.0) + 32.0; }
        });
    }

    // small distance
    private double convertIn2Cm(String inAsStr) {
        return convert(inAsStr, new Formula() {
            public double apply(double in) { return in * 2.54; }
        });
    }

    private double convertCm2In(String cmAsStr) {
        return convert(cmAsStr, new Formula() {
            public double apply(double cm) { return cm * 0.3937; }
        });
    }

    // medium distance
    private double convertM2Ft(String mAsStr) {
        return convert(mAsStr, new Formula() {
            public double apply(double m) { return m / 0.3048; }
        });
    }

    private double convertFt2M(String ftAsStr) {
        return convert(ftAsStr, new Formula() {
            public double apply(double ft) { return ft * 0.3048; }
        });
    }

    // large distance (miles <-> kilometers)
    private double convertMi2Km(String miAsStr) {
        return convert(miAsStr, new Formula() {
            public double apply(double mi) { return mi * 1.609; }
        });
    }

    private double convertKm2Mi(String kmAsStr) {
        return convert(kmAsStr, new Formula() {
            public double apply(double km) { return km * 0.6214; }
        });
    }

    // volume
    private double convertGal2L(String galAsStr) {
        return convert(galAsStr, new Formula() {
            public double apply(double gal) { return gal * 3.785; }
        });
    }

    private double convertL2Gal(String LAsStr) {
        return convert(LAsStr, new Formula() {
            public double apply(double L) { return L / 3.785; }
        });
    }

    // small weight
    private double convertOz2G(String ozAsStr) {
        return convert(ozAsStr, new Formula() {
            public double apply(double oz) { return oz * 28.35; }
        });
    }

    private double convertG2Oz(String gAsStr) {
        return convert(gAsStr, new Formula() {
            public double apply(double g) { return g / 28.35; }
        });
    }

    // medium weight
    private double convertLb2Kg(String lbAsStr) {
        return convert(lbAsStr, new Formula() {
            public double apply(double lb) { return lb * 0.4536; }
        });
    }

    private double convertKg2Lb(String kgAsStr) {
        return convert(kgAsStr, new Formula() {
            public double apply(double kg) { return kg * 2.205; }
        });
    }

    // time (new)
    private double convertH2S(String hAsStr) {
        return convert(hAsStr, new Formula() {
            public double apply(double h) { return h * 3600.0; }
        });
    }

    private double convertS2H(String sAsStr) {
        return convert(sAsStr, new Formula() {
            public double apply(double s) { return s / 3600.0; }
        });
    }

    // ---------- CLI / UI ----------

    private static void printMenu(int currentAccuracy) {
        System.out.println("======================================================================================");
        System.out.println("=== Unit Conversion (CLI) ===");
        System.out.println("Decimal accuracy: " + currentAccuracy + " digits past the decimal point");
        System.out.println();
        System.out.println("0) Set decimal accuracy (0-4)");
        System.out.println();
        System.out.println("Temperature:");
        System.out.println("1) Fahrenheit (F) -> Celsius    (C)");
        System.out.println("2) Celsius    (C) -> Fahrenheit (F)");
        System.out.println();
        System.out.println("Small distance:");
        System.out.println("3) Inch       (in) -> Centimeter (cm)");
        System.out.println("4) Centimeter (cm) -> Inch       (in)");
        System.out.println();
        System.out.println("Medium distance:");
        System.out.println("5) Meter (m)  -> Feet (ft)");
        System.out.println("6) Feet (ft)  -> Meter (m)");
        System.out.println();
        System.out.println("Large distance:");
        System.out.println("7) Mile      (mi) -> Kilometer (km)");
        System.out.println("8) Kilometer (km) -> Mile      (mi)");
        System.out.println();
        System.out.println("Volume:");
        System.out.println("9)  Gallon (gal) -> Liter  (L)");
        System.out.println("10) Liter  (L)   -> Gallon (gal)");
        System.out.println();
        System.out.println("Small weight:");
        System.out.println("11) Ounce (oz) -> Gram  (g)");
        System.out.println("12) Gram  (g)  -> Ounce (oz)");
        System.out.println();
        System.out.println("Medium weight:");
        System.out.println("13) Pound    (lb) -> Kilogram (kg)");
        System.out.println("14) Kilogram (kg) -> Pound    (lb)");
        System.out.println();
        System.out.println("Time:");
        System.out.println("15) Hours   (h) -> Seconds (s)");
        System.out.println("16) Seconds (s) -> Hours   (h)");
        System.out.println();
        System.out.println("q) Quit");
        System.out.println("======================================================================================");
    }

    private void promptForAccuracy(Scanner sc) {
        System.out.print("Enter decimal accuracy (0-4): ");
        String accStr = sc.nextLine().trim();
        try {
            int acc = Integer.parseInt(accStr);
            if (acc < 0 || acc > 4) {
                System.out.println("Invalid accuracy. Keeping current (" + accuracy + ").");
                return;
            }
            accuracy = acc;
            System.out.println("Accuracy set to " + accuracy + ".");
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid accuracy. Keeping current (" + accuracy + ").");
        }
        System.out.println();
    }

    private void runConversion(String choice, String valueStr) {
        // Dispatch is intentionally small (only routes to formulas);
        // formulas + rounding behavior are centralized in convert().
        double result;

        switch (choice) {
            case "1": result = convertF2C(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " F = " + fmt(result) + " C"); break;
            case "2": result = convertC2F(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " C = " + fmt(result) + " F"); break;

            case "3": result = convertIn2Cm(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " in = " + fmt(result) + " cm"); break;
            case "4": result = convertCm2In(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " cm = " + fmt(result) + " in"); break;

            case "5": result = convertM2Ft(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " m = " + fmt(result) + " ft"); break;
            case "6": result = convertFt2M(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " ft = " + fmt(result) + " m"); break;

            case "7": result = convertMi2Km(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " mi = " + fmt(result) + " km"); break;
            case "8": result = convertKm2Mi(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " km = " + fmt(result) + " mi"); break;

            case "9": result = convertGal2L(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " gal = " + fmt(result) + " L"); break;
            case "10": result = convertL2Gal(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " L = " + fmt(result) + " gal"); break;

            case "11": result = convertOz2G(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " oz = " + fmt(result) + " g"); break;
            case "12": result = convertG2Oz(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " g = " + fmt(result) + " oz"); break;

            case "13": result = convertLb2Kg(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " lb = " + fmt(result) + " kg"); break;
            case "14": result = convertKg2Lb(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " kg = " + fmt(result) + " lb"); break;

            case "15": result = convertH2S(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " h = " + fmt(result) + " s"); break;
            case "16": result = convertS2H(valueStr); System.out.println(fmt(parseAndRoundInput(valueStr)) + " s = " + fmt(result) + " h"); break;

            default:
                throw new IllegalArgumentException("Unknown option '" + choice + "'.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conversion app = new conversion();

        while (true) {
            printMenu(app.accuracy);
            System.out.print("Choose an option (0-16) or q to quit: ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Goodbye.");
                break;
            }

            if (choice.equals("0")) {
                app.promptForAccuracy(sc);
                continue;
            }

            // Validate option is in range
            int number;
            try {
                number = Integer.parseInt(choice);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: please enter a number corresponding to the menu options (or q to quit).\n");
                continue;
            }
            if (number < 1 || number > 16) {
                System.out.println("Error: please choose a valid option from the menu.\n");
                continue;
            }

            System.out.print("Enter value: ");
            String valueStr = sc.nextLine().trim();

            try {
                app.runConversion(choice, valueStr);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: please enter a valid number (e.g., 12.5).");
            } catch (IllegalArgumentException iae) {
                System.out.println("Error: " + iae.getMessage());
            }

            System.out.println();
        }

        sc.close();
    }
}
