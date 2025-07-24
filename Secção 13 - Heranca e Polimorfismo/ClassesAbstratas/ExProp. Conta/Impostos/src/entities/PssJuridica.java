package entities;

public class PssJuridica extends Tax{
    private Integer NumberofEmployee;

    public PssJuridica(String name, Double renda, Integer numberofEmployee) {
        super(name, renda);
        NumberofEmployee = numberofEmployee;
    }

    public Integer getNumberofEmployee() {
        return NumberofEmployee;
    }

    public void setNumberofEmployee(Integer numberofEmployee) {
        NumberofEmployee = numberofEmployee;
    }

    @Override
    public Double taxa() {
        if (NumberofEmployee > 10){
            return getRenda() * 0.14;
        }else {
            return getRenda() * 0.16;
        }
    }

}
