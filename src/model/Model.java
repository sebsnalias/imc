package model;

import view.View;
import javax.swing.JOptionPane;

public class Model {
    
    View view;
    
    private double peso;
    private double estatura;
    private double resultado;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double calcularimc(double peso, double estatura){
        resultado = peso / (estatura * estatura);       
        return resultado;
    }
}
