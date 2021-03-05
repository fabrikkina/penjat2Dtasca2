package test;

import com.jaume.penjat.Puntuacio;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PuntuacioTest {
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
    }
    //palarba acertado, dificultad 1, dificultad 2, dificultad 3.


}
