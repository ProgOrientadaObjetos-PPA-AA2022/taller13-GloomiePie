/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        
        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        tipos.establecerMatriculaEscuela(mescuela);
        tipos.establecerMatriculaJardin(mjardin);
        tipos.establecerMatriculaMaternal(mmaternal);
        tipos.establecerMatriculaMaternal(mmaternal2);
        
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", mcamp);
        System.out.printf("%s\n", mcolegio);
        System.out.printf("%s\n", mescuela);
        System.out.printf("%s\n", mjardin);
        System.out.printf("%s\n", mmaternal);
        System.out.printf("%s\n", mmaternal2);
        System.out.printf("Promedio tarifas: %.2f\n", tipos.obtenerPromedioTarifas());
    }
}
