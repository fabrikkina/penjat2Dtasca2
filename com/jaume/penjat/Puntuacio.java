
package com.jaume.penjat;

import java.util.Arrays;
import java.util.Random;

/**
 * Esta clase Puntuacio forma parque del paquete com.jaume.penjat sirve
 * para la puntuación del programa según la dificultad del juego.
 * @author Amilcar Quinatoa
 * @version 1.2
 */
public class Puntuacio {


    /**
     * Un atributo, dato llamado paraula del tipo de dato String.
     */
    private String paraula = "";
    /**
     * Un atributo, dato llamado dificultat del tipo de dato int.
     */
    private int dificultat = 0;
    /**
     * Un atributo, dato llamado intents del tipo de dato int.
     */
    private int intents = 0;
    /**
     * Un atributo, dato llamado inici del tipo de dato long.
     */
    private long inici;
    /**
     * Un atributo, dato llamado temps del tipo de dato float.
     */
    private float temps;
    /**
     * Un atributo, dato llamado paraules1 del tipo de dato String[].
     */
    private final String[] paraules1 = {"cargol","porc","aranya","patates","farina","nabiu","elefant"};
    /**
     * Un atributo, dato llamado paraules2 del tipo de dato String[].
     */
    private final String[] paraules2 = {"periquito", "peix espasa","nectarina", "peix daurat","xinxilla","armadillo","llenties"};
    /**
     * Un atributo, dato llamado paraules3 del tipo de dato String[].
     */
    private final String[] paraules3 = {"escombraries","escopinyes","engronxador","desnonament","malhauradament","malbaratament"};


    /**
     * Un atributo, dato llamado letresBonus del tipo de dato String[].
     */
    private final String[] letresBonus = {"x", "h", "y"};

    /**
     * getIntents
     * Un método/getter que recoge el valor del atributo intents
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo intents
     */
    public int getIntents() {
        return intents;
    }
    /**
     * getTemps
     * Un método/getter que recoge el valor del atributo temps
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo temps
     */
    public float getTemps() {
        return temps;
    }
    /**
     * getParaulaSecretaDificultat
     * <p>
     *     Este método devuelve paraula según el nivel de dificultad
     *     del juego, o bien del String[] paraules1, paraules2, paraules3.
     * </p>
     * @param dificultat un dato de tipo int.
     * @return paraula
     */
    public String getParaulaSecretaDificultat(int dificultat){
        /**
         * Un dato llamado paraula que tiene como valor "err"
         */
        paraula = "err";
        /**
         * se le asigna al atributo dificultat de la clase el valor
         * del parametro dificultat
         */
        this.dificultat = dificultat;
        /**
         * este if asigna un numero de intentos según la dificultad
         * del juego.
         */
        if(dificultat == 1){
            /**
             * un dato llamado rnd que inicializa un número random del String[]
             * paraules1
             */
            int rnd = new Random().nextInt(paraules1.length);
            /**
             * un dato llamado paraula tendrá el valor de la posición rnd del string[]
             * paraules1
             */
            paraula = paraules1[rnd];
            /**
             * se le asigna al atributo intents de la clase el valor
             * 5
             */
            this.intents = 5;
        }else if(dificultat == 2){
            /**
             * un dato llamado rnd que inicializa un número random del String[]
             * paraules2
             */
            int rnd = new Random().nextInt(paraules2.length);
            /**
             * un dato llamado paraula tendrá el valor de la posición rnd del string[]
             * paraules2
             */
            paraula = paraules2[rnd];
            /**
             * se le asigna al atributo intents de la clase el valor
             * 4
             */
            this.intents = 4;
        }else if(dificultat == 3){
            /**
             * un dato llamado rnd que inicializa un número random del String[]
             * paraules3
             */
            int rnd = new Random().nextInt(paraules3.length);
            /**
             * un dato llamado paraula tendrá el valor de la posición rnd del string[]
             * paraules3
             */
            paraula = paraules3[rnd];
            /**
             * se le asigna al atributo intents de la clase el valor
             * 3
             */
            this.intents = 3;
        }
        inici = System.currentTimeMillis();
        return paraula;
    }
    /**
     * calcularPuntuacio
     * <p>
     *     es un método que me devuelve la puntuación del juego, según
     *     la palarba adivinada y el numero de vidas
     * </p>
     * @param palabraEdivinada un dato de tipo String[]
     * @param vides un dato de tipo int
     * @return puntuacio
     */
    public float calcularPuntuacio(String[] palabraEdivinada, int vides){
        /**
         * Un dato llamado puntuacio de tipo float, que tiene como valor 0 de inicio
         */
        float puntuacio = 0;
        /**
         * Un dato llamado percentatge de tipo float, que tiene como valor 0f de inicio
         */
        float percentatge = 0f;
        /**
         * Un dato llamado fi de tipo long, que
         * tiene como valor la hora actual.
         */
        long fi = System.currentTimeMillis();
        /**
         * convierte el tiempo actual el milésimas a segundos, cuando
         * le resta el tiempo de inicio del juego
         */
        temps = (float) ((fi - inici)/1000);
        /**
         * este for recorre todas las posiciones
         * de String[] palabraEdivinada. Si la posición i de este
         * array es nula, entonces será igual esta posición a un
         * caracter vacio.
         */
        for (int i=0; i < palabraEdivinada.length; i++) {
            if(palabraEdivinada[i] == null) palabraEdivinada[i] = "";
        }
        String str = String.join("", palabraEdivinada);
        /**
         * este if va comparacdo que si es igual al valor del
         * atributo paraula la puntuación de 100, y el porcentaje varía según
         * la dificultad del juego.
         */
        if(str.equals(this.paraula)){
            puntuacio = 1000;
            switch(this.dificultat) {
                case 1:
                    percentatge = percentatge + 0.1f;
                    break;
                case 2:
                    percentatge = percentatge + 0.2f;
                    break;
                case 3:
                    percentatge = percentatge + 0.3f;
                    break;
                default:
            }
            if(stringContainsItemFromList(str,letresBonus)){
                percentatge = percentatge + 0.01f;
            }
            if(percentatge > 0){
                puntuacio = puntuacio * percentatge;
            }

            int puntXTemps = ((100 * this.dificultat) - (int)Math.round(temps));
            if(puntuacio > 0 || puntXTemps > 0){
                puntuacio = puntuacio + puntXTemps;
            }

        }else{
            puntuacio = (10 * this.dificultat) * str.length();
        }

        return puntuacio;
    }
    /**
     * stringContainsItemFromList
     * <p>
     *     devuelve un booleano
     * </p>
     * @param inputStr un dato de tipo String
     * @param items un dato de tipo String[]
     * @return un booleano
     */
    private boolean stringContainsItemFromList(String inputStr, String[] items) {
        return Arrays.stream(items).anyMatch(inputStr::contains);
    }

    //getters y setters
    /**
     * getParaula
     * Un método/getter que recoge el valor del atributo paraula
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo paraula
     */
    public String getParaula() {
        return paraula;
    }
    /**
     * setParaula
     * Un método/setter que asigna el valor o actualiza  el valor del atributo intents
     * para usarse dentro de la clase o fuera de ella
     * @param paraula que usa como parámetro dentro del setter, de tipo String.
     */
    public void setParaula(String paraula) {
        this.paraula = paraula;
    }
    /**
     * getParaules1
     * Un método/getter que recoge el valor del atributo paraules1
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo paraules1
     */
    public String[] getParaules1() {
        return paraules1;
    }
    /**
     * getParaules2
     * Un método/getter que recoge el valor del atributo paraules2
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo paraules2
     */
    public String[] getParaules2() {
        return paraules2;
    }
    /**
     * getParaules3
     * Un método/getter que recoge el valor del atributo paraules3
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene el atributo paraules3
     */
    public String[] getParaules3() {
        return paraules3;
    }
}
