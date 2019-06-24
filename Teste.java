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

public class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Maria Beatriz","Rua J, 225","0123-4567");
        Fornecedor f = new Fornecedor("Maria Fernanda","Rua K, 226","2345-6789",9900,456);
        Empregado e = new Empregado("Maria Laura","Rua L, 227","3456-7890","0003",2367,0.07);
        Administrador a = new Administrador("Maria Eduarda","Rua M", "228","4567-8901",3589,0.09,0.6);
        Operario o = new Operario("Maria Letícia","Rua N", "229","5678-9012",4501,0.83,3456,0.6);

        System.out.println("Fornecedor:");
        System.out.println("Saldo = R$"+f.obterSaldo());

        System.out.println("Empregado:");
        System.out.println("Salário = R$"+e.calcularSalario());

        System.out.println("Administrador:");
        System.out.println("Salário = R$"+a.calcularSalario());

        System.out.println("Operário:");
        System.out.println("Salário = R$"+o.calcularSalario());

    }
}
