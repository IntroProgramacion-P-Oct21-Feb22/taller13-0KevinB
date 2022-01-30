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
public class Ejercicio02 {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            double promedio;
            double suma = 0;
            int numeroCalificaciones = 4;
            int i = 1;
            while (i <= 4) {
                System.out.println("Ingrese calificación: ");
                calificacion = entrada.nextDouble();
                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("Su calificaciobn debe estar entre 0 y 10");
                }
                suma = suma + calificacion;
                i = i + 1;
            }

            promedio = suma / numeroCalificaciones;

            System.out.printf("Su promedio es: %.2f\n", promedio);

        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);

        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}