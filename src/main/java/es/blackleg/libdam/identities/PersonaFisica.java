/*
 * Copyright (C) 2015 Blackleg
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.blackleg.libdam.identities;

import es.blackleg.libdam.exceptions.SexoException;
import es.blackleg.libdam.exceptions.DniFormatException;
import es.blackleg.libdam.exceptions.DniIncorrectException;
import es.blackleg.libdam.exceptions.EdadException;
import es.blackleg.libdam.exceptions.NameWithNumbersException;
import static es.blackleg.libdam.identities.PersonaFisica.Sexo.Hombre;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import es.blackleg.libdam.exceptions.StringEmptyException;
import es.blackleg.libdam.utilities.Numeros;
import es.blackleg.libdam.utilities.Validator;

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
    
    public PersonaFisica(String nombre, String primerApellido, String segundoApellido, Dni dni, int edad, Sexo sexo) throws EdadException, NameWithNumbersException, StringEmptyException {
        super(checkName(nombre));
        this.primerApellido = checkName(primerApellido);
        this.segundoApellido = checkName(segundoApellido);
        this.dni = dni;
        this.edad = checkEdad(edad);
        this.sexo = sexo;
    }

    public void setDni(String dni) throws DniFormatException, DniIncorrectException, StringEmptyException {
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
    
    private static String checkName(String string) throws NameWithNumbersException, StringEmptyException {
        if (Validator.checkIfStringContainsNumber(string)) {
            throw new NameWithNumbersException();
        } else {
            return string;
        }
    }

    @Override
    public void setNombre(String nombre) {
        try {
            super.setNombre(checkName(nombre));
        } catch (NameWithNumbersException | StringEmptyException ex) {
            Logger.getLogger(PersonaFisica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPrimerApellido (String primerApellido) throws NameWithNumbersException, StringEmptyException {
        this.primerApellido = checkName(primerApellido);
    }

    public void setSegundoApellido (String segundoApellido) throws NameWithNumbersException, StringEmptyException {
        this.segundoApellido = checkName(segundoApellido);
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
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
