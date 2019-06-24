/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao_01e02;

/**
 *
 * @author Lara
 */
public class Cachorro extends Mamifero {
    private boolean late;
    //////////////////////////////////////////////
    public Cachorro(String n, int p, boolean l){
        super(n,p);
        setLate(l);
    }
    ///////////////////////////////////
    public void talk(){
        System.out.println("Au au");
    }
    ///////////////////////////
    public boolean getLate(){
        return this.late;
    }

    public void setLatealto(boolean l){
        this.lateAlto = l;
    }

    ///////////////////////////

}
