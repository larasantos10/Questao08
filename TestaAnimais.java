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

public class TestaAnimais {
   public static void main(String [] args){

        Papagaio p = new Papagaio("Robin",true,"Lara Lara Lara");
        p.imprime();
        p.talk();

        Arara a = new Arara("Nana",true);
        a.imprime();
        a.talk();

        Cachorro c = new Cachorro("Tobbie",3,true);
        c.imprime();
        c.talk();

        Vaca v = new Vaca("Mococa",3,true);
        v.imprime();
        v.talk();

    }
}
