/*
 * Copyright (C) 2014 Hector Espert Pardo
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

package org.blackleg.libdam.others;

import org.blackleg.libdam.exceptions.PilaLlenaException;
import org.blackleg.libdam.exceptions.PilaVaciaException;
import org.blackleg.libdam.utilities.Aleatorios;
import org.blackleg.libdam.utilities.Matrices;

/**
 *
 * @author alumno
 */
public class Pila {
    
    private final int[] pila;
    
    private int cima;
    
    private final int tamaño;
    
    public Pila(int tamaño) {
        this.tamaño = tamaño;
        pila = new int[this.tamaño];
        cima = 0;
    }
    
    public void mete(int numero) throws Exception {
        if (cima > tamaño - 1) {
            throw new PilaLlenaException();
        } else {
            pila[cima] = numero;
            cima++;
        }
    }
    
    public boolean estaLlena(){
        return cima > tamaño - 1;
    }
    
    public int saca() throws Exception {
        if (cima <= 0) {
            throw new PilaVaciaException();
        } else {
            cima--;
            return pila[cima];
        }  
    }
    
    public boolean estaVacia() {
        return cima <= 0;
    }

    @Override
    public String toString() {
        return String.format("I %d, P %s", cima, Matrices.toText(pila));
    }
    
    public int getLength() {
        return tamaño;
    }

    public int getCima() {
        return cima;
    }
    
    
    
    
    /**
     * Vacia un objeto tipo Pila
     * @param pila
     * @throws java.lang.Exception
     */
    public static void vaciar(Pila pila) throws Exception {
        while (!pila.estaVacia()) {
                pila.saca();

        }
    }
    
    /**
     * Llena una pila con numeros aleatorios
     * @param pila
     * @param cantidad
     * @throws java.lang.Exception
     */
    public static void llenar(Pila pila, int cantidad) throws Exception {
        for (int i = 0; i < cantidad; i++) {
                pila.mete(Aleatorios.entre(100, 999));

        }
    }
    
    /**
     * Pasa valores de una pila a otra
     * @param pila_primera
     * @param pila_segunda
     * @throws java.lang.Exception
     */
    public static void pasarEntrePilas(Pila pila_primera, Pila pila_segunda) throws Exception {
        while (!pila_primera.estaVacia()) {
                pila_segunda.mete(pila_primera.saca());
            
        }
    }
    
    
    
    
}
