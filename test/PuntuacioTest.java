/**
 * Esta clase PuntuacioTest forma parque del paquete test
 */
package test;
/**
 * imports necesarios para esta clase
 */
import com.jaume.penjat.Puntuacio;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

/*public class PuntuacioTest {
    private Puntuacio puntuacio;
    private int number;
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,})
    void getParaulaSecretaDificultat(number);
    int resultat=0;
    switch(number)
    {
        case 1:number=1;
            resultat=5;
            break;
        case 2: number=2;
            resultat=2;
            break;
        case 3: number=3;
            resultat=3;
            break;
        default:;
        break;
    }*/
    //palarba acertado, dificultad 1, dificultad 2, dificultad 3.

/**
 * Este Test PuntuacioTest se utiliza para probar cosos de la clase Puntuacio
 * @author Amilcar Quinatoa
 * @version 1.2
 */
public class PuntuacioTest {
    /**
     * Un dato llamado puntuacio del tipo de dato Puntuacio que voy a usar en esta clase
     */
    private Puntuacio puntuacio;

    @BeforeEach
    /**
     * InitTest
     * <p>
     *     Este método me sirve para inicializar el atributo de esta clase
     *      * puntuacio con la clase Puntuacio
     * </p>
     */
    void initTest() {
        this.puntuacio = new Puntuacio();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 7})
    /**
     * getParaulaSecretaDificultat_dificultat
     * <p>
     *     Este método se utiliza para obtener la palabra secreta según el tipo de
     *     dificultad, para ello también necesita como parámetro difficulty.LLama
     *     a la clase puntuacio y su metodo getParaulaSecretaDificultat
     * </p>
     * @param difficulty un número que corresponde con el grado de dificultad.
     */
    void getParaulaSecretaDificultat_dificultat(int difficulty) {
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Un dato llamado tries del tipo de dato int
         */
        int tries = 0;
        /**
         * Este witch hace que según el grado de dificultad (1,2,3,7)
         * se le da un tries diferente.
         */
        switch (difficulty) {
            case 1:
                tries = 5;
                break;
            case 2:
                tries = 4;
                break;
            case 3:
                tries = 3;
                break;
            case 7:
                tries = -1;
                break;
            default:
                break;
        }
        /**
         * Si tries es menor de 0, da "err". sino Intents
         */
        if(tries < 0){
            assertEquals("err", this.puntuacio.getParaulaSecretaDificultat(difficulty)) ;
        }else{
            assertEquals(tries, this.puntuacio.getIntents());
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**
     * getParaulaSecretaDificultat_paraules
     * <p>
     *     Este método se emplea para verificar la palabra según el tipo de dificultad
     *     para ello necesita como parámetro difficulty. Dentro del método tiene un atributo cuyo valor
     *     se corresponde con el metodo getParaulaSecretaDificultat de la clase Puntuacio.
     * </p>
     * @param   difficulty un dato tipo int que corresponde con el grado de dificultad.
     */
    void getParaulaSecretaDificultat_paraules(int difficulty) {
        /**
         * Un dato randomWord de tipo String
         * <p>
         *     su valor se corresponde con el metodo getParaulaSecretaDificultat de la clase Puntuacio.
         * </p>
         */
        String randomWord = this.puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Este witch hace que según el grado de dificultad (1,2,3)
         * .asList devuelva una vista de lista del Array (Paraules1, Paraules2, Paraules3), una palabra
         * aleatoria
         */
        switch (difficulty) {
            case 1:
                assertTrue(Arrays.asList(this.puntuacio.getParaules1()).contains(randomWord));
                break;
            case 2:
                assertTrue(Arrays.asList(this.puntuacio.getParaules2()).contains(randomWord));
                break;
            case 3:
                assertTrue(Arrays.asList(this.puntuacio.getParaules3()).contains(randomWord));
                break;
            default:
                break;
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**getPuntuacioParaulaCorrecte
     * <p>
     *     Este método me devuelve la puntuación de la parabra Correcta.
     *     Tiene como parámetro difficulty. Dentro usa el valor del método
     *     getParaulaSecretaDificultat de la clase Puntuacio y actualiza el valor de
     *     Paraula con un String. Además tiene como atributo secretWord, una cadena
     *     del tipo de dato String[].
     * </p>
     * @param  difficulty un dato tipo int que corresponde con el grado de dificultad.
     * @throws  InterruptedException Cuando no.
     */
    void getPuntuacioParaulaCorrecte(int difficulty) throws InterruptedException {
        /**
         * llamo al método getParaulaSecretaDificultat de la clase Puntuacio.
         */
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Se actualiza el atributo paraula de la clase Puntuacio con el String "cicleidomastoide"
         */
        puntuacio.setParaula("cicleidomastoide");
        /**
         * Un dato secretWord de tipo String[]
         * <p>
         *     su valor se corresponde con una cadena de caracteres de tipo string, igual a cicleidomastoide.
         * </p>
         */
        String[] secretWord = {"c","i","c","l","e","i","d","o","m","a","s","t","o","i","d","e"};
        /**
         * Un dato score de tipo float para usar dentro de este metodo
         */
        float score = 0.0f;
        /**
         * Este witch hace que según el grado de dificultad (1,2,3)
         * el puntaje sea diferente
         */
        switch (difficulty) {
            case 1:
                score = 200.0f;
                break;
            case 2:
                score = 400.0f;
                break;
            case 3:
                score = 600.0f;
                break;
            default:
                break;
        }
        /**
         * se compara el valor del atributo puntaje/score con el valor que devuelve
         * el metodo calcularPuntuacio de la clase Puntuacio. Ambos son float.
         */
        assertEquals(score, puntuacio.calcularPuntuacio(secretWord, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**
     * getPuntuacioParaulaCorrecteTemps
     * <p>
     *     Este método prueba el tiempo según la dificultad, necesita como
     *     parametro difficulty.Dentro usa el valor que devuelve el método
     *     getParaulaSecretaDificultat de la clase Puntuacio y actualiza el valor de
     *     Paraula con un String. Además tiene como atributo secretWord, una cadena
     *     del tipo de dato String[].
     * </p>
     * @param  difficulty un dato tipo int que corresponde con el grado de dificultad.
     * @throws  InterruptedException Cuando no.
     */
    void getPuntuacioParaulaCorrecteTemps(int difficulty) throws InterruptedException {
        /**
         * llamo al método getParaulaSecretaDificultat de la clase Puntuacio.
         */
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Se actualiza el atributo paraula de la clase Puntuacio con el String "cicleidomastoide"
         */
        puntuacio.setParaula("cicleidomastoide");
        /**
         * atributo/dato llamado secretWord de tipo de dato String[]
         * <p>
         *     su valor se corresponde con una cadena de caracteres de tipo string, igual a cicleidomastoide.
         * </p>
         */
        String[] secretWord = {"c","i","c","l","e","i","d","o","m","a","s","t","o","i","d","e"};
        /**
         * Un dato/atributo llamado score de tipo de dato float para usar dentro de este método.
         */
        float score = 0.0f;
        /**
         * Este witch se utiliza para que según el grado de dificultad (1,2,3)
         * el puntaje sea diferente.
         */
        switch (difficulty) {
            case 1:
                score = 185.0f;
                break;
            case 2:
                score = 385.0f;
                break;
            case 3:
                score = 585.0f;
                break;
            default:
                break;
        }
        TimeUnit.SECONDS.sleep(15);
        /**
         * se compara el valor del atributo puntaje/score con el valor que devuelve
         * el metodo calcularPuntuacio de la clase Puntuacio. Ambos son float.
         */
        assertEquals(score, puntuacio.calcularPuntuacio(secretWord, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**
     * getPuntuacioParaulaIncorrecte
     * <p>
     *     Este método prueba la puntuación según la dificultad si la palabra es Incorrecta, emplea como
     *     parametro difficulty.Dentro usa el valor que devuelve el método
     *     getParaulaSecretaDificultat de la clase Puntuacio y actualiza el valor de
     *     Paraula con un String. Además tiene como atributo secretWord, una cadena
     *     del tipo de dato String[] donde algunas posiciones son nulas.
     * </p>
     * @param  difficulty un dato tipo int que corresponde con el grado de dificultad.
     * @throws  InterruptedException Cuando no.
     */
    void getPuntuacioParaulaIncorrecte(int difficulty) throws InterruptedException {
        /**
         * llamo al método getParaulaSecretaDificultat de la clase Puntuacio.
         */
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Se actualiza el atributo paraula de la clase Puntuacio con el String "periquito"
         */
        puntuacio.setParaula("periquito");
        /**
         * atributo/dato llamado secretWord de tipo de dato String[]
         * <p>
         *     su valor se corresponde con una cadena de caracteres de tipo string, igual a periquito.
         *     Donde algunas de su posiciones son null.
         * </p>
         */
        String[] secretWord = {"p", null, "r", null, "q",null,null,null,"o"};
        /**
         * Un dato/atributo llamado score de tipo de dato float para usar dentro de este método.
         */
        float score = 0.0f;
        /**
         * Este witch se utiliza para que según el grado de dificultad (1,2,3)
         * el puntaje sea diferente.
         */
        switch (difficulty) {
            case 1:
                score = 40.0f;
                break;
            case 2:
                score = 80.0f;
                break;
            case 3:
                score = 120.0f;
                break;
            default:
                break;
        }
        /**
         * se compara el valor del atributo puntaje/score con el valor que devuelve
         * el metodo calcularPuntuacio de la clase Puntuacio. Ambos son float.
         */
        assertEquals( score, puntuacio.calcularPuntuacio(secretWord, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**
     * getPuntuacioParaulaBuida
     * <p>
     *     Este método prueba la puntuación según la dificultad si la palabra es Incorrecta, emplea como
     *     parametro difficulty.Dentro usa el valor que devuelve el método
     *     getParaulaSecretaDificultat de la clase Puntuacio y actualiza el valor de
     *     Paraula con un String. Además tiene como atributo secretWord, una cadena
     *     del tipo de dato String[] donde todas sus posiciones son nulas.
     * </p>
     * @param  difficulty un dato tipo int que corresponde con el grado de dificultad.
     * @throws  InterruptedException Cuando no.
     */
    void getPuntuacioParaulaBuida(int difficulty) throws InterruptedException {
        /**
         * llamo al método getParaulaSecretaDificultat de la clase Puntuacio.
         */
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Se actualiza el atributo paraula de la clase Puntuacio con el String "porc"
         */
        puntuacio.setParaula("porc");
        /**
         * atributo/dato llamado secretWord de tipo de dato String[]
         * <p>
         *     donde todas las posiciones del String[] son nulas
         * </p>
         */
        String[] secretWord = {null, null, null, null};
        /**
         * Un dato/atributo llamado score de tipo de dato float para usar dentro de este método.
         */
        float score = 0.0f;
        /**
         * se compara el valor del atributo puntaje/score con el valor que devuelve
         * el metodo calcularPuntuacio de la clase Puntuacio. Ambos son float.
         */
        assertEquals( score, puntuacio.calcularPuntuacio(secretWord, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    /**
     * getPuntuacioParaulaCorrecteBonus
     * <p>
     *     Este método prueba la puntuación según la dificultad si la palabra es Incorrecta, emplea como
     *     parametro difficulty.Dentro usa el valor que devuelve el método
     *     getParaulaSecretaDificultat de la clase Puntuacio y actualiza el valor de
     *     Paraula con un String. Además tiene como atributo secretWord,es una cadena
     *     del tipo de dato String[] donde todas sus posiciones se corresponden con secretWord.
     * </p>
     * @param  difficulty un dato tipo int que corresponde con el grado de dificultad.
     * @throws  InterruptedException Cuando no.
     */
    void getPuntuacioParaulaCorrecteBonus(int difficulty) throws InterruptedException {
        /**
         * llamo al método getParaulaSecretaDificultat de la clase Puntuacio.
         */
        puntuacio.getParaulaSecretaDificultat(difficulty);
        /**
         * Se actualiza el atributo paraula de la clase Puntuacio con el String "escopinyes"
         */
        puntuacio.setParaula("escopinyes");
        /**
         * atributo/dato llamado secretWord de tipo de dato String[]
         * <p>
         *     donde todas las posiciones del String[] son caracteres individuales de escopinyes
         * </p>
         */
        String[] secretWord = {"e", "s", "c", "o", "p", "i", "n", "y", "e", "s"};
        /**
         * Un dato/atributo llamado score de tipo de dato float para usar dentro de este método.
         */
        float score = 0.0f;
        /**
         * Este witch se utiliza para que según el grado de dificultad (1,2,3)
         * el puntaje sea diferente.
         */
        switch (difficulty) {
            case 1:
                score = 210.0f;
                break;
            case 2:
                score = 410.0f;
                break;
            case 3:
                score = 610.0f;
                break;
            default:
                break;
        }
        /**
         * se compara el valor del atributo puntaje/score con el valor que devuelve
         * el metodo calcularPuntuacio de la clase Puntuacio. Ambos son float.
         */
        assertEquals( score, puntuacio.calcularPuntuacio(secretWord, 1));
    }

}
