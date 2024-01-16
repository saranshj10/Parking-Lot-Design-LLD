package ExitGateManager;

import ParkingSpotFactory.ParkingSpot;
import PaymentPage.PaymentManager;
import PaymentPage.PaymentGateway;

import PaymentPage.PaymentMethods;
import Tickets.TicketTemplate;

public class ExitGateManager {
    //Check the tickets
    long exitTime;
    TicketTemplate ticketTemplate;
    public long getExitTime() {
        return System.currentTimeMillis();
    }

    //Calculate the price as currentTime-TimeOnTicket and ParkingSpot
    public double calculateFare(TicketTemplate ticket){
        exitTime = getExitTime();
        long entryTime = ticket.getEntryTime();
        long parkingTime = exitTime-entryTime;
        double fare = parkingTime * (ticket.getPricePerHour()/(60*60));
        return fare;
    }

    public void completePayment(double amount, PaymentMethods paymentMethods, TicketTemplate ticketTemplate){
        PaymentManager paymentManager = new PaymentManager();
        PaymentGateway paymentGateway =  paymentManager.paymentOption(calculateFare(ticketTemplate), paymentMethods);
        System.out.println("Paid Successfully! Thanks for visiting us!");
        ParkingSpot parkingSpot = ticketTemplate.getSpot();
        parkingSpot.removeVehicle(ticketTemplate.getVehicle());
        System.out.println("Successfully removed the vehicle");
    }
}
