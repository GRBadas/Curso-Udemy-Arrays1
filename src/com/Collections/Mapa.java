package com.Collections;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        
        Map<String, Integer> catalogo = new HashMap<>();
        catalogo.put("00ad954",54);
        catalogo.put("00ad544",32);
        catalogo.put("00ad789",27);
        catalogo.put("00ad544", 3);
        
        System.out.println(catalogo);
        System.out.println(catalogo.keySet());
        System.out.println(catalogo.values());
        System.out.println(catalogo.entrySet());
        catalogo.remove("00ad789");

        //for (String chave : catalogo.keySet()) {
        //    System.out.println(chave);
        //    
        //}
//
        //for (Integer valor : catalogo.values()) {
        //    System.out.println(valor);
        //    
        //}

        for (Entry<String, Integer> map : catalogo.entrySet()) {
            System.out.print(map.getKey() + " ===> ");
            System.out.println(map.getValue());
            
        }
    }

    
}
