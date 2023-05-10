package org.pr2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Matematicas;
import org.junit.jupiter.api.Test;

public class PruebasMatematicas {

    @Test
    public void sumaEnterosTest(){
        assertEquals(2, Matematicas.sumaEnterosPositivos(1));
    }

    @Test
    public void sumaEnterosPositivosTest(){
        int resultado2 = Matematicas.sumaEnterosPositivos(1);
        assertEquals(1, resultado2);
    }
    @Test
    public void sumaEnterosPositivosTest2(){
        assertEquals(6, Matematicas.sumaEnterosPositivos(3));
    }


}
