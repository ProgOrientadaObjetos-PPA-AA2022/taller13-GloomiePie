/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private MatriculaCampamento campamento;
    private MatriculaColegio colegio;
    private MatriculaEscuela escuela;
    private MatriculaJardin jardin;
    private MatriculaMaternal maternal;
    private MatriculaMaternal maternal2;

    public void establecerMatriculaCampamento(MatriculaCampamento c) {
        campamento = c;
    }

    public void establecerMatriculaColegio(MatriculaColegio c) {
        colegio = c;
    }

    public MatriculaCampamento obtenerMatriculaCampamento() {
        return campamento;
    }

    public MatriculaColegio obtenerMatriculaColegio() {
        return colegio;
    }

    public void establecerMatriculaEscuela(MatriculaEscuela c) {
        escuela = c;
    }

    public void establecerMatriculaJardin(MatriculaJardin c) {
        jardin = c;
    }

    public void establecerMatriculaMaternal(MatriculaMaternal c) {
        maternal = c;
    }

    public MatriculaEscuela obtenerMatriculaEscuela() {
        return escuela;
    }

    public MatriculaJardin obtenerMatriculaJardin() {
        return jardin;
    }

    public MatriculaMaternal obtenerMatriculaMaternal() {
        return maternal;
    }

    public void establecerPromedioTarifas() {
        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa()
                + obtenerMatriculaColegio().obtenerTarifa()
                + obtenerMatriculaEscuela().obtenerTarifa()
                + obtenerMatriculaJardin().obtenerTarifa() +
                obtenerMatriculaMaternal().obtenerTarifa()) / 5;

    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    /*@Override
    public String toString(){
    String cadena = String.format("MATRICULAS\n"
    + "Matricula campamento: %.2f\n"
    + "Matricula colegio: %.2f\n"
    + "MAtricula escuela: %.2f\n"
    + "Promedio: %.2f\n",
    campamento.obtenerTarifa(),
    colegio.obtenerTarifa(),
    promedioMatriculas);
    
    return cadena;
    }*/
}
