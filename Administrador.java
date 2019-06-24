/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

/**
 *
 * @author Lara
 */

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double a){
        this.ajudaDeCusto = a;
    }

    public Administrador(String n, String e, String t, String c,double s,double i, double a){
        super(n,e,t,c,s,i);
        setAjudaDeCusto(a);
    }

    @Override
    public double calcularSalario(){
        double s = this.getSalarioBase() - ( this.getImposto() * this.getSalarioBase() )+ this.getAjudaDeCusto();
        return s;
    }


}
