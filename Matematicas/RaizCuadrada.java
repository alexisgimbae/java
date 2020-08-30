/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

/**
 *
 * @author agimenez
 * @version demo
 */
public class RaizCuadrada {

    public static double raiz = 0;

    /**
     *
     * @param int num
     */
    public static void setRaiz(int num) {
        raiz = Math.sqrt(num);
    }

    public static double getRaiz() {
        return raiz;
    }

    public static void main(String[] args) {
        RaizCuadrada.setRaiz(10);
        int raiz_cuadrada = (int) RaizCuadrada.getRaiz();
        System.out.println(raiz_cuadrada);
    }
}
