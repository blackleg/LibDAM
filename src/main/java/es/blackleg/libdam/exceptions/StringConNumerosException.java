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

package es.blackleg.libdam.exceptions;

/**
 *
 * @author hector
 */
public class StringConNumerosException extends Exception {

    /**
     * Creates a new instance of <code>StringConNumerosException</code> without
     * detail message.
     */
    public StringConNumerosException() {
    }

    /**
     * Constructs an instance of <code>StringConNumerosException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public StringConNumerosException(String msg) {
        super(msg);
    }
}
