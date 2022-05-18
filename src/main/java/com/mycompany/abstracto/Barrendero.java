/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracto;

/**
 *
 * @author yo
 */
public class Barrendero extends Trabajador {
    
    private double salario;
    
    public Barrendero(String nombre, double salario)
    {
        super(nombre);
        establcerSalario(salario);
    }
    
    public void establcerSalario(double salario)
    {
            this.salario= salario < 0.0 ? 0.0 :salario;
    }
    
    public double salarioObten()
    {
            return this.salario;
    }

    /**
     *
     * @return
     */
    @Override
    public float importeNomination()
    { 
        return 10f * 104.55f;
    }
   
    
}
