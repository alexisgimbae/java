/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.ArrayList;

/**
 *
 * @author agimenez
 */
public class MatrizList {

    public static void main(String args[]) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Bmw");
        cars.add("Mazda");
        cars.add("Suvaru");

        for (String car : cars) {
            System.out.println(car);
        }
//
//        cars.set(2, "Mercedes Benz"); // reescribir
//        System.out.println(cars.get(2)); // get acceder al indice
//        cars.remove(2);     // remove elemento
//        System.out.println(cars);

        int longitud_matriz = cars.size();
        for (int i = 0; i < longitud_matriz; i++) {
            System.out.println(cars.get(i));
        }

        int vueltas = 0;
        while (vueltas <= longitud_matriz) {
            vueltas += 1;
            System.out.println(cars);
        }

    }

}
