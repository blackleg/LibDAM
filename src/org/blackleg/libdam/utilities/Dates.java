/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hector
 */
public class Dates {
    
    public static Date fromStringWithFormat(String format, String stringFecha) throws ParseException {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(format);
        return formatoDelTexto.parse(stringFecha);
    }
    
}
