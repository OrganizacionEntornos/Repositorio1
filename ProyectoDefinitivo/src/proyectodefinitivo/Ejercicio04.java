/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodefinitivo;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class Ejercicio04 {

    public static void medias() {
        Scanner entrada = new Scanner(System.in);
        double programacion, lenguaje, base, entornos, sistemas, formacion, media;
        System.out.println("Por favor, introduzca la nota de Programación: ");
        programacion = entrada.nextDouble();
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        lenguaje = entrada.nextDouble();
        System.out.println("Introduzca la nota de Base de Datos: ");
        base = entrada.nextDouble();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextDouble();
        System.out.println("Introduzca la nota de Sistemas Informáticas: ");
        sistemas = entrada.nextDouble();
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        formacion = entrada.nextDouble();
        media = (programacion + lenguaje + base + entornos + sistemas + formacion) / 6;
        System.out.println("Su nota media del curso es de: " + media);
    }
}
