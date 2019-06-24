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

public class Ave extends Animal{
    private boolean voa;

    /////////////////////////
    public boolean getVoa(){
        return this.voa;
    }

    public void setVoa(boolean v){
        this.voa = v;
    }
   //////////////////////////////
   public boolean voa(boolean v){
       return true;
   }

   public void talk(String t){
       System.out.println("pia");
   }
   //////////////////////////////////
   public Ave(String n, boolean v){
       super (n);
       setVoa(v);
   }
}
