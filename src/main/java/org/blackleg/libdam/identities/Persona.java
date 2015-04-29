package org.blackleg.libdam.identities;

/*
 * Copyright (C) 2014 Blackleg blackleg@openmailbox.org
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


import org.blackleg.libdam.exceptions.NameWithNumbersException;
import java.util.Objects;

/**
 * Created by hector on 8/10/14.
 */
public class Persona {

    private String nombre;

    public Persona() {

    }

    public Persona (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NameWithNumbersException {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("%s Nombre: %s", super.toString(), nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    



}
