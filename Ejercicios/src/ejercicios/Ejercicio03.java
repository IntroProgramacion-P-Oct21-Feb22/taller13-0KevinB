/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            String nombre;

            int i = 1;
            while (i <= 4) {
                System.out.println("Ingrese calificación: ");
                calificacion = entrada.nextDouble();

                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("Su calificaciobn debe estar entre 0 y 10");
                }
                System.out.println("Ingrese nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                if (nombre.equals("Mario") || nombre.equals("Pedro")
                        || nombre.equals("Luis") || nombre.equals("Ana")
                        || nombre.equals("Carolina")) {
                    throw new Exception("Este nombre no es aceptado");
                }
                if (nombre.equals(nombre.toLowerCase())
                        || nombre.equals(nombre.toUpperCase())) {
                    throw new Exception("Ingrese el nombre con solo la primera "
                            + "letra en mayuscula");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }

            System.out.printf("%s\n", "Gracias por usar el sistema");
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
