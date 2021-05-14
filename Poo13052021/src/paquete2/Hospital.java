package paquete2;

import java.util.ArrayList;

/**
 *
 * @author 0zzda
 */
public class Hospital {

    private String nombreHospital, direccionHospital;
    private int especialidades;
    private CiudadHospital ciudadH;
    private double totalSueldos;
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();

    public Hospital(String nom, String dir, int espec, CiudadHospital ciudad) {
        nombreHospital = nom;
        direccionHospital = dir;
        especialidades = espec;
        ciudadH = ciudad;
    }

    public void estabelcerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerDireccionHospital(String n) {
        direccionHospital = n;
    }

    public void establecerEspecialidades(int n) {
        especialidades = n;
    }

    public void estabecerCiudadH(CiudadHospital n) {
        ciudadH = n;
    }

    public void estableceTotalSueldos(double totSu) {
        for (Medico i : medicos) {
            totalSueldos += i.obtenerSueldoMensual();
        }
        for (Enfermero i : enfermeros) {
            totalSueldos += i.obtenerSueldoMensual();
        }
    }

    public void estabelcerMedicos(ArrayList<Medico> med) {
        medicos = med;
    }

    public void establecerEnfermeros(ArrayList<Enfermero> enf) {
        enfermeros = enf;
    }

    public void agregarMedico(Medico med) {
        medicos.add(med);
    }

    public void agregarEnfermero(Enfermero enf) {
        enfermeros.add(enf);
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public int obtenerEspecialidades() {
        return especialidades;
    }

    public CiudadHospital obtenerCiudadH() {
        return ciudadH;
    }

    public double obtenerTotalSueldo() {
        return totalSueldos;
    }

    public ArrayList<Medico> obtenerMedicos() {
        return medicos;
    }

    public ArrayList<Enfermero> obtenerEnfermeros() {
        return enfermeros;
    }

    public String obtenerInfoMedicos() {
        String inf = "";
        for (Medico i : medicos) {
            inf += i.toString();
        }
        return inf;
    }

    public String obtenerInfoEnfermeros() {
        String inf = "";
        for (Enfermero i : enfermeros) {
            inf += i.toString();
        }
        return inf;
    }

    public String toString() {
        return String.format("HOSPITAL %s\nDireccion: %s\nCiudad: "
                + "%s\nProvincia: %s\nNumero especialidades: %s\nListado de "
                + "médicos: \n%s\nListado de enferemeros/as: \n%s\n\n"
                + "Total de sueldos a pagar por mes: %s \n",
                obtenerNombreHospital(), obtenerDireccionHospital(),
                ciudadH.obtenerNombreCiudad(), ciudadH.obtenerNombreProvincia(),
                especialidades, obtenerInfoMedicos(), obtenerInfoEnfermeros(),
                obtenerTotalSueldo());
    }

}
