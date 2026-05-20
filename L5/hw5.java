public class hw5 {
    // -------- USER STORY 1: Support user who is more familiar with kilometers metric
    
    // 1st implementation - Hard-coded conversion factor to make first test pass (FAKING)
    // public static double miles2Km(double miles){
    //     return 1.60934;
    // }

    // 2nd implementation - Refactoring removing hardcode, allowing for any value of miles to be converted to kilometers
    // public static double miles2Km(double miles){
    //     return miles * 1.60934;
    // }

    // 3rd implementation - Final version with proper conversion factor
    public static double miles2Km(double miles){
        return miles * 1.609344;
    }

    // -------- USER STORY 2: Support user who is more familiar with miles metric
    
    // 1st implementation - Hard-coded conversion factor to make first test pass (FAKING)
    // public static double Km2miles(double kilometers){
    //     return 0.621371;
    // }

    // 2nd implementation - Refactoring removing hardcode, allowing for any value of km to be converted to miles
    // public static double Km2miles(double kilometers){
    //     return kilometers * 0.621371;
    // }

    // 3rd implementation - Final version
    public static double Km2miles(double kilometers){
        return kilometers * 0.621371;
    }

    // -------- USER STORY 3: Support user who is more familiar with kelvin degree metric
    
    // 1st implementation - Hard-coded conversion to make first test pass (FAKING)
    // public static double kelvin2Celsius(double kelvin){
    //     return 26.85;
    // }

    // 2nd implementation - Refactoring removing hardcode, allowing for any value of kelvin to be converted to celsius
    // public static double kelvin2Celsius(double kelvin){
    //     return kelvin - 273.15;
    // }

    // 3rd implementation - Final version
    public static double kelvin2Celsius(double kelvin){
        return kelvin - 273.15;
    }

    // -------- USER STORY 4: Support user who is more familiar with celsius metric
    
    // 1st implementation - Hard-coded conversion to make first test pass (FAKING)
    // public static double celsius2Kelvin(double celsius){
    //     return 300.0;
    // }

    // 2nd implementation - Refactoring removing hardcode, allowing for any value of celsius to be converted to kelvin
    public static double celsius2Kelvin(double celsius){
        return celsius + 273.15;
    }
}