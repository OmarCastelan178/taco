/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.taco.operaciones.op;

/**
 *
 * @author GibsCat
 */
public class Operacion {

    /**
     * Encuentra la primera vocal interna dentro de una cadena de texto Busca y
     * devuelve la primera VOCAL que no sea la primera ni la última letra de la
     * cadena de carecteres
     *
     * @param text
     * @return La primera vocal interna encontrada, o 'X' si no se encuentra
     * ninguna.
     */
    public static char internalVocalLastName(String text) {
        for (int i = 1; i < text.length() - 1; i++) {
            char p = text.charAt(i);
            if ("aeiou".indexOf(p) != -1) {
                return p;
            }
        }
        return 'X';
    }
   
    
    /**
     * Este método toma una cadena de texto texto como entrada 
     * y busca la primera consonante que no sea la primera ni la
     * última letra de la cadena.
     * 
     * @param text
     * @return  Si encuentra una consonante interna, Si no encuentra ninguna devuelve 'X'
     */
    public static char internalConsonant(String text) {
        for (int i = 1; i < text.length() - 1; i++) {
            char k = text.charAt(i);
            if ("bcdfghjklmnñpqrstvwxyz".indexOf(k) != -1) {
                return k;
            }
        }
        return 'X';
    }

}
