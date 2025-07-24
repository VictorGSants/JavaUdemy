package Models.entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalVelue;

    private List<Installment> list = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalVelue) {
        this.number = number;
        this.date = date;
        this.totalVelue = totalVelue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalVelue() {
        return totalVelue;
    }

    public void setTotalVelue(Double totalVelue) {
        this.totalVelue = totalVelue;
    }

    public List<Installment> getList() {
        return list;
    }

}
