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

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public double getValorProducao(){
        return this.valorProducao;
    }

    public double getComissao(){
        return this.comissao;
    }

    public void setValorProducao(double vp){
        this.valorProducao = vp;
    }

    public void setComissao(double c){
        this.comissao = c;
    }

    public Operario(String n, String e, String t, String c,double s,double i, double vp, double co){
        super(n,e,t,c,s,i);
        setValorProducao(vp);
        setComissao(co);

    }

    public double calcularSalario(){
        double s = getSalarioBase() - ( getImposto() * getSalarioBase() ) + (this.getValorProducao() * (this.getComissao()/100));
        return s;
    }
}
