package com.EqualsHashcode;

import java.util.Date;

public class Hashcode {

    public static void main(String[] args){

        Usuario u1 = new Usuario();
        u1.nome = "Badas";
        u1.email = "grbadas@gmail.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Badas";
        u2.email = "grbadas@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));
    }
    
}
