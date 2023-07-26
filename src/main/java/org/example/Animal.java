package org.example;

public class Animal {

    protected String nombre;
    protected String genero;
    protected double peso;
    protected Animal pareja;


    public Animal (String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }

    public Animal() {
    }
}
