/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import excepciones.StringConNumerosException;
import fechas.Fecha;

/**
 *
 * @author alumno
 */
public class Vendedor extends Empleado{

    public Vendedor() {
    }
    
    public Vendedor(String nombre, String primerApellido, String segundoApellido, Fecha fecha_alta, double salario) throws StringConNumerosException {
        super();
        super.setNombre(nombre);
        super.setPrimerApellido(primerApellido);
        super.setSegundoApellido(segundoApellido);
        super.setFechaAlta(fecha_alta);
        super.setSalario(salario);
    }

    
    
    
}
