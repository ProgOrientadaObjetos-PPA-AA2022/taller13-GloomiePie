/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author reroes
 */
public class DominioGobierno extends Dominio{
    @Override
    public void establecerDominio(String g){
        dominio = g;
    }
    @Override
    public String toString(){
        return String.format("%s", dominio);
    }
}
