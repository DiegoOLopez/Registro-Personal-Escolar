package com.mycompany.abstracto;

public class personalIntendencia extends Personas{

        /*private double salario;

        public personalIntendencia(String nombre, double salario)
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
*/
        /**
         *
         * @return
         */
        /*@Override
        public float importeNomination()
        {
            return 10f * 104.55f;
        }*/

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
        salario = salario*diasTrabajo*horasTrabajo;
        return salario;
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