package org.example;
public class Matematicas {
    public static int sumaEnterosPositivos(int entero){
        return ((entero * (entero + 1)) / 2);
    }
    public static int factorialNumero(int a){
    if(a == 0 || a == 1){
        return 1;
    } else{
        return a * factorialNumero(a - 1);
    }
    }
    public static int potenciaNumero(int b, int c){
        if(c == 1){
            return b;
        } else if(c == 0){
            return 1;
        } else{
            return b * potenciaNumero(b, c - 1);
        }
    }
    public static int sumaElementosLista(int[] lista, int d){
        if(d == 0){
            return lista[0];
        } else{
            return lista[d] + sumaElementosLista(lista, d - 1);
        }

    }
    public static int mediaAritmeticaLista(int[] lista){
        return sumaElementosLista(lista, lista.length - 1) / 5;
    }

}
