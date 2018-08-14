package modelado.cadenas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class CadenaTest {
    public CadenaTest() {}

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

    public testRepetidos(){
        Cadena cadena = new Cadena();
        System.out.println("Probando metodo para repetidos");
        String str = "hoooola";
        String cadena_correcta = "hola";
        Assert.assertTrue(cadena_correcta == cadena.repetidos(str,o));
        Assert.assertTrue(cadena_correcta == cadena.repetidos(str,a));
        str = "huee   huuue";
        cadena_correcta = "huehue";
        Assert.assertFalse(cadena.repetidos(str,e).matches("\\s+"));
        Assert.assertTrue(cadena.repetidos(str,u) == cadena_correcta);
        mark += 1;
        System.out.println("Repetidos funciona correctamente");
    }

}
