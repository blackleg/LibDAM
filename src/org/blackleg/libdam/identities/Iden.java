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

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Iden {
    
    private String identificador;

    public Iden() {
    }

    public Iden(String identificador) {
        this.identificador = identificador;
    }
    
    public Iden(int id) {
        this(String.valueOf(id));
    }
    
    public void setIdentificador(int id) {
        identificador = String.valueOf(id);
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public int toInt() throws NumberFormatException {
        return Integer.parseInt(identificador);
    }
    
    
    public static Iden fromInt(int id) {
        return new Iden(id);
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), identificador);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.identificador);
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
        final Iden other = (Iden) obj;
        return Objects.equals(this.identificador, other.identificador);
    }
    
    
    
    
    
    
    
    
}
