package pluralsighTest;

import org.junit.jupiter.api.Test;
import pluralsight.Flight;
import pluralsight.Passenger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @Test
    public void testAirport(){
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        assertEquals(true,economyFlight.addPassanger(john));
        assertEquals(false,economyFlight.removePassenger(john));
        assertEquals(true,businessFlight.addPassanger(john));
        assertEquals(false,businessFlight.removePassenger(john));

        assertEquals(true,economyFlight.addPassanger(mike));
        assertEquals(true,economyFlight.removePassenger(mike));
        assertEquals(false,businessFlight.addPassanger(mike));
        assertEquals(false,businessFlight.removePassenger(mike));
    }
}
