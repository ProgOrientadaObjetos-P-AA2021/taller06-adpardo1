package paquete1;

import paquete2.CiudadHospital;
import paquete2.Hospital;
import paquete2.Medico;
import paquete2.Enfermero;
import java.util.Scanner;

/**
 *
 * @author 0zzda
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String medi, tip, enf, tipenf, ciud, provi, nomh, dirh;
        int sueldomed, sueldoenf;
        System.out.println("Ingrese el nombre de la ciudad del Hospital");
        ciud = leer.next();
        System.out.println("Ingrese la provincia del Hospital");
        provi = leer.next();
        System.out.println("Ingrese el nombre del Hospital");
        nomh = leer.next();
        System.out.println("Ingrese la direccion del Hospital");
        dirh = leer.next();
        System.out.println("Ingrese el limite de medicos");
        int lmed = leer.nextInt();
        System.out.println("Ingrese el limite de enfermeros");
        int lenf = leer.nextInt();
        CiudadHospital c1 = new CiudadHospital(ciud, provi);
        Hospital h1 = new Hospital(nomh, dirh, (lmed + lenf), c1);
        for (int i = 0; i < lmed; i++) {
            System.out.println("Ingrese el nombre del medico " + i);
            medi = leer.next();
            System.out.println("Ingrese el tipo de medico");
            tip = leer.next();
            System.out.println("Ingrese el sueldo del medico " + i);
            sueldomed = leer.nextInt();
            Medico med = new Medico(medi, tip, sueldomed);
            h1.agregarMedico(med);
        }
        for (int i = 0; i < lenf; i++) {
            System.out.println("Ingrese el nombre del enfermero " + i);
            enf = leer.next();
            System.out.println("Ingrese el tipo de nombramiento");
            tipenf = leer.next();
            System.out.println("Ingrese el sueldo del enfermero " + i);
            sueldoenf = leer.nextInt();
            Enfermero enfe = new Enfermero(enf, tipenf, sueldoenf);
            h1.agregarEnfermero(enfe);
        }
        h1.estableceTotalSueldos(lenf);
        System.out.println(h1);
    }

}
