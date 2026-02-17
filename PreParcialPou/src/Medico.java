import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona implements ICirujano {
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

    public void asignarPrioridad(int opcion){
        switch (opcion){
            case 1:
                System.out.println("El paciente sufre de un dolor o molestia," +
                        " nivel de prioridad bajo");
                break;
            case 2:
                System.out.println("El paciente sufre de alguna enfermedad viral que incluya" +
                        " fiebre entre sus síntomas, nivel de prioridad 2");
                break;
            case 3:
                System.out.println("El paciente sufrió de algún ataque" +
                        " sumamente riesgoso como un infarto, nivel de prioridad 3");
        }

    }

    public void agregarPaciente(Paciente p){
        listaPacientes.add(p);
    }


    @Override
    public boolean validarQuiro() {
        return false;
    }

    @Override
    public void tomarDecision() {

    }
}
