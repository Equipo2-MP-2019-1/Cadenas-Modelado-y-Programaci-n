/*
 * Código utilizado para el curso de Estructuras de Datos.
 * Se permite consultarlo para fines didácticos en forma personal.
 */

package modelado.cadenas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

/**
 * Batería de pruebas unitarias para la clase <code>Vector</code>.
 * @author veronica
 */
public class CadenaTest {

    private Cadena cadena;
	
    public CadenaTest() {
        cadena = new Cadena();
    }

    
    
    public testPalindromo(){
	String palindromo = "anitalavalatina";
	Assert.assertTrue(cadena.palindromo(palindromo));
	
	palindromo = "Anitalavalatina";
	Assert.assertFalse(cadena.palindromo(palindromo));

	palindromo = " anitalavalatina";
	Assert.assertFalse(cadena.palindromo(palindromo));
    }

}
