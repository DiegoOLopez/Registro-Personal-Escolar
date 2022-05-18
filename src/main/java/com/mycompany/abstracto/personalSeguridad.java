package com.mycompany.abstracto;

public class personalSeguridad extends Personas {
    String areaTrabajo, rol;

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public int getSalario(){
        return salario*diasTrabajo*horasTrabajo;
    }
    
    @Override
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public int getDiasVacaciones(){
        return diasVacaciones;
    }
    
    @Override
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
}
