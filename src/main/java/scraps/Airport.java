package scraps;

import pluralsight.Flight;
import pluralsight.Passenger;

public class Airport {

    public static void main(String[] args) {
        Flight economyFlight = new Flight("1","Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger john = new Passenger("John", true);
        Passenger mike = new Passenger("Mike", false);

        businessFlight.addPassanger(john);
        businessFlight.removePassenger(john);
        businessFlight.addPassanger(mike);
        economyFlight.addPassanger(mike);

        System.out.println("Business flight passengers list:");
        for(Passenger passenger: businessFlight.getPassengersList()){
            System.out.println(passenger.getName());
        }

        System.out.println("Economy flight passengers list:");
        for(Passenger passenger: economyFlight.getPassengersList()){
            System.out.println(passenger.getName());


        }
    }
}