public class Paciente extends Personas{

    private int numeroHistorial;
    private String eps;
    private double saldoDisponible;
    public Paciente(String nombre, int dni, int edad, String genero) {
        super(nombre, dni, edad, genero);
    }

    public Paciente(String nombre, int dni, int edad, String genero, int numeroHistorial, String eps, double saldoDisponible) {
        super(nombre, dni, edad, genero);
        this.numeroHistorial = numeroHistorial;
        this.eps = eps;
        this.saldoDisponible = saldoDisponible;
    }

    public int getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(int numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
