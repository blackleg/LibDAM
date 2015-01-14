package identidades;

import excepciones.DniFormatException;
import excepciones.DniIncorrectException;
import java.util.Objects;
import utilidades.Utilidades;
import utilidades.Validador;

/*
 * Copyright (C) 2014 Blackleg <blackleg@openmailbox.org>
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


public class Dni {

    private String letra;

    private String numeros;

    public Dni(String dni) throws DniFormatException, DniIncorrectException {
        dni = checkDni(dni);
        letra = getLetraDni(dni);
        numeros = getNumerosDni(dni);
    }


    public void setDni(String dni) throws DniFormatException, DniIncorrectException {
        dni = checkDni(dni);
        letra = getLetraDni(dni);
        numeros = getNumerosDni(dni);

    }

    public String getDni() {

        return numeros + letra;
    }


    private static String checkDni(String dni) throws DniFormatException, DniIncorrectException {
        dni = checkString(dni);

        String numeros = getNumerosDni(dni);
        String letra = getLetraDni(dni);

        if (checkDni(numeros, letra)) {
            return dni;
        } else {
            throw new DniIncorrectException();
        }

    }

    private static String getLetraDni(String dni) {
        return dni.substring(dni.length() - 1, dni.length());
    }

    private static String getNumerosDni(String dni) {
        return dni.substring(0, 8);
    }


    private static boolean checkDni(String numeros, String letra ) {
        return Utilidades.calculaletraDNI(Integer.valueOf(numeros)).equals(letra);
    }


    private static String checkString(String string) throws DniFormatException {
        if (Validador.checkStringIsDni(string)) {
            return string;
        } else {
            throw new DniFormatException();
        }
    }

    @Override
    public String toString() {
        return String.format("%s%s", numeros, letra);
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.letra);
        hash = 83 * hash + Objects.hashCode(this.numeros);
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
        final Dni other = (Dni) obj;
        if (!Objects.equals(this.letra, other.letra)) {
            return false;
        }
        return Objects.equals(this.numeros, other.numeros);
    }

}
