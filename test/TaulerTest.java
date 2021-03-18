/**
 * Esta clase TaulerTest forma parque del paquete test
 */
package test;
/**
 * imports necesarios para esta clase
 */
import com.jaume.penjat.Tauler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase TaulerTest se utiliza para probar casos de la clase Tualer
 *  * @author Amilcar Quinatoa
 *  * @version 1.2
 *  */
class TaulerTest {
    /**
     * Un dato llamado tauler del tipo de dato Tauler que voy a usar en esta clase
     */
    private Tauler tauler;

    @BeforeEach

    /**
     * reiniciar
     * <p>
     *     Este método me sirve para inicializar mi atriburo tauler y llamar
     *     al metodo inicialitzarPartida de la clase Tauler
     * </p>
     */
    void reiniciar(){
        this.tauler = new Tauler();
        this.tauler.inicialitzarPartida("paraula", 4);
    }

    @Test
    /**
     * inicialitzarPartidaParaulaSecreta
     * <p>
     *     Este método me sirve comprobar que
     *     el char[] coincide con getParaulaSecreta de la
     *     clase Tauler que yo le he dado el valor paraula.
     * </p>
     */
    void inicialitzarPartidaParaulaSecreta() {
        assertArrayEquals(new char[]{'p', 'a', 'r', 'a', 'u', 'l', 'a'}, this.tauler.getParaulaSecreta());
    }

    @Test
    /**
     * inicialitzarPartidaNombreIntents
     * <p>
     *     Este método me sirve comprobar que
     *     el numero de intentos con los que empezado esta clase,
     *     coincide con el atributo intents de la clase tauler
     * </p>
     */
    void inicialitzarPartidaNombreIntents() {
        assertEquals(4, this.tauler.getIntents());
    }

    @Test
    /**
     * verificarEntradaIncorrecte
     * <p>
     *     Este método sirve para comprobar que el mensaje "letra incorrecta" coincide
     *     con lo que devuelve el metodo verificar de la clase Tauler
     * </p>
     */
    void verificarEntradaIncorrecte() {
        assertEquals("Lletra incorrecte",this.tauler.verificar("ll"));
    }

    @Test
    /**
     * verificarEntradaCorrecteEncertat
     * <p>
     *     Este método sirve para comprobar que es igual el String[] con la "a"
     *     que devuelve el metodo verificar de la clase Tau.er con el String[] del atributo
     *     palabraEndevinada de la clase Tauler.
     * </p>
     */
    void verificarEntradaCorrecteEncertat() {
        /**
         * se inicia el metodo verificar de la clase Tauler con el caracter "a" como parámetro.
         */
        this.tauler.verificar("a");
        assertArrayEquals(new String[]{ null,"a",null,"a",null,null,"a" },this.tauler.getPalabraEndevinada());
    }

    @Test
    /**
     * verificarEntradaCorrecteErrada
     * <p>
     *     Este método sirve comprobar que es igual el numero de intentos con el valor
     *     del atributo intents de la clase Tauler.
     * </p>
     */
    void verificarEntradaCorrecteErrada() {
        /**
         * se inicia el metodo verificar de la clase Tauler con el caracter "n" como parámetro.
         */
        this.tauler.verificar("n");
        assertEquals(3,this.tauler.getIntents());
    }

    @Test
    /**
     * imprimirCapEncert
     * <p>
     *     Este método sirve para comprobar que es igual el String con el String que devuelve
     *     el metodo imprimir() de la clase Tauler.
     * </p>
     */
    void imprimirCapEncert() {
        assertEquals("_______", this.tauler.imprimir());
    }

    @Test
    /**
     * imprimirAmbLletres
     * <p>
     *     Este método sirve para comprobar que es igual el String "_a_a__a" con el String que devuelve
     *      el metodo imprimir() de la clase Tauler.Para ello he llamado primero al
     *      metodo verificar de Tauler con el caracter "a".
     * </p>
     */
    void imprimirAmbLletres() {
        /**
         * se inicia el metodo verificar de la clase Tauler con el caracter "a" como parámetro.
         */
        this.tauler.verificar("a");
        assertEquals("_a_a__a", this.tauler.imprimir());
    }

    @Test
    /**
     * imprimirTotEncertat
     * <p>
     *     En este metodo llamdo al metodo verificar de la clase Tauler con
     *     distintos caracteres "a", "p","r","u","l". Comprueba que el String "paraula" es igual
     *     al String que devuelve el metodo imprimir de la clase Tauler.
     * </p>
     */
    void imprimirTotEncertat() {
        this.tauler.verificar("a");
        this.tauler.verificar("p");
        this.tauler.verificar("r");
        this.tauler.verificar("u");
        this.tauler.verificar("l");
        assertEquals("paraula", this.tauler.imprimir());
    }



    @Test
    /**
     * imprimirVidesPlural
     * <p>
     *     En este metodo llamdo al metodo verificar de la clase Tauler con
     *     distintos caracteres "n", "n","n" Comprueba que el String "Et queden 4 vides de 4" es igual
     *     al String que devuelve el metodo imprimirVides de la clase Tauler.
     * </p>
     */
    void imprimirVidesPlural() {
        assertEquals("Et queden 4 vides de 4", this.tauler.imprimirVides());
    }

    @Test
    /**
     * imprimirVidesSingular
     * <p>
     *     En este metodo llamdo al metodo verificar de la clase Tauler con
     *     distintos caracteres "n", "n","n" Comprueba que el String "Et queda 1 vida de 4" es igual
     *     al String que devuelve el metodo imprimirVides de la clase Tauler.
     * </p>
     */
    void imprimirVidesSingular() {
        this.tauler.verificar("n");
        this.tauler.verificar("n");
        this.tauler.verificar("n");
        assertEquals("Et queda 1 vida de 4", this.tauler.imprimirVides());
    }

    @Test
    /**
     * restarIntents
     * <p>
     *     En este metodo llamdo al metodo verificar de la clase Tauler con
     *     distintos caracteres "n". Comprueba que el int "3" es igual al atributo
     *     intents de la clase Tauler.
     * </p>
     */
    void restarIntents() {
        this.tauler.verificar("n");
        assertEquals(3, this.tauler.getIntents());
    }

    @Test
    /**
     * hasGuanyatTrue
     * <p>
     *     En este metodo llamdo al metodo verificar de la clase Tauler con
     *     distintos caracteres "a","p","r","u","l". Comprueba que si es correcto con lo que
     *     hace el metodo hasGuanyat de la clase Tauler.
     * </p>
     */
    void hasGuanyatTrue() {
        this.tauler.verificar("a");
        this.tauler.verificar("p");
        this.tauler.verificar("r");
        this.tauler.verificar("u");
        this.tauler.verificar("l");
        assertTrue(this.tauler.hasGuanyat());
    }

    @Test
    /**
     * hasGuanyatFalse
     * <p>
     *     Estre método comprueba que es false con lo que hace el metodo
     *     hasGuanyat de la clase Tauler.
     * </p>
     */
    void hasGuanyatFalse() {
        assertFalse(this.tauler.hasGuanyat());
    }
}