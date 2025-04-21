package controllers;

import models.Persona;

public class MetodoOrdenamiento {

    public static void MetodoBurbuja(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }

        System.out.println("\nLista ordenada por edad:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
