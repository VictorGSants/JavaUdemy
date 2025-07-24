package Entities;

public class OutsourcedEmploee extends Employee{
    private Double additionalCharge;

    public OutsourcedEmploee(){
        super();
    }

    public OutsourcedEmploee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double paymant(){
        return super.paymant() + additionalCharge * 1.1; // super aproveita a operação e soma com outra
    }
}
