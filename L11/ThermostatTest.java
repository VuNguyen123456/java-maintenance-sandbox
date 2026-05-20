import org.junit.*;
import static org.junit.Assert.*;

import java.time.Period;

// Part 1: fix the test (with adding regulator)
// 1. 
// New variable is given in the code (regulator)
// Original test doesn't check for this new condition in the new code:
// if (override && regulator)

// So this part in the old code is changed but the test didn't reflect that:

// Old:
// int timeNeeded = Math.abs(dTemp - curTemp); // abs() added May 2020
// if (override)
//     timeNeeded = Math.abs(overTemp - curTemp); // abs() added May 2020

// New:
// if (override && regulator)
//    timeNeeded = (curTemp - overTemp)/2;
// else if (override)
//    timeNeeded = curTemp - overTemp;

// => Update test so that regulator variable is being controled acordingly
public class ThermostatTest
{
   private Thermostat thermo;
   private ProgrammedSettings settings;

   @Before
   public void setUp()
   {
      thermo   = new Thermostat();
      settings = new ProgrammedSettings();
      thermo.setThresholdDiff(1);

      // new: ensure consistent behavior with old tests
      thermo.setRegulator(false);
   }

   // Predicate: (a || (b && c)) && d

   @Test public void testTTTT()
   {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);

      thermo.setCurrentTemp(68);
      thermo.setTimeSinceLastRun(10);
      thermo.setMinLag(5);

      thermo.setOverride(true);
      thermo.setRegulator(false); // new 

      thermo.setOverTemp(72);

      assertTrue(thermo.turnHeaterOn(settings));
   }

   @Test public void testFFFF()
   {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);

      thermo.setCurrentTemp(70);
      thermo.setTimeSinceLastRun(7);
      thermo.setMinLag(7);

      thermo.setOverride(false);
      thermo.setRegulator(false); // new

      thermo.setOverTemp(70);

      assertFalse(thermo.turnHeaterOn(settings));
   }

   @Test public void testPCtrue()
   {
      thermo   = new Thermostat();
      settings = new ProgrammedSettings();

      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);

      // Clause a = true
      thermo.setCurrentTemp(63);
      thermo.setThresholdDiff(5);

      // Clause b = true
      thermo.setOverride(true);
      thermo.setRegulator(false); // new

      // Clause c = true
      thermo.setOverTemp(70);

      // Clause d = true
      thermo.setMinLag(10);
      thermo.setTimeSinceLastRun(12);

      assertTrue(thermo.turnHeaterOn(settings));
   }

   // 2. CACC: Each clause must independently determine the value of the predicate
   // Show ovverride determines P:
   // P = overide && regulator
   // regulator = T
   // So: 
   // (override = T) && T => P = T
   // (override = F) && T => P = F
   // => determine P

   // override = T
   // So: 
   // (regulator = T) && T => P = T
   // (regulator = F) && T => P = F
   // => determine P
   @Test
   public void testRegulatorDeterminesPredicate()
   {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);

      thermo.setCurrentTemp(60);
      thermo.setThresholdDiff(1);
      thermo.setTimeSinceLastRun(10);
      thermo.setMinLag(5);
      thermo.setOverTemp(80);

      // Case 1
      thermo.setOverride(true);
      thermo.setRegulator(true);

      thermo.turnHeaterOn(settings);
      int runtime1 = thermo.getRunTime();

      // Case 2
      thermo.setOverride(true);
      thermo.setRegulator(false);

      thermo.turnHeaterOn(settings);
      int runtime2 = thermo.getRunTime();

      assertNotEquals(runtime1, runtime2);
   }

   @Test
   public void testOverrideDeterminesPredicate()
   {
      // Base setup (same as others — important!)
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 70);
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);

      thermo.setCurrentTemp(60);
      thermo.setThresholdDiff(1);
      thermo.setTimeSinceLastRun(10);
      thermo.setMinLag(5);
      thermo.setOverTemp(80);

      // Case 1: override = true, regulator = true
      thermo.setOverride(true);
      thermo.setRegulator(true);

      thermo.turnHeaterOn(settings);
      int runtime1 = thermo.getRunTime();

      // Case 2: override = false, regulator = true
      thermo.setOverride(false);
      thermo.setRegulator(true);

      thermo.turnHeaterOn(settings);
      int runtime2 = thermo.getRunTime();

      assertNotEquals(runtime1, runtime2);
}
}