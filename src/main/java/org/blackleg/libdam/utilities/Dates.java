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

package org.blackleg.libdam.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author hector
 */
public class Dates {
    
    public static Date fromStringWithFormat(String format, String stringFecha) throws ParseException {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(format);
        return formatoDelTexto.parse(stringFecha);
    }
    
    public static Integer differenceInMonths(Date beginningDate, Date endingDate) {
        if (beginningDate == null || endingDate == null) {
            return 0;
        }
        Calendar cal1 = new GregorianCalendar();
        cal1.setTime(beginningDate);
        Calendar cal2 = new GregorianCalendar();
        cal2.setTime(endingDate);
        return differenceInMonths(cal1, cal2);
    }

    public static Integer differenceInMonths(Calendar beginningDate, Calendar endingDate) {
        if (beginningDate == null || endingDate == null) {
            return 0;
        }
        int m1 = beginningDate.get(Calendar.YEAR) * 12 + beginningDate.get(Calendar.MONTH);
        int m2 = endingDate.get(Calendar.YEAR) * 12 + endingDate.get(Calendar.MONTH);
        return m2 - m1;
    }
    
    public static Integer transformMonthsCountToYears(Integer months) {
        return months / 12;
    }
    
    /**
     * Transforma un Date en un String con el valor Long del Date.
     * @param fecha
     * @return 
     */
    public static String transformDateToLongString(Date fecha) {
        if (fecha == null) {
            return null;
	} else {
            return String.valueOf(fecha.getTime());
	}
    }
    
    
    public static String toStringWithFormat(String format, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
    
    /**
     * Convierte segundos a minutos
     * @param segundos
     * @return
     */
    public static double segundosToMinutos(double segundos) {
        return segundos/60;
    }
    
    
    
}
