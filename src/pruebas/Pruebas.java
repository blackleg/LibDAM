/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.Dates;




/**
 *
 * @author hector
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            String fecha = "18011988";
            
            
        Date fechas = null;    
        try {
            fechas = Dates.fromStringWithFormat("ddMMyyyy", fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            System.out.println(fechas.toString());
        
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("ddMMyyyy");
            String strFecha = "18011988";
            Date fecha2 = null;
            try {
                fecha2 = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            System.out.println(fecha2.toString());
        
    }
    
}
