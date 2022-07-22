/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioGobierno;
import p3.DominioOutlook;
import p3.DominioUTPL;
import p3.DominioYahoo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        
        DominioGobierno dom = new DominioGobierno();
        dom.establecerDominio("gobiernoec.gob");
        
        DominioOutlook dom2 = new DominioOutlook();
        dom2.establecerDominio("Outlook");
        
        DominioUTPL dom3 = new DominioUTPL();
        dom3.establecerDominio("utpl.edu.ec");
        
        DominioYahoo dom4 = new DominioYahoo();
        dom4.establecerDominio("Yahoo");
        
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        Correo c2 = new Correo();
        c2.establecerDominio(dom);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        
        Correo c3 = new Correo();
        c3.establecerDominio(dom2);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        
        Correo c4 = new Correo();
        c4.establecerDominio(dom3);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        
        Correo c5 = new Correo();
        c5.establecerDominio(dom4);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        
        lista.add(c);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
