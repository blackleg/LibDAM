/*
 * Copyright (C) 2014 Hector Espert Pardo
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

package identidades;

import excepciones.StringConNumerosException;
import java.util.Objects;
import medidas.Nota;

/**
 *
 * @author alumno
 */
public class Alumno extends PersonaFisica{
    
    private Nota nota;
    
    
    public Alumno() {
        super();    
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, Dni dni, int edad, Sexo sexo, Nota nota) throws StringConNumerosException {
        super(nombre, primerApellido, segundoApellido, dni, edad, sexo);
        this.nota = nota;
    }

    public Alumno(Nota nota) {
        this.nota = nota;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), nota.toString());
    }
  
}
