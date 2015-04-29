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

import java.util.Date;
/**
 *
 * @author alumno
 */
public class Empleado extends PersonaFisica {
    
    private Iden id;
    
    private double salario;
    
    private Date fechaAlta;
    
    private Date fechaBaja;
    
    private boolean activo;

    public Iden getId() {
        return id;
    }

    public void setId(Iden id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fecha_alta) {
        this.fechaAlta = fecha_alta;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", id, this.getNombre(), this.getPrimerApellido(), this.getSegundoApellido(), this.fechaAlta, String.valueOf(salario));
    }
    
    
    
    

}
