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

public class Vaca extends Mamifero {
    private boolean daLeite;

    public Vaca(String n, int p, boolean t){
       super(n,p);
       setDaLeite(t);
    }
    ////////////////////////////////
    public boolean getDaLeite(){
        return this.daLeite;
    }

    public void setDaLeite(boolean t){
        this.daLeite = t;
    }
    ///////////////////////////////

    public void talk(){
        System.out.println("Puro leite é Mococa!");
    }
}
