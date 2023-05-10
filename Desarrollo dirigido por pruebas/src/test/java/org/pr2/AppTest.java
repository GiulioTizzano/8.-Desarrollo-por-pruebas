package org.pr2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Matematicas;
import org.example.*;

public class AppTest{
@Test
    public void TestFactorial(){
        assertEquals(10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1, Matematicas.factorialNumero(10));
    }
@Test
    public void TestPotencia(){
    assertEquals(1024, Matematicas.potenciaNumero(2, 10));
}
@Test
    public void TestSumaElementosLista(){
    int[] lista = {1, 2, 3, 4, 5};
    assertEquals(1 + 2 + 3 + 4 + 5, Matematicas.sumaElementosLista(lista, 4));
}
@Test
    public void TestMediaAritmeticaLista(){
        int[] lista = {1, 2, 3, 4, 5};
        assertEquals(15 / 5, Matematicas.sumaElementosLista(lista, ));
    }
}