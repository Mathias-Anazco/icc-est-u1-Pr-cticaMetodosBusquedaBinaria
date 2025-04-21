package controllers;

import models.Persona;

public class MetodoBinario {

    public static void buscarPersonaPorEdad(Persona[] listaPersonas, int edadObjetivo) {
        int inicio = 0;
        int fin = listaPersonas.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int edadCentral = listaPersonas[medio].getEdad();

            for (int i = inicio; i <= fin; i++) {
                System.out.print(listaPersonas[i].getEdad());
                if (i < fin) System.out.print(" | ");
            }
            System.out.println();

            System.out.print("inicio = " + inicio + ", fin = " + fin + ", medio = " + medio + ", edadCentral = " + edadCentral + "  ");

            if (edadCentral == edadObjetivo) {
                System.out.println("--> ENCONTRADO");
                System.out.println("La persona con edad " + edadObjetivo + " es: " + listaPersonas[medio].getNombre());
                return;
            } else if (edadCentral < edadObjetivo) {
                System.out.println("--> BUSCAR A LA DERECHA");
                inicio = medio + 1;
            } else {
                System.out.println("--> BUSCAR A LA IZQUIERDA");
                fin = medio - 1;
            }
        }

        System.out.println("No se encontró ninguna persona con la edad especificada.");
    }
}

