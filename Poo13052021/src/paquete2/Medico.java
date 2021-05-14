package paquete2;

/**
 *
 * @author 0zzda
 */
public class Medico {

    private String nombreDoctor, especialidad;
    private double sueldoMensual;

    public Medico(String nom, String esp, double suM) {
        nombreDoctor = nom;
        especialidad = esp;
        sueldoMensual = suM;
    }

    public void establecerNombreDoctor(String n) {
        nombreDoctor = n;
    }

    public void estabecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n", obtenerNombreDoctor(),
                obtenerSueldoMensual(), obtenerEspecialidad());
    }
}
