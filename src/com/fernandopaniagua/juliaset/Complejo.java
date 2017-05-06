package com.fernandopaniagua.juliaset;

/**
 * Representa un número complejo y algunas de sus operaciones
 * 
 * @author Fernando Paniagua
 */
public class Complejo {
    public double real;//Parte real
    public double imaginaria;//Parte imaginaria
    
    /**
     * Constructor
     * 
     * @param real Parte real del nuevo número complejo
     * @param imaginaria Parte imaginaria del nuevo número complejo
     */
    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
    
    /**
     * Calcula y devuelve el módulo del número complejo
     * 
     * @return El módulo del número
     */
    public double getModulo(){
        //|z| = (x^2 + y^2)^(1/2)
        double modulo = Math.sqrt(Math.pow(real,2)+Math.pow(imaginaria,2));
        return modulo;
    }
    
    /**
     * Calcula y devuelve el cuadrado del número complejo
     * 
     * @return El cuadrado del número
     */
    public Complejo getCuadrado(){
        //(a+bi)^2= a^2-b^2 + 2*a*bi
        Complejo c;
        double real = Math.pow(this.real,2)-Math.pow(imaginaria,2);
        double imaginaria = 2*this.real*this.imaginaria;
        c = new Complejo(real, imaginaria);
        return c;
    }
    
    /**
     * Suma un número complejo al número
     * 
     * @param c Número complejo a sumar
     */
    public void suma(Complejo c){
        this.real = this.real + c.real;
        this.imaginaria = this.imaginaria + c.imaginaria;
    }
    
    @Override
    public String toString(){
        String texto = real + "," + imaginaria + "i";
        return texto;
    }
}
