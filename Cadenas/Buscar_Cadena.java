/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadenas;

/**
 *
 * @author agimez
 */
public class Buscar_Cadena {

    public static String filtro_cadena = "name";
    public String cadena;
    public int resultado;

    public Buscar_Cadena(String cadena) {
        this.cadena = cadena;
    }

    public void setResultado() {
        this.resultado = cadena.indexOf(filtro_cadena);
    }

    public int getResultado() {
        return resultado;
    }

    public String toString() {
        return "el caracter se encuentra en la posicion:\t" + getResultado();
    }

    public static void main(String[] args) {
        Buscar_Cadena buscar_Cadena = new Buscar_Cadena("ALEXIS YYYY name IS");
        buscar_Cadena.setResultado();
        System.out.println(buscar_Cadena);
    }

}
