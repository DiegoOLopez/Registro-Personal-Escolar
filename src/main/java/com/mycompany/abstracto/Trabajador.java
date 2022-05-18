package com.mycompany.abstracto;

public abstract class Trabajador {
    private String nombreP;

    public Trabajador(String nombre)
    {
        this.nombreP=nombre;
    }

    public void darnombre(String nombre)
    {
        nombreP= nombre;
    }

    public String Establecernombre()
    {
        return nombreP;
    }


    // Este es un método abstracto
    abstract public float importeNomination();




}
