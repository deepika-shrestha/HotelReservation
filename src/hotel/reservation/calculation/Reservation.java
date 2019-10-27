/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.calculation;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author deepika
 */
public class Reservation {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private final double RATE = 95.00;
    
    public void setArrivalDate(LocalDate arrivalDate){
        this.arrivalDate = arrivalDate;
    }
    public LocalDate getArrivalDate(){
        return arrivalDate;
    }
    String getArrivalDateFormatted(){
      String dateFormatted;     
      DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
      dateFormatted = dtf.format(arrivalDate);      
      return dateFormatted;      
    }
    
    public void setDepatureDate(LocalDate depatureDate){
        this.departureDate = depatureDate;        
    }
    public LocalDate getDepartureDate(){
        return departureDate;
    }
    String getDepartureDateFormatted(){
      String dateFormatted;     
      DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
      dateFormatted = dtf.format(departureDate);      
      return dateFormatted;
    }
    
     int getNumberOfNights(){
        long arrival = getArrivalDate().toEpochDay();
        long departure = getDepartureDate().toEpochDay();
        int nights =(int)(departure - arrival);
        return nights;  
    }
    
    String getPricePerNightFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(RATE);
        return priceFormatted;
    }
    
    double getTotalPrice(){
        double total = (getNumberOfNights() * RATE);
        return total;
    }
    
    String getTotalPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(getTotalPrice());
        return priceFormatted;
    }
    
    
    
    
    
    
    
    
}
