/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest�o03;

/**
 *
 * @author Lara
 */

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito(){
        return this.valorCredito;
    }

    public double getValorDivida(){
        return this.valorDivida;
    }

    public void setValorCredito(double vc){
        this.valorCredito = vc;
    }

    public void setValorDivida(double vd){
        this.valorDivida = vd;
    }
    ///////////////////////////////////////////////
    public double obterSaldo(){
        double saldo;
        saldo = getValorCredito() - getValorDivida();
        return saldo;
    }
    ///////////////////////////////////////////////
    public Fornecedor(String n, String e, String t, double vc, double vd){
        super (n,e,t);
        setValorCredito(vc);
        setValorDivida(vd);
    }

}
