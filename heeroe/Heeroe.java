

package com.mycompany.heeroe;

class Heeroe {

    private int vida;
    private int x;
    private String nombre;
    private boolean saltando;
    
    
    public Heeroe(String nombre) {
    this.vida = 3;
    this.x = 0;
    this.nombre = nombre;
    this.saltando = false;
}
    
    public int getVida() {
    return vida;
}

public int getX() {
    return x;
}

public String getNombre() {
    return nombre;
}

public boolean getSaltando() {
    return saltando;
}
public void avanzar() {
    this.x++;

    if (this.x % 10 == 0) {
        System.out.println(this.nombre + ": ¡Debo saltar!");

        if (!saltando) {
            this.vida--;
            System.out.println(this.nombre + ": ¡Perdí una vida! Vidas restantes: " + this.vida);
        }
    }
}

public void saltar() {
    this.saltando = true;
    System.out.println(this.nombre + ": ¡He saltado!");
}

public void aterrizar() {
    this.saltando = false;
    System.out.println(this.nombre + ": ¡He aterrizado!");
}
    
}
