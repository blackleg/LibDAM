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

package es.blackleg.libdam.objects;

import es.blackleg.libdam.identities.Autor;
import es.blackleg.libdam.identities.Autores;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Publicacion {
    
    private String titulo;
    
    private Autores autores;
    
    private GregorianCalendar fecha;
    
    private double precio;

    public Publicacion() {
    }

    public Publicacion(String titulo, Autores autores, GregorianCalendar fecha, double precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.fecha = fecha;
        this.precio = precio;
    }
    
    public Publicacion(String titulo, String autor, GregorianCalendar fecha, double precio) {
        this.titulo = titulo; 
        this.autores = new Autores();
        this.autores.añadirAutor(new Autor(autor));
        this.fecha = fecha;
        this.precio = precio;
    }

    

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public Autores getAutores() {
        return autores;
    }

    /**
     * @param autores
     */
    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    /**
     * @return the fecha
     */
    public GregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.autores);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autores, other.autores);
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s\n Autor/es: %s Año Publicación: %d\n Precio: %.2f", titulo, autores, fecha.get(Calendar.YEAR), precio);
    }
    
    
    
    
    
    
    
    
}
