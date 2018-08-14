package modelado.cadenas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class CadenaTest {

    private Random intGenerator;
    private static float mark;

    public CadenaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        mark = 0;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("==============================");
        System.out.println("Metodos completados exitosamente: " + mark);
        System.out.println("==============================");
    }


    @Test
    public void testQuitaEspacios() {
        Cadena cadena = new Cadena();
        System.out.println("Probando metodo para quitar espacios");
        assertTrue(cadena.quitaEspacios("Hola").equals("Hola"));
        assertTrue(cadena.quitaEspacios("Ho la").equals("Hola"));
        assertTrue(cadena.quitaEspacios(" Hola ").equals("Hola"));
        assertTrue(cadena.quitaEspacios(" Ho la ").equals("Hola"));
        assertTrue(cadena.quitaEspacios("  Ho  la  ").equals("Hola"));
        mark += 1;
        System.out.println("Quita espacios funciona correctamente");
    }

}
