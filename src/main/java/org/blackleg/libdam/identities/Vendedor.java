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

package org.blackleg.libdam.identities;

import org.blackleg.libdam.exceptions.NameWithNumbersException;
import java.util.Date;
import org.blackleg.libdam.exceptions.StringEmptyException;

/**
 *
 * @author alumno
 */
public class Vendedor extends Empleado{

    public Vendedor() {
    }
    
    public Vendedor(String nombre, String primerApellido, String segundoApellido, Date fecha_alta, double salario) throws NameWithNumbersException, StringEmptyException {
        super();
        super.setNombre(nombre);
        super.setPrimerApellido(primerApellido);
        super.setSegundoApellido(segundoApellido);
        super.setFechaAlta(fecha_alta);
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        return String.format("ID: %s %s %s %s Fecha Alta: %s Salario: %.2f", getId().getIdentificador(), getNombre(), getPrimerApellido(), getSegundoApellido(), getFechaAlta(), getSalario());
    }
    
    
    

    
    
    
}
