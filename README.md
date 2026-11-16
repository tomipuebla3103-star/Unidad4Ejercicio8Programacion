<img width="414" height="240" alt="image" src="https://github.com/user-attachments/assets/f936efa1-048f-46b8-a9f7-6f43651255df" />

 Sistema de Impresión y Periféricos de Red

Descripción

Este proyecto consiste en desarrollar un sistema de administración de impresoras en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo, la herencia y la abstracción.

El sistema permite gestionar diferentes tipos de impresoras conectadas a un servidor de red, como impresoras láser, de inyección de tinta y matriciales, utilizando una estructura común.

Objetivo

Implementar un servidor de impresión capaz de administrar diferentes dispositivos y enviar documentos sin necesidad de conocer las características internas de cada impresora.

Clases utilizadas

Impresora: Clase abstracta que contiene los atributos modelo y nivelTinta, además del método abstracto imprimirDocumento(String documento).

ImpresoraLaser: Representa una impresora láser y realiza sus propias validaciones de consumibles.

ImpresoraTinta: Representa una impresora de inyección de tinta y controla el nivel de tinta disponible.

ImpresoraMatricial: Representa una impresora matricial y define sus propias condiciones de impresión.

ServidorImpresion: Clase encargada de administrar una lista de impresoras y enviar trabajos de impresión de manera polimórfica.

Main: Contiene el método principal, instancia las diferentes impresoras y demuestra el funcionamiento del servidor.

Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Encapsulamiento.

Colecciones de objetos.

Validaciones condicionales.

Funcionamiento

Se define la clase abstracta Impresora con los atributos y métodos generales.

Se crean las clases ImpresoraLaser, ImpresoraTinta e ImpresoraMatricial, cada una con su propia lógica de impresión.

Se implementan las validaciones necesarias para comprobar si cada dispositivo cuenta con los consumibles disponibles.

La clase ServidorImpresion administra una colección de impresoras.

Se agregan diferentes dispositivos al servidor y se envían documentos para imprimir.

Cada impresora procesa el trabajo según sus propias características mediante el polimorfismo.

Finalmente, se muestra por consola el resultado de cada trabajo y el estado operativo de los dispositivos.

Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

Resultado esperado

Al ejecutar el programa, el servidor podrá administrar diferentes tipos de impresoras y enviar documentos utilizando un mismo método. Cada dispositivo realizará su propia lógica de impresión y validará sus consumibles, mostrando por consola si el trabajo fue realizado correctamente.
