package com.jaume.penjat;
/**
 * Esta clase Tauler tiene las distintas funciones o metodos del juego
 * @author Amilcar Quinatoa
 * @version 1.2
 */
public class Tauler {
    /**
     * Un atributo, dato llamado paraulaSecreta del tipo de dato char[], que
     * es la palabra secreta del juego
     */
    private char[] paraulaSecreta;
    /**
     * Un atributo, dato llamado palabraEndevinada del tipo de dato String[]
     * que es la palabra adivinada del juego
     */
    private String[] palabraEndevinada;
    /**
     * Un atributo, dato llamado intents del tipo de dato int que es el número de
     * intentos o vidas del juego
     */
    private int intents;
    /**
     * Un atributo, dato llamado totalIntents del tipo de dato int, es el total de vidas
     * o intentos que tiene el juego
     */
    private int totalIntents;

    /**
     * getParaulaSecreta
     * Un método/getter que recoge el valor del atributo paraulaSecreta
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene paraulaSecreta
     */
    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    /**
     * getIntents
     * Un método/getter que recoge el valor del atributo intents
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene intents
     */
    public int getIntents() {
        return intents;
    }

    /**
     * getTotalIntents
     * Un método/getter que recoge el valor del atributo totalIntents
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene totalIntents
     */
    public int getTotalIntents() {
        return totalIntents;
    }
    /**
     * getPalabraEndevinada
     * Un método/getter que recoge el valor del atributo palabraEndevinada
     * para usarse dentro de la clase o fuera de ella
     * @return el valor que tiene palabraEndevinada
     */
    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }
    /**
     * setPalabraEndevinada
     * Un método/setter que asigna el valor o actualiza  el valor del atributo palabraEndevinada
     * para usarse dentro de la clase o fuera de ella
     * @param palabraEndevinada que usa como parámetro dentro del setter
     */
    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }
    /**
     * setIntents
     * Un método/setter que asigna el valor o actualiza  el valor del atributo intents
     * para usarse dentro de la clase o fuera de ella
     * @param intents que usa como parámetro dentro del setter
     */
    public void setIntents(int intents) {
        this.intents = intents;
    }
    /**
     * setParaulaSecreta
     * Un método/setter que asigna el valor o actualiza  el valor del atributo paraulaSecreta
     * para usarse dentro de la clase o fuera de ella
     * @param paraulaSecreta que usa como parámetro dentro del setter
     */
    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }
    /**
     * setTotalIntents
     * Un método/setter que asigna el valor o actualiza  el valor del atributo totalIntents
     * para usarse dentro de la clase o fuera de ella
     * @param totalIntents que usa como parámetro dentro del setter
     */
    public void setTotalIntents(int totalIntents) {
        this.totalIntents = totalIntents;
    }

    /**
     * Tauler
     * <p>
     *     Este método/constructor que  dentro inicializa los atributos paraulaSecreta,
     *     palabraEndevinada y asigna el valor 0 a los atributos intents y totalIntents.
     * </p>
     */
    public Tauler() {
        paraulaSecreta = new char[0];
        palabraEndevinada = new String[0];
        intents = 0;
        totalIntents = 0;
    }
    /**
     * inicialitzarPartida
     * <p>
     *     Este método inicializa la partida, necesita como
     *     parámetro dos variables:p e i.
     * </p>
     * @param p un dato de tipo String.
     * @param i un dato de tipo int.
     */
    public void inicialitzarPartida(String p, int i){
        /**
         * Un dato llamado paraulaSecreta que inicializa una cadena
         * de tipo char[] de longitud según la variable p
         */
        paraulaSecreta = new char[p.length()];
        /**
         * Este for va desde que n=0 hasta que su longitud sea
         * menor que la variable p. Entonces el caracter del atributo
         * paraulaSecreta en la posición n, será igual al caracter de p en la
         * posición n.
         */
        for (int n = 0; n < p.length(); n++) {
            paraulaSecreta[n] = p.charAt(n) ;
        }
        /**
         * Un dato llamado palabraEndevinada que inicializa una cadena
         * de tipo String[] de longitud según la variable p
         */
        palabraEndevinada = new String[p.length()];
        /**
         * Este for va desde que n=0 hasta que su longitud sea
         * menor que la variable p. Dentro, si el caracter de p
         * en la posición n es estrictamente igual
         * a un carcter vacio, entonces el caracter del atributo
         * palabraEndevinada en la posición n, será igual a un caracter vacio.
         */
        for (int n = 0; n < p.length(); n++) {
            if(p.charAt(n) == new Character(' ')){
                palabraEndevinada[n] = " " ;
            }
        }
        /**
         * el atributo intents toma el valor del parametro i
         */
        intents = i;
        /**
         * el atributo totalIntents toma el valor del parametro i
         */
        totalIntents = i;

    }
    /**
     * imprimir
     * <p>
     *     Este método imprime un dato de tipo String.
     *     Dentro tiene una variable/atributo/dato propio que es
     *     result
     * </p>
     * @return result es el string que devuelve el método
     */
    public String imprimir() {
        /**
         * Un dato llamado result del tipo de dato String, que está vacio.
         */
        String result = "";
        /**
         * Este for recorre el atributo de la clase palabraEndevinada que es un
         * String[]. Si alguna posición es nula, entonces result se actualiza con
         * un caracter que guión bajo. Si es trictamente un caracter vario, entonces result
         * se actualiza con un espacio en blanco. Sino, finalmente result
         * es la palabraEndevinada según la posición i.
         *
         */
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                result = result+"_";
            }else if(palabraEndevinada[i] == " "){
                result = result+" ";
            }else {
                result = result+palabraEndevinada[i];
            }
        }
        return result;
    }
    /**
     * verificar
     * <p>
     *     Este método verifica que si la longitud de su variable como
     *     paramtro letra es mayor a 1 entonces devuelve "letra
     *     incorrecta". Sino recorre el String[] de paraulaSecreta
     *     si el caracter de la posición i de paraulaSecreta es igual al valor de
     *     la posición de la variable letra, entonces emplea el metodo restarIntent
     *     de la clase.
     * </p>
     * @param letra es un dato de tipo String
     * @return caracter vacio, de tipo String
     */
    public String verificar(String letra) {
        /**
         * Este if devuelve un mensaje String "letra incorrecta"
         * si la longitud de letra es mayor a 1.Sino recorre el String[] de paraulaSecreta
         *      *     si el caracter de la posición i de paraulaSecreta es igual al valor de
         *      *     la posición de la variable letra, entonces emplea el metodo restarIntent
         *      *     de la clase.
         */
        if(letra.length() > 1){
            return "Lletra incorrecte";
        }else{
            /**
             * Un dato llamado exist del tipo de dato boolean, que comienza
             * inicializado como false. se actualiza si las posiciones de paraulaSecreta
             * coinciden con las posiciones de letra.
             */
            boolean exist = false;
            /**
             * este for recorre el String[] paraulaSecreta. Si los caracteres en la
             * posición i de paraulaSecreta y letra coinciden, entonces exist=true.
             * Y palabraEndevinada[i] es =letra
             */
            for (int i = 0; i < paraulaSecreta.length; i++) {
                if (paraulaSecreta[i] == letra.charAt(0)) {
                    exist = true;
                    palabraEndevinada[i] = letra;
                }
            }
            /**
             * este if si exist es true entonces realiza el metodo de la
             * clase restarIntent
             */
            if(!exist){
                restarIntent();
            }
        }
        return"";
    }
    /**
     * imprimirVides
     * <p>
     *     Este método imprime la vidas, devuelve un mensaje String.
     *     Tiene un atributo llamado message de tipo String.
     * </p>
     * @return message es lo que devuelve el metodo, es un dato de tipo String.
     */
    public String imprimirVides(){
        /**
         * Un dato llamado message de tipo String. Tiene como formato un mensaje
         * junto con los valores de los atributos intents,totalIntents.
         */
        String message = String.format("Et queden %s vides de %s",intents, totalIntents);
        /**
         * Este if tiene manda un mensaje cuando los intentos solo queda 1.
         */
        if(intents == 1) message = String.format("Et queda %s vida de %s",intents, totalIntents);
        return message;
    }
    /**
     * restarIntent
     * <p>
     *     Este metodo resta los intentos. Dentro usa un this que es un set,
     *     que actualiza el numero de intentos, resta uno.
     * </p>
     *
     */
    public void restarIntent() {
        this.intents--;
    }
    /**
     * hasGuanyat
     * <p>
     *     Este metodo
     * </p>
     * @return valor es un booleano.
     */
    public boolean hasGuanyat() {
        /**
         * Un dato llamado valor de tipo boolean. Declarado e inicializado
         * como true.
         */
        boolean valor = true;
        /**
         * este for recorre el String[] palabraEndevinada
         * si la alguna posición de palabraEndevinada es nula, entonces
         * devuelve falso.
         */
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                return false;
            }
        }

        return valor;
    }

}
