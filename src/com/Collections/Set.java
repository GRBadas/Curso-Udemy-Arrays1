package com.Collections;

import java.util.HashSet;

public class Set {

    public static void main(String [] args){

        HashSet<Object> conjunto = new HashSet<>();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add(5);
        conjunto.add("Salve");

        System.out.println("O tamanho é do conjunto é : " + conjunto.size());

        conjunto.add("Salve"); // repetido : não soma
        conjunto.add('x');
        System.out.println("O tamanho é do conjunto é : " + conjunto.size());
        System.out.println(conjunto.remove('x'));
        System.out.println("O tamanho é do conjunto é : " + conjunto.size());
        System.out.println(conjunto.contains(5)); // verificar 

        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);

        conjunto.add(nums); // união 
        System.out.println("O tamanho é do conjunto é : " + conjunto.size());
        System.out.println(conjunto);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);

    }
    
}
