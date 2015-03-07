/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.identities;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Iden {
    
    private String identificador;

    public Iden() {
    }

    public Iden(String identificador) {
        this.identificador = identificador;
    }
    
    public Iden(int id) {
        this(String.valueOf(id));
    }
    
    public void setIdentificador(int id) {
        identificador = String.valueOf(id);
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public int toInt() throws NumberFormatException {
        return Integer.parseInt(identificador);
    }
    
    
    public static Iden fromInt(int id) {
        return new Iden(id);
    }

    @Override
    public String toString() {
        return String.format("%s Iden: %s", super.toString(), identificador);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.identificador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Iden other = (Iden) obj;
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
