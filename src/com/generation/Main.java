package com.generation;

import java.util.Locale;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
	// Métodos en JAVA: Es un bloque de código reutilizable.
        /*
        String mensaje = saludar("Francisco.");
        System.out.println(mensaje);
        int resultado = suma(5,7);
        System.out.println(resultado);
        alert("Mensaje de prueba.");

        System.out.println(PI);
        double numero1 = 15.77;
        double numero2 = 9;

        System.out.println(Math.sqrt(numero2));
        */

        String mensaje1 = "Hola";
        String mensaje2 = "Cra!";

        // length nos devuelve el número de caracteres de un string.
        System.out.println(mensaje2.length());

        // equals compara dos strings y devuelve verdadero si son iguales.
        // equalsIgnoreCase compara dos strings sin importar si están escritas en mayúsculas o minúsculas.
        System.out.println(mensaje1.equals(mensaje2));

        System.out.println(mensaje1.toUpperCase());
    }

    public static String saludar(String nombre){

        return "¡Wassaaaaap!, " + nombre;
    }
    public static int suma(int numerone, int numertwo){
        return numerone + numertwo;
    }
    public static void alert(String mensaje){
        System.out.println(mensaje);
    }
}
