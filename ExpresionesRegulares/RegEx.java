/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author agimenez
 */
public class RegEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Alexis", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Gimenez Alexis");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("La busqueda encontro el patron");
        } else {
            System.err.println("No se encontro el patron");
        }
    }

}
