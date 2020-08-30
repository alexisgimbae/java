/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

/**
 *
 * @author agimenez
 */
public class Matematica {

    public int numero1;
    public int numero2;
    public int resultado;

    public  Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int maxNumber() {
        this.resultado = Math.max(numero1, numero2);
        return resultado;
    }

    public String toString() {
        return "el numero maximo es:\t" + maxNumber();
    }
    public static void main(String[] args){
        Matematica matematica = new Matematica(21, 10);
        System.out.println(matematica);
    }
}
