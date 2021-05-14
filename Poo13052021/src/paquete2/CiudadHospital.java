package paquete2;

/**
 *
 * @author 0zzda
 */
public class CiudadHospital {

    private String nombreCiudad, provinciaCiudad;

    public CiudadHospital(String ciud, String prov) {
        nombreCiudad = ciud;
        provinciaCiudad = prov;
    }

    public void estabelcerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerNombreProvincia(String n) {
        provinciaCiudad = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerNombreProvincia() {
        return provinciaCiudad;
    }

}
