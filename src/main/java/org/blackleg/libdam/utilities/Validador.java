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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alumno on 07/10/2014.
 */
public class Validador {


    public static boolean checkStringNoNumber(String string) {
        Pattern pat = Pattern.compile("[a-zA-Z]*");
        Matcher mat = pat.matcher(string);
        return mat.matches();
    }

    public static boolean checkStringOnlyNumber(String string) {
        Pattern pat = Pattern.compile("[0-9]*");
        Matcher mat = pat.matcher(string);
        return mat.matches();
    }

    public static boolean checkStringIsDni(String string) {
        Pattern pat = Pattern.compile("(\\d{8})([-]?)([A-Z]{1})");
        Matcher mat = pat.matcher(string);
        return mat.matches();
    }
    
    public static boolean checkIfStringContainsNumber(String string) {
        Pattern pat = Pattern.compile(".*\\d.*");
        Matcher mat = pat.matcher(string);
        return mat.matches();
    }




}



