package com.mycompany.abstracto;

public class Docente extends Personas{
    String materias, profesion;

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    @Override
    public int getSalario(){
       
        return salario;
    }
    
    @Override
    public void setSalario(int salario) {
        salario = salario*horasTrabajo*diasTrabajo;
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
