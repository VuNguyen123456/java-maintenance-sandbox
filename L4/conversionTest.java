import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class conversionTest {
    // Create a new conversion object
    private conversion converter;

    // Set up the conversion object
    @Before
    public void setUp() {
        converter = new conversion();
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertF2C() {
        assertEquals("102°F should convert to ~38.89°C", 38.89, converter.convertF2C("102"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertC2F() {
        assertEquals("70°C should convert to ~158°F", 158.00, converter.convertC2F("70"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertIn2Cm() {
        assertEquals("4 in should convert to ~10.16 cm", 10.16, converter.convertIn2Cm("4"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertCm2In() {
        assertEquals("10 cm should convert to ~3.94 in", 3.94, converter.convertCm2In("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertM2Ft() {
        assertEquals("5.5 m should convert to ~18.04 ft", 18.04, converter.convertM2Ft("5.5"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertFt2M() {
        assertEquals("10 ft should convert to ~3.05 m", 3.05, converter.convertFt2M("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertMi2Km() {
        assertEquals("10 mi should convert to ~16.09 km", 16.09, converter.convertMi2Km("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertKm2Mi() {
        assertEquals("10 km should convert to ~6.21 mi", 6.21, converter.convertKm2Mi("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertGal2L() {
        assertEquals("5.7 gal should convert to ~21.57 L", 21.57, converter.convertGal2L("5.7"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertL2Gal() {
        assertEquals("10 L should convert to ~2.64 gal", 2.64, converter.convertL2Gal("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertOz2G() {
        assertEquals("8 oz should convert to ~226.80 g", 226.80, converter.convertOz2G("8"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertG2Oz() {
        assertEquals("100.3 g should convert to ~3.54 oz", 3.54, converter.convertG2Oz("100.3"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertLb2Kg() {
        assertEquals("10.2 lb should convert to ~4.63 kg", 4.63, converter.convertLb2Kg("10.2"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertKg2Lb() {
        assertEquals("10 kg should convert to ~22.05 lb", 22.05, converter.convertKg2Lb("10"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertH2S() {
        assertEquals(7200.00, converter.convertH2S("2"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testConvertS2H() {
        assertEquals("7200 s should convert to 2 h", 2.00, converter.convertS2H("7200"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this because either the expected exception is thrown (test passes) or not (test fails) which will show up in the test results.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test(expected = NumberFormatException.class)
    public void testConvertC2F_Invalid() {
        converter.convertC2F("ocd");
    }

    // observability: high, it's very easy to observe the behavior of this method by checking the output value for a given input (via google). And the error message is clear when the input is invalid.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test
    public void testParseAndRoundInput() {
        assertEquals("parseAndRoundInput(\"10.5\") should return 10.50", 10.50, converter.parseAndRoundInput("10.5"), 0.01);
    }

    // observability: high, it's very easy to observe the behavior of this because either the expected exception is thrown (test passes) or not (test fails) which will show up in the test results.
    // controllability: high, it's very easy to provide the program with needed input just change the input number in the test case and input a correct oracle test to verify it. For the program, just input a different input via keyboard from Command Line Interface if you want to test a different input.
    @Test(expected = NumberFormatException.class)
    public void testParseAndRoundInput_Invalid() {
        converter.parseAndRoundInput("abc");
    }
}
