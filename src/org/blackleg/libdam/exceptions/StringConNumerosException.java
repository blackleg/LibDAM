/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.exceptions;

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
