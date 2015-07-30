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

import org.blackleg.libdam.exceptions.EdadException;
import org.blackleg.libdam.exceptions.NameWithNumbersException;
import org.blackleg.libdam.exceptions.StringEmptyException;

/**
 * Created by hector on 8/10/14.
 */
public class Futbolista extends PersonaFisica {

    private String nivel;

    public Futbolista() throws EdadException, NameWithNumbersException {
        super();
    }

    public Futbolista(String nombre, String primerApellido, String segundoApellido, Dni dni, int edad, Sexo sexo, String nivel) throws NameWithNumbersException, EdadException, StringEmptyException {
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
