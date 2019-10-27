/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.calculation;

import java.time.LocalDate;
import java.util.Scanner;

/* 
 * Name: Deepika Shrestha
 * Project Name: Reservation Calculation
 * Date: 4/8/2018
 * Description: Reservation Calculation System
 */
public class ReservationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reservation Calculation System Startup");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int month, year, day;
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the arrival month (1-12): ");
            month = sc.nextInt();
            System.out.print("Enter the arrival day (1-31): ");
            day = sc.nextInt();
            System.out.print("Enter the arrival year: ");
            year = sc.nextInt();
            System.out.println();
            LocalDate arrivalDate = LocalDate.of(year, month, day);
            System.out.print("Enter the departure month (1-12): ");
            month = sc.nextInt();
            System.out.print("Enter the departure day (1-31): ");
            day = sc.nextInt();
            System.out.print("Enter the departure year: ");
            year = sc.nextInt();
            System.out.println();

            LocalDate departureDate = LocalDate.of(year, month, day);

            Reservation resv = new Reservation();

            resv.setArrivalDate(arrivalDate);
            resv.setDepatureDate(departureDate);

            System.out.println("Arrival Date: " + resv.getArrivalDateFormatted());
            System.out.println("Departure Date: " + resv.getDepartureDateFormatted());
            System.out.println("Price: " + resv.getPricePerNightFormatted() + " per nights");
            System.out.println("Total price: " + resv.getTotalPriceFormatted() + " for " + resv.getNumberOfNights() + " nights");
              System.out.println();
              
            System.out.print("Continue? (y/n): ");
            choice = sc.next();            
        }
    }
}
