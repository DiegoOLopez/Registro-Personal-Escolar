package com.mycompany.abstracto;

public class personalAdministracion extends Personas{
    String cargo, administracion;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAdministracion() {
        return administracion;
    }

    public void setAdministracion(String administracion) {
        this.administracion = administracion;
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
