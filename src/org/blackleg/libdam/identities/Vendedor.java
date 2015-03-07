/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.identities;

import org.blackleg.libdam.exceptions.NameWithNumbersException;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Vendedor extends Empleado{

    public Vendedor() {
    }
    
    public Vendedor(String nombre, String primerApellido, String segundoApellido, Date fecha_alta, double salario) throws NameWithNumbersException {
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
