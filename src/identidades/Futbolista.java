package identidades;

import excepciones.EdadException;
import excepciones.StringConNumerosException;

/**
 * Created by hector on 8/10/14.
 */
public class Futbolista extends PersonaFisica {

    private String nivel;

    public Futbolista() throws EdadException, StringConNumerosException {
        super();
    }

    public Futbolista(String nombre, String primerApellido, String segundoApellido, Dni dni, int edad, Sexo sexo, String nivel) throws StringConNumerosException {
        super(nombre, primerApellido, segundoApellido, dni, edad, sexo);
        this.nivel = nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }



}
