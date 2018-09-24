/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import model.Circulo;
import model.Cuadrado;
import model.Forma;
import model.Rectangulo;

/**
 *
 * @author Cristhian
 */
public class Formas {

    private final Forma circulo;
    private final Forma cuadrado;
    private final Forma rectangulo;

    public Formas() {
        circulo = new Circulo();
        cuadrado = new Cuadrado();
        rectangulo = new Rectangulo();
    }

    public void dibujarCirculo() throws Exception {
        circulo.dibujar();
    }

    public void dibujarCuadro() throws Exception {
        cuadrado.dibujar();
    }

    public void dibujarRectangulo() throws Exception {
        rectangulo.dibujar();
    }
}
