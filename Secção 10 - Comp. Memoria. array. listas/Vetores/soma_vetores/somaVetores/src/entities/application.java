package entities;

public class application {
    private double vetor1;
    private double vetor2;
    private double vetor3;

    // Construtor para vetor A
    public application(double vetor1) {
        this.vetor1 = vetor1;
    }

    // Construtor para vetor B
    public static application fromVetor2(double vetor2) {
        application app = new application(0); // inicializa com 0 no vetor1
        app.vetor2 = vetor2;
        return app;
    }

    // Construtor para vetor C (resultado da soma)
    public static application fromVetor3(double vetor3) {
        application app = new application(0);
        app.vetor3 = vetor3;
        return app;
    }

    public double getVetor1() {
        return vetor1;
    }

    public double getVetor2() {
        return vetor2;
    }

    public double getVetor3() {
        return vetor3;
    }
}
