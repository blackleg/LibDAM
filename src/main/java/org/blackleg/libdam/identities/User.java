/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackleg.libdam.identities;

/**
 *
 * @author hespert
 */
public class User {
    
    private Iden iden;
    
    private String name;
    
    public void setIden(Iden iden) {
        this.iden = iden;
    }

    public Iden getIden() {
        return iden;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
