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

public class Papagaio extends Ave {
    private String frase;
    ///////////////////////
    public String getFrase(){
       return this.frase;
    }

    public void setFrase(String f){
        this.frase = f;
    }
    //////////////////////////////////////
    public Papagaio(String n, boolean v, String f){
        super(n,v);
        setFrase(f);
    }
    ////////////////////////////////////////
    public void talk(){
       System.out.println(getFrase());

    }

}
