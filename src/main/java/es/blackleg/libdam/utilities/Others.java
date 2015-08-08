/*
 * Copyright (C) 2014 Blackleg <blackleg@openmailbox.org>
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

/**
 *
 * @author Hector Espert
 */
public class Others {

    /**
     * Calcula el cambio a devolver
     * @param cantidad
     * @param caja
     * @param cambio
     * @return
     */
    public static boolean calculaCambio(int cantidad, int[] caja, int[] cambio) {
        
        for (int i = 0; i < caja.length; i++) {
            if (caja[i]>0) {                       
                int cantAdar = cantidad/caja[i];                   
                    //Si la cantidad es mayor al cambio, solo se da el cambio 
                    if (cantAdar>caja[i]) {
                        cantAdar = caja[i];
                       }               
                    cantidad -= cantAdar * caja[i];
                    cambio[i] = cantAdar;
            }   
        } 
        return cantidad == 0;
    }
    
     
    
    /**
     * Indica si una palabra es palindroma.
     * @param cadena
     * @return
     */
    public static boolean esPalindromo (String cadena) {
        String cadReves = Strings.reverse(cadena);
        return cadena.equalsIgnoreCase(cadReves); 
    }
    
    
    /**
     * Encripta o descripta un texto.
     *
     * @param encripta true para encriptar, false para desencriptar
     * @param texto original
     * @param palabra para encriptar
     * @return el texto modificado
     */
    public static String encripta(boolean encripta, String texto, String palabra) {
        char[] matTexto = texto.toCharArray();
        char[] matPalabra = palabra.toCharArray();
        int j = 0;
        for (int i = 0; i < matTexto.length; i++) {
            if (encripta) {
                matTexto[i] = (char) (matTexto[i] + matPalabra[j]);
            } else {
                matTexto[i] = (char) (matTexto[i] - matPalabra[j]);
            }
            j++;
            if (j == matPalabra.length) {
                j = 0;
            }
        }
        return new String(matTexto);
    }
    
    /**
     * Comprueba si una fecha es posible
     * @param dia
     * @param mes
     * @param año
     * @return Si devuelve true la fecha es correcta
     */
    public static boolean comprobarFecha (int dia, int mes, int año) {
        
        if(dia>31 || dia <1 || mes > 12 || mes < 1)
        {
            return false;
        }
        else
        {
            if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11))
                {
                    return false;
                }
            else
            {
                int diaFebrero = (año % 4 == 0 && año % 400 != 0) ? 29 : 28;
                if (mes == 2 && dia > diaFebrero)
                {
                    return false;
                }
                
            }
        }

       return true; 
    }
    
}
