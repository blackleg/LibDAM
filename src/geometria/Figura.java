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

package geometria;

/**
 *
 * @author alumno
 */
public abstract class Figura {
    
    private Punto centro;

    @Override
    public String toString() {
        return centro.toString();
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Punto getCentro() {
        return centro;
    }
    
    public abstract double calculaArea();
    
    public abstract double calculaPerimetro();
}
