import java.util.ArrayList;
import java.util.List;

public class Medico extends Personas {
    public String especialidad;
    private int numeroRegistro;
    private List<Paciente> listaPacientes;

    public Medico(String nombre, int dni, int edad, String genero, String especialidad, int numeroRegistro, ArrayList listaPacientes) {
        super(nombre, dni, edad, genero);
        this.especialidad = especialidad;
        this.numeroRegistro = numeroRegistro;
        this.listaPacientes = listaPacientes;
    }

    public Medico(String nombre, int dni, int edad, String genero) {
        super(nombre, dni, edad, genero);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void revisarPacientes(){
        if (listaPacientes.isEmpty()){
            System.out.println("No hay pacientes");
        }
        System.out.println("Pacientes de " + nombre + ": ");
        for (Paciente p: listaPacientes){
            System.out.println(nombre);
        }
    }
}
