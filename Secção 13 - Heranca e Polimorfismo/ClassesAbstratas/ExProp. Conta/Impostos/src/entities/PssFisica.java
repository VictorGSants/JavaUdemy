package entities;

public class PssFisica extends Tax {
    private Double Medical;

    public PssFisica(){}

    public PssFisica(String name, Double renda, Double medical) {
        super(name, renda);
        Medical = medical;
    }
    @Override
    public Double taxa() {
        if (getRenda() < 20000 && Medical > 0 ){
        return (getRenda() * 0.15) - (Medical * 0.50) ;
        }else if (getRenda() >= 20000 && Medical > 0){
            return getRenda() * 0.25 - (Medical * 0.50);
        }else {
            return getRenda();
        }
    }


}
