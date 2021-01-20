/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vagrant
 */
public class Date {

    public static void main(String[] args) {

        // Fecha actual
        LocalDate localDate = LocalDate.now();
        System.out.println("La fecha actual es:\t" + localDate);

        // Hora actual
        LocalTime time = LocalTime.now();
        System.out.println("La hora actual es:\t" + time);

        // Fecha mas hora actual
        LocalDateTime lDateTime = LocalDateTime.now();
        System.out.println("La fecha mas hora actual es:\t" + lDateTime);

        // Fecha formateada con hora
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter fechaHoraFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        String fechaHoraFormateada = fechaHora.format(fechaHoraFormat);
        System.out.println("La fecha y hora formateada es:\t" + fechaHoraFormateada);

    }

}
