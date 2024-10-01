package com.mycompany.heeroe;

public class main {
    public static void main (String[] args){
    Heeroe heeroe = new Heeroe ("SuperHeeroe");
    
    for (int i = 0; i<30; i++){
    heeroe.avanzar();
    
    if (heeroe.getX()%10==0){
    heeroe.saltar();
    heeroe.aterrizar();
    }
    } 
    
    }
    
}
