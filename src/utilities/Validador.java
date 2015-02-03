package utilities;

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



