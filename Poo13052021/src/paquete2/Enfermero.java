package paquete2;

/**
 *
 * @author 0zzda
 */
public class Enfermero {

    private String nombre, tipoContrato;
    private double sueldoMensual;

    public Enfermero(String nom, String tipo, double sueldo) {
        nombre = nom;
        tipoContrato = tipo;
        sueldoMensual = sueldo;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void estabelcerTipo(String n) {
        tipoContrato = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipoContrato;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n", obtenerNombre(),
                obtenerSueldoMensual(), obtenerTipo());
    }
}
