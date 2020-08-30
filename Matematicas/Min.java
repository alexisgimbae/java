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
public class Min {

    public int numeroMinimo;

    public void setNumeroMin(int num1, int num2) {
        this.numeroMinimo = Math.min(num2, num1); // recupera el num minimo
    }

    public int getNumeroMin() {
        return this.numeroMinimo;
    }

    @Override
    public String toString() {
        return "El Numero Minimo es:" + getNumeroMin();
    }

    public static void main(String[] args) {
        Min numero_min = new Min();
        numero_min.setNumeroMin(100, 89);
        numero_min.getNumeroMin();
        System.out.println(numero_min.toString());
    }
}
