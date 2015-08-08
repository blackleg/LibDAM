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

package es.blackleg.libdam.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import es.blackleg.libdam.exceptions.StringEmptyException;

/**
 * Created by alumno on 07/10/2014.
 */
public class Validator {
    
    //Patterns
    private static final String dni = "(\\d{8})([-]?)([A-Z]{1})";
    private static final String noString = "[a-zA-Z]*";
    private static final String onlyNumber = "[0-9]*";
    private static final String containsNumber = ".*\\d.*";
    
    /**
     * [ES] Comprueba un string con el patron
     * @param string
     * @param pattern
     * @return 
     * @throws es.blackleg.libdam.exceptions.StringEmptyException 
     */
    public static boolean checkStringWithPattern(String string, String pattern) throws StringEmptyException {
        if (Strings.checkIfIsNotEmptyOrNull(string)) {
            Pattern pat = Pattern.compile(pattern);
            if (Strings.checkIfIsNotEmptyOrNull(string)) {
                Matcher mat = pat.matcher(string);
                return mat.matches();
            } else {
                throw new StringEmptyException();
            }
        } else {
            throw new StringEmptyException();
        }
    }


    public static boolean checkStringNoNumber(String string) throws StringEmptyException {
        return checkStringWithPattern(string, noString);
    }

    public static boolean checkStringOnlyNumber(String string) throws StringEmptyException {
        return checkStringWithPattern(string, onlyNumber);
    }

    public static boolean checkStringIsDni(String string) throws StringEmptyException {
        return checkStringWithPattern(string, dni);
    }
    
    public static boolean checkIfStringContainsNumber(String string) throws StringEmptyException {
        return checkStringWithPattern(string, containsNumber);
    }




}



