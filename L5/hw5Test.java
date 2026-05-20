import org.junit.Test;
import static org.junit.Assert.*;

public class hw5Test {
    // -------- USER STORY 1: Support user who is more familiar with kilometer metric
    
    // 1st test - Write test with CORRECT expected value, implementation doesn't exist yet so it will fail 
    // @Test
    // public void miles2KmTest(){
    //     assertEquals("miles2Km conversion failed", 1.60934, hw5.miles2Km(1.0), 0.00001);
    // }
    
    // Implementation 1: Hard-coded to make test pass
    // public static double miles2Km(double miles){
    //     return 1.60934;
    // }

    // 2nd test - Triangulation with different value to force out hard-coded implementation
    // @Test
    // public void miles2KmTestDifferentValue(){
    //     assertEquals("miles2Km conversion failed", 3.21868, hw5.miles2Km(2.0), 0.00001);
    // }
    
    // Implementation 2: Generalized to handle any value of miles
    // public static double miles2Km(double miles){
    //     return miles * 1.60934;
    // }

    // 3rd test - Another value to verify implementation works correctly
    // @Test
    // public void miles2KmTestThirdValue(){
    //     assertEquals("miles2Km conversion failed", 10.94354, hw5.miles2Km(6.8), 0.00001);
    // }
    // This test passed with existing implementation - no code change needed

    // 4th test - Refactored from 3rd test to be the final version
    @Test
    public void miles2KmTest(){
        assertEquals("miles2Km conversion failed", 10.94354, hw5.miles2Km(6.8), 0.00001);
    }

    // -------- USER STORY 2: Support user who is more familiar with miles metric
    
    // 1st test - Write test with CORRECT expected value
    // @Test
    // public void Km2milesTest(){
    //     assertEquals("Km2miles conversion failed", 0.621371, hw5.Km2miles(1.0), 0.00001);
    // }
    
    // Implementation 1: Hard-coded to make test pass
    // public static double Km2miles(double kilometers){
    //     return 0.621371;
    // }

    // 2nd test - Triangulation with different value
    // @Test
    // public void Km2milesTestDifferentValue(){
    //     assertEquals("Km2miles conversion failed", 1.24274, hw5.Km2miles(2.0), 0.00001);
    // }
    
    // Implementation 2: Generalized to handle any value of kilometers
    // public static double Km2miles(double kilometers){
    //     return kilometers * 0.621371;
    // }

    // 3rd test - Another value to verify implementation
    // @Test
    // public void Km2milesTestThirdValue(){
    //     assertEquals("Km2miles conversion failed", 4.22532, hw5.Km2miles(6.8), 0.00001);
    // }
    // This test passed with existing implementation - no code change needed

    // 4th test - Final version
    @Test
    public void Km2milesTest(){
        assertEquals("Km2miles conversion failed", 4.22532, hw5.Km2miles(6.8), 0.00001);
    }

    // -------- USER STORY 3: Support user who is more familiar with kelvin degree metric
    
    // 1st test - Write test with CORRECT expected value
    // @Test
    // public void kelvin2CelsiusTest(){
    //     assertEquals("kelvin2Celsius conversion failed", 26.85, hw5.kelvin2Celsius(300.0), 0.00001);
    // }
    
    // Implementation 1: Hard-coded to make test pass
    // public static double kelvin2Celsius(double kelvin){
    //     return 26.85;
    // }

    // 2nd test - Triangulation with different value
    // @Test
    // public void kelvin2CelsiusTestDifferentValue(){
    //     assertEquals("kelvin2Celsius conversion failed", 326.85, hw5.kelvin2Celsius(600.0), 0.00001);
    // }
    
    // Implementation 2: Generalized to handle any value of kelvin
    // public static double kelvin2Celsius(double kelvin){
    //     return kelvin - 273.15;
    // }

    // 3rd test - Another value to verify implementation
    // @Test
    // public void kelvin2CelsiusTestThirdValue(){
    //     assertEquals("kelvin2Celsius conversion failed", 626.85, hw5.kelvin2Celsius(900.0), 0.00001);
    // }
    // This test passed with existing implementation - no code change needed

    // 4th test - Final version using double for precision
    @Test
    public void kelvin2CelsiusTest(){
        assertEquals("kelvin2Celsius conversion failed", 626.85, hw5.kelvin2Celsius(900.0), 0.00001);
    }

    // -------- USER STORY 4: Support user who is more familiar with celsius metric
    
    // 1st test - Write test with CORRECT expected value 
    // @Test 
    // public void celsius2KelvinTest(){
    //     assertEquals("celsius2Kelvin conversion failed", 300.0, hw5.celsius2Kelvin(26.85), 0.00001);
    // }
    
    // Implementation 1: Hard-coded to make test pass
    // public static double celsius2Kelvin(double celsius){
    //     return 300.0;
    // }

    // 2nd test - Triangulation with different value
    // @Test 
    // public void celsius2KelvinTestDifferentValue(){
    //     assertEquals("celsius2Kelvin conversion failed", 600.0, hw5.celsius2Kelvin(326.85), 0.00001);
    // }
    
    // Implementation 2: Generalized to handle any value of celsius
    // public static double celsius2Kelvin(double celsius){
    //     return celsius + 273.15;
    // }

    // 3rd test - Final version, another value to verify
    @Test 
    public void celsius2KelvinTest(){
        assertEquals("celsius2Kelvin conversion failed", 900.0, hw5.celsius2Kelvin(626.85), 0.00001);
    }
}