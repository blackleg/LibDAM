/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import fechas.Fecha;
/**
 *
 * @author alumno
 */
public class Empleado extends PersonaFisica {
    
    private Iden id;
    
    private double salario;
    
    private Fecha fechaAlta;
    
    private Fecha fechaBaja;
    
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

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fecha_alta) {
        this.fechaAlta = fecha_alta;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", id, this.getNombre(), this.getPrimerApellido(), this.getSegundoApellido(), this.fechaAlta, String.valueOf(salario));
    }
    
    
    
    

}
