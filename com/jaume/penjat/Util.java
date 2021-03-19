package com.jaume.penjat;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase Util forma parque del paquete com.jaume.penjat
 */
public class Util {
    /**
     * makeQuestion
     * Un método estático que devuelve un String. Del enunciado o un error.
     * @param enunciat de tipo String
     * @return valor
     */
    public static String makeQuestion(String enunciat){
        /**
         * Un dato llamado valor que inicializa una cadena
         * de tipo String vacio.
         */
        String valor = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            System.out.print(enunciat+"  : ");
            valor = br.readLine();
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return valor;
        }
    /**
     * isNumeric
     * Un método estático que devuelve un booleano.
     * @param cadena de tipo String
     * @return un booleano
     */
    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

}
