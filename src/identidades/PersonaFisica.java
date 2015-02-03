package identidades;

import excepciones.SexoException;
import excepciones.DniFormatException;
import excepciones.DniIncorrectException;
import excepciones.EdadException;
import excepciones.NameWithNumbersException;
import static identidades.PersonaFisica.Sexo.Hombre;
import java.util.Objects;
import utilities.Numeros;
import utilities.Validador;

/**
 * Created by hector on 8/10/14.
 */
public class PersonaFisica extends Persona {
    
    public static enum Sexo {Hombre, Mujer}

    private String primerApellido;
    private String segundoApellido;

    private Dni dni;

    private int edad;

    private Sexo sexo;
    
    public PersonaFisica() {
        super();
    }
    
    public PersonaFisica(String nombre, String primerApellido, String segundoApellido, Dni dni, int edad, Sexo sexo) throws EdadException, NameWithNumbersException {
        super(checkName(nombre));
        this.primerApellido = checkName(primerApellido);
        this.segundoApellido = checkName(segundoApellido);
        this.dni = dni;
        this.edad = checkEdad(edad);
        this.sexo = sexo;
    }

    public void setDni(String dni) throws DniFormatException, DniIncorrectException {
        this.dni = new Dni(dni);
    }

    public Dni getDni() {
        return dni;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public void setSexo(String sexo) throws SexoException {
        this.setSexoFromString(sexo);
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public String getSexoToString() {
        if (sexo == Hombre) {
         return "Hombre";
        } else {
         return "Mujer";
        }
    }
    
    public void setSexoFromString(String sexo) throws SexoException {
        if (sexo.equalsIgnoreCase("hombre")) {
            this.sexo = Sexo.Hombre;
        } else if(sexo.equalsIgnoreCase("mujer")) {
            this.sexo = Sexo.Mujer;
        } else {
            throw new SexoException();
        }
    }

    public void setPrimerApellido (String primerApellido) throws NameWithNumbersException {
        this.primerApellido = checkName(primerApellido);
    }

    public void setSegundoApellido (String segundoApellido) throws NameWithNumbersException {
        this.segundoApellido = checkName(segundoApellido);
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    private static String checkName(String string) throws NameWithNumbersException {
        if (Validador.checkIfStringContainsNumber(string)) {
            throw new NameWithNumbersException();
        } else {
            return string;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) throws EdadException {
        this.edad = checkEdad(edad);
    }

    private static int checkEdad(int edad) throws EdadException {
        if (Numeros.checkIfIsNegative(edad)) {
            throw new EdadException();
        }
           else {
            return edad;
        }
    }

    @Override
    public String toString() {
        return String.format("%s Apellidos: %s %s %s Edad: %d Sexo: %s", super.toString(), primerApellido, segundoApellido, dni, edad , this.getSexoToString());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.primerApellido);
        hash = 97 * hash + Objects.hashCode(this.segundoApellido);
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.sexo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaFisica other = (PersonaFisica) obj;
        if (!Objects.equals(this.primerApellido, other.primerApellido)) {
            return false;
        }
        if (!Objects.equals(this.segundoApellido, other.segundoApellido)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        return this.sexo == other.sexo;
    }
   

   
    
    
    
    
}
