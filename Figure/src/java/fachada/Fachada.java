/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 *
 * @author Cristhian
 */
public class Fachada {
    
    public static void main(String[] args) throws Exception {
        Formas  form= new Formas();
        form.dibujarCirculo();
        form.dibujarCuadro();
        form.dibujarRectangulo();
        
    }
}
