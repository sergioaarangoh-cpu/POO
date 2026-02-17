public class Paciente extends Persona {

    private int numeroHistorial;
    private String eps;
    private double saldoDisponible;
    private String sintomas;
    public Paciente(String nombre, int dni, int edad, String genero) {
        super(nombre, dni, edad, genero);
    }

    public Paciente(String nombre, int dni, int edad, String genero, int numeroHistorial) {
        super(nombre, dni, edad, genero);
        this.numeroHistorial = numeroHistorial;
        this.eps = eps;
        this.saldoDisponible = saldoDisponible;
        this.sintomas = sintomas;
    }

    public Paciente(String nombre, int dni, int edad, String genero, int numeroHistorial, String eps, double saldoDisponible, String sintomas) {
        super(nombre, dni, edad, genero);
        this.numeroHistorial = numeroHistorial;
        this.eps = eps;
        this.saldoDisponible = saldoDisponible;
        this.sintomas = sintomas;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void verificarPresupuesto(){
        System.out.println("Saldo disponible: " + saldoDisponible);
        System.out.println("Precio consulta: 100,000 COP");
        if (saldoDisponible < 100000){
            System.out.println("Su saldo no es suficiente");
        }

    }
}
