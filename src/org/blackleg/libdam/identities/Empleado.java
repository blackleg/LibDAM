/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.identities;

import org.blackleg.libdam.utilities.Dates;
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
