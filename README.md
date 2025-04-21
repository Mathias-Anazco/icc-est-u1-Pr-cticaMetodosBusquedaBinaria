
# Práctica Metodos de Busqueda Binaria

## 📌 Información General

- **Título:** Práctica Metodos de Busqueda Binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Mathias Añazco
- **Fecha:** 20/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes algoritmos de ordenamiento en Java, incluyendo:
- Método Burbuja
- Método Binario

Se permite elegir:
- Cantidad de personas.
- Visualización de lista de personas.
- Visualización de busqueda y pasos para encontrar la edad elegida.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
Ingrese la cantidad de personas del listado: 
9

Ingrese el nombre de la persona  1: Pablo 
Ingrese la edad de la persona  1: 4

Ingrese el nombre de la persona  2: Maria
Ingrese la edad de la persona  2: 5

Ingrese el nombre de la persona  3: Juan
Ingrese la edad de la persona  3: 18

Ingrese el nombre de la persona  4: David
Ingrese la edad de la persona  4: 60

Ingrese el nombre de la persona  5: Mateo
Ingrese la edad de la persona  5: 25

Ingrese el nombre de la persona  6: Diego
Ingrese la edad de la persona  6: 12

Ingrese el nombre de la persona  7: Ana  
Ingrese la edad de la persona  7: 8

Ingrese el nombre de la persona  8: Alicia
Ingrese la edad de la persona  8: 9

Ingrese el nombre de la persona  9: Jaime
Ingrese la edad de la persona  9: 40

Lista ordenada por edad:
Persona [edad=4, nombre=Pablo]
Persona [edad=5, nombre=Maria]
Persona [edad=8, nombre=Ana]
Persona [edad=9, nombre=Alicia]
Persona [edad=12, nombre=Diego]
Persona [edad=18, nombre=Juan]
Persona [edad=25, nombre=Mateo]
Persona [edad=40, nombre=Jaime]
Persona [edad=60, nombre=David]

Ingrese la edad a buscar: 18
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60
inicio = 0, fin = 8, medio = 4, edadCentral = 12  --> BUSCAR A LA DERECHA
18 | 25 | 40 | 60
inicio = 5, fin = 8, medio = 6, edadCentral = 25  --> BUSCAR A LA IZQUIERDA
18
inicio = 5, fin = 5, medio = 5, edadCentral = 18  --> ENCONTRADO
La persona con edad 18 es: Juan
```

---

