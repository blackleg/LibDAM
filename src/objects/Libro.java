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

package objects;

import identidades.Autores;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Libro extends Publicacion{
    
    private int id;
    
    private int paginas;
    
    private String genero;
    
    private boolean tapa_dura;

    public Libro() {
    }

    public Libro(int id, int paginas, String genero, boolean tapa_dura, String titulo, Autores autores, GregorianCalendar fecha, double precio) {
        super(titulo, autores, fecha, precio);
        this.id = id;
        this.paginas = paginas;
        this.genero = genero;
        this.tapa_dura = tapa_dura;
    }

    public Libro(int id, int paginas, String genero, boolean tapa_dura, String titulo, String autor, GregorianCalendar fecha, double precio) {
        super(titulo, autor, fecha, precio);
        this.id = id;
        this.paginas = paginas;
        this.genero = genero;
        this.tapa_dura = tapa_dura;
    }

    public Libro(int id, String titulo, Autores autores, double precio, boolean tapa_dura) {
        this.id = id;
        super.setAutores(autores);
        super.setPrecio(precio);
        this.tapa_dura = tapa_dura;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTapa_dura(boolean tapa_dura) {
        this.tapa_dura = tapa_dura;
    }

    public boolean isTapa_dura() {
        return tapa_dura;
    }

    /**
     * @return the paginas
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


}
