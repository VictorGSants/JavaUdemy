package Models.services;

import Models.entities.CarRental;
import Models.entities.Invoice;

import java.time.Duration;

public class RentalServices {
    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService brazilTaxService;

    // nao colocar o construtor vazio pois obriga a informar os dados

    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = taxService;
    }
    public void processInvoice(CarRental carRental){
       double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       double hours = minutes/60;
       double basicPayment;

       if (hours <= 12){
           basicPayment = pricePerHour * Math.ceil(hours);
       }
       else {
            basicPayment = pricePerDay * Math.ceil(hours/24);
       }
       double tax = brazilTaxService.tax(basicPayment);


       carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
